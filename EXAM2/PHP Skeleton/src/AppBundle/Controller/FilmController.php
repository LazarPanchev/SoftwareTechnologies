<?php

namespace AppBundle\Controller;

use AppBundle\Entity\Film;
use AppBundle\Form\FilmType;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Request;

class FilmController extends Controller
{
    /**
     * @param Request $request
     * @Route("/", name="index")
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function index(Request $request)
    {
        $films = $this->getDoctrine()->getRepository(Film::class)->findAll();

        return $this->render("film/index.html.twig", ["films" => $films]);  //because in view- is films

    }

    /**
     * @param Request $request
     * @Route("/create", name="create")
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function create(Request $request)
    {
        $film = new Film();

        $form = $this->createForm(FilmType::class, $film);
        $form->handleRequest($request);

        if($form->isSubmitted() && $form->isValid()){    //POST REQUEST
            $em = $this->getDoctrine()->getManager();
            $em->persist($film);
            $em->flush();

            return $this->redirect("/");
        }

        return $this->render("film/create.html.twig", ["form" => $form->createView()]); //Get Request
	}

    /**
     * @Route("/edit/{id}", name="edit")
     *
     * @param $id
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function edit($id, Request $request)
    {
        $film = $this->getDoctrine()->getRepository(Film::class)->find($id);

        $form=$this->createForm(FilmType::class, $film);
        $form->handleRequest($request);

        if($form->isSubmitted() && $form->isValid()){   //POST
            $em = $this->getDoctrine()->getManager();
            $em->merge($film);
            $em->flush();

            return $this->redirect("/");
        }

        return $this->render("film/edit.html.twig",   //GET
            ["form" =>$form->createView(), "film" => $film]);
    }

    /**
     * @Route("/delete/{id}", name="delete")
     *
     * @param $id
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function delete($id, Request $request)
    {
        $film = $this->getDoctrine()->getRepository(Film::class)->find($id);

        $form = $this->createForm(FilmType::class, $film);
        $form->handleRequest($request);

        if($form->isSubmitted() && $form->isValid()){
            $em = $this->getDoctrine()->getManager();
            $em->remove($film);
            $em->flush();
            return $this->redirect("/");
        }
        return $this->render("film/delete.html.twig", ["form" => $form->createView(),
            "film" => $film]);
    }
}
