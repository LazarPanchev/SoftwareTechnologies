const Film = require('../models').Film;

module.exports = {
	index: (req, res) => {
        Film.findAll().then(films=>{  //films because in view index is each films
        	res.render("film/index", {"films": films});
		})
	},

	createGet: (req, res) => {
        res.render("film/create")
	},

	createPost: (req, res) => {
        let body=req.body;

        Film.create(body).then(()=>{
        	res.redirect("/");
			}).catch(err=> {   //catch here is not required
				console.log(err.message);
		})

	},

	editGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {

        	// 1. You can added all stuff to view like that
            /*
            	{
            		"id": id
            		"name": film.name,
                	"genre": film.genre,
                	"director": film.director,
                	"year": film.year,
                }
            */

            // 2. Or you can use method dataValues
            // film.dataValues

            res.render("film/edit", film.dataValues)
        }).catch(err => {
            console.log(err.message);
        })
    },

	editPost: (req, res) => {
        let id =req.params.id;
        let body = req.body;

        Film.findById(id).then(film =>{
        	film.updateAttributes(body).then(()=>{
        		res.redirect("/");
			})
		})
	},

	deleteGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {   //this way because in view delete is{{id}}, {{name}}, {{genre}}
        	res.render("film/delete", {"name": film.name,
			"genre": film.genre,
			"director": film.director,
			"year": film.year,
			"id": id}) //{{id}} in view/delete thats way
		}).catch(err=>{
			console.log(err.message);
		})
	},

	deletePost: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film =>{
        	film.destroy().then(() => {
        		res.redirect("/");
			})
		})
	}
};

