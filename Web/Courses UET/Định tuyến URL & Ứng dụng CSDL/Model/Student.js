const { connection } = require('../Config/DB');

class Student {
    async getAllStudents() {
        return await connection.query("SELECT * FROM sinhvien")
    }
}

export default new Student