var express = require('express');
var router = express.Router()

router.use(express.json());

var bruteForceDetector = (req, res, next) => {
    let failedCount = req.body.failedCount;
    if (failedCount >= 5) next('route');
    next();
}

router.post('/auth', bruteForceDetector, (req, res, next) => {
    res.send('please authenticate');
});

router.post('/auth', (req, res, next) => {
    console.log('Email and/or password incorrect too many times');
    res.send('Email and/or password incorrect too many times');
});

module.exports = router;