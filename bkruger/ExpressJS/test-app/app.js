var express = require('express')
var app = express()
var postsRouter = require('./routes/posts')
var adminRouter = require('./routes/admin')

app.all('/', (req, res, next) => {
        console.log(req.ip);
        next();
    }, (req, res) => {
        res.send('Welcome to the most basic blog you\'ll ever encounter!');
    });

app.use('/posts', postsRouter);
app.use('/admin', adminRouter);

app.listen(3000)

module.exports = app