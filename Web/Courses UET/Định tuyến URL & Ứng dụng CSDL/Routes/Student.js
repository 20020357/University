const express = require('express');
const router = express.Router();

const studentController = require('../Controllers/StudentController');

router.use('/:slug', studentController.show);
router.use('/', studentController.index);

module.exports = router;