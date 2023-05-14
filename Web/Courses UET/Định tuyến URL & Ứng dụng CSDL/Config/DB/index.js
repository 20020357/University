const mysql = require('mysql');
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'anhtuanbui2002',
    database: 'student-courses'
})


function connect() {
    connection.connect((err) => {
        if (err) {
            console.log(err.message);
        }
        else console.log('Connect Successfully!!!');        
    });
}

module.exports = { connect, connection };
