const studentRoute = require('./Student');

function route(app) {

    app.use('/students', studentRoute);

}

module.exports = route;
