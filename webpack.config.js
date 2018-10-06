const path = require('path');
const webpack = require('webpack');

// Webpack 2 config options:  https://webpack.js.org/configuration/
module.exports = {
  context: path.resolve(__dirname, "src/main"),
  entry: './js/App.js',
  output: {
    path: __dirname,
    filename: './src/main/resources/static/build/bundle.js'
  }
};
