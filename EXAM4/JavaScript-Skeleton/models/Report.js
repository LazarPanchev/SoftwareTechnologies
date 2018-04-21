const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Report = sequelize.define('Report', {
        status: {
            type: Sequelize.TEXT,
            allowNull: false,
        },
        message: {
            type: Sequelize.TEXT,
            allowNull: false,
        },
        origin: {
            type: Sequelize.TEXT,  //for float: Sequelize.DOUBLE
            allowNull: false,

        }
    },{
        timestamps: false
    });

    return Project;
};