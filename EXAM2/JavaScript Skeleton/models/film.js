const Sequelize = require('sequelize');
//           The Film entity holds 5 properties:
//  id – technology-dependent identifier (ObjectID for JavaScript, int for all other technologies)
//  name – non-empty text
//  genre – non-empty text
//  director – non-empty text
//  year – non-null integer

//id is not nessesary here
//Sequelize
module.exports = function(sequelize){
    const Film =sequelize.define("Film", {   //here is small sequelize for define the model
        name: {
            type:Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        genre: {
            type: Sequelize.TEXT,
            required:true,
            allowNull:false
        },
        director: {
            type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        year: {
            type: Sequelize.INTEGER,
            required: true,
            allowNull: false
        }

    },{
        timestamps: false
    });

    return Film;
};

// Remember to create dataBase by hand using HeidiSQL like in config/config.js;