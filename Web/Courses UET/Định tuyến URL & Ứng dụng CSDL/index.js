const express = require('Express');
const route = require('./Routes');
const db = require('./Config/DB');

const app = express();
const port = 3000;

// Connect to DB
db.connect();

// Routes init
route(app);

app.listen(port, () => {
    console.log('Example app listening on port ', port);
});