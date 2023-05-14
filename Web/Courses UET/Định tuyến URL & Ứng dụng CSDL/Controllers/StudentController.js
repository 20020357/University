const { connection } = require("../Config/DB");

class StudentController {

    // [GET] /Students
    index(req, res) {
        connection.query("SELECT * FROM sinhvien", function (err, result) {
            if (err) throw err;
            
            res.json(result);
        });
    }

    // [GET] /Students/:slug
    show(req, res) {
        connection.query(`SELECT * FROM sinhvien WHERE masv=${req.params.slug}`, function (err, result) {
            if (err) throw err;
            
            res.json(result);     
        });

    }

}

module.exports = new StudentController;
