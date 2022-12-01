const { createProxyMiddleware } = require('http-proxy-middleware');
module.exports = function(app) {
  app.use(
    '/api',
    createProxyMiddleware({
      target: 'https://abhinav-food.herokuapp.com',
      changeOrigin: true,
      secure: false
    })
  );
};