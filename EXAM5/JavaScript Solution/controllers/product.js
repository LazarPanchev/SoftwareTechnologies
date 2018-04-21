const Product = require('../models').Product;

module.exports = {
	index: (req, res) => {
		let entries=Product.findAll().then(entries=>{
			res.render("product/index", {'entries': entries})
		})

	},

	createGet: (req, res) => {
		res.render("product/create");

	},

	createPost: (req, res) => {
		let args = req.body;

		Product.create(args).then(()=>{
			res.redirect("/");
		})

	},

	editGet: (req, res) => {
		let id= req.params.id;

		Product.findById(id).then(entry=>{
			res.render("product/edit", entry.dataValues)
		})

	},

	editPost: (req, res) => {
		let id=req.params.id;
		let args=req.body;

		Product.findById(id).then(product=>{
			product.updateAttributes(args).then(()=>{
				res.redirect('/');
			})
		})

	},

    deleteGet: (req, res) => {
        let id= req.params.id;

        Product.findById(id).then(entry=>{
            res.render("product/delete", entry.dataValues)
        })

    },
    deletePost: (req, res) => {
        let id=req.params.id;

        Product.findById(id).then(product=>{
            product.destroy().then(()=>{
                res.redirect('/');
            })
        })

    }

};