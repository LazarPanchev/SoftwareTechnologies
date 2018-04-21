const Sequelize = require('sequelize');

module.exports = function(sequelize){
    let Product=sequelize.define('Product', {
//         id – technology-dependent identifier (ObjectID for JavaScript, int for all other technologies)
//  priority – non-null integer
//  name – non-empty text
//  quantity – non-null integer
//  status – non-empty text (will either be “bought” or “not bought”).
        priority:{
            type: Sequelize.INTEGER,
            required: true,
            allowNull: false,

        },
        name:{
            type: Sequelize.TEXT,
            required: true,
            allowNull: false,
        },
        quantity:{
            type: Sequelize.INTEGER,
            required: true,
            allowNull: false,
        },
        status:{
            type: Sequelize.TEXT,
            allowNull: true,
        }

    },{
        timestamps: false
    });

    return Product;

};