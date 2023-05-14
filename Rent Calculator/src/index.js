//@ts-check
const express = require('express');
const { PrismaClient } = require('@prisma/client')
const port = 3000;

const app = express();
const db = new PrismaClient()

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.post('/', (req, res) => {
  res.send('Post request to homepage');
});

app.listen(port, async () => {
  let result = await db.user.findMany({
    where: {
      name: 'tuan anh',
    }
  });
  console.log(result);
  console.log(`Example app listening on port ${port}`);
});