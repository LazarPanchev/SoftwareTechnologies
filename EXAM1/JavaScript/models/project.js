const Sequelize = require('sequelize');

module.exports = function (sequelize) {
   let Project = sequelize.define('Project', {  //define the model-name:Project or Film or other. Let or const
       title: {
           type: Sequelize.TEXT,
           allowNull: false,
       },
       description: {
           type: Sequelize.TEXT,
           allowNull: false,
       },
       budget: {
           type: Sequelize.INTEGER,  //for float: Sequelize.DOUBLE
           allowNull: false,

       }
   },{
       timestamps: false
   });

   return Project;
};