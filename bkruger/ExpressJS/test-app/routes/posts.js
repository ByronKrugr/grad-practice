var express = require('express');
var router = express.Router()

var logsMethod = (req, res, next) => {
    console.log(req.method);
    next();
}

router.use(logsMethod);

router.post('/post', (req, res) => {
    console.log("create a new post.");
    res.send("created a new post");
});

router.get('/post/:id', (req, res) => {
    console.log("retrieve a post w/ specific id");
    res.send(`post w/ id = ${req.params.id}`)
});

module.exports = router