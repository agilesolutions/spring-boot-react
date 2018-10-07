import React, { Component } from 'react';
import './App.css';
import Login from './components/Login';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import PrimarySearchAppBar from './components/PrimarySearchAppBar';


class App extends Component {
  render() {
	console.debug('start rendering');
    return (
      <div className="App">
        <PrimarySearchAppBar position="static"/>
        <Login />    
      </div>
    );
  }
}

export default App;
