const Sequelize = require('sequelize');

module.exports = function(sequelize) {
    const Article = sequelize.define('Article', {
        title:{
            type: Sequelize.STRING,
            aloowNull: false,
            required: true
        },
        content: {
            type: Sequelize.TEXT,
            aloowNull:false,
            required: true
        },
        imageUrl: {
            type: Sequelize.STRING,
            aloowNull:false,
            required: true
        },
        summary: {
            type: Sequelize.TEXT,
            aloowNull:false,
            required: true
        },
        date: {
            type: Sequelize.DATE,
            aloowNull: false,
            required:true,
            defaultValue: Sequelize.NOW,
        },

    }, {
        timestamps: false
    });

    Article.associate = function (models) {
        Article.belongsTo(models.User, {
            foreignKey: 'authorId',
            targetKey: 'id'
        });
    };

    return Article;
};