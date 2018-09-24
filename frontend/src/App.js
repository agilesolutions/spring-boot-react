import React, { Component } from 'react';
import './App.css';
import Login from './components/Login';
import PrimarySearchAppBar from './components/PrimarySearchAppBar';
import Toolbar from '@material-ui/core/Toolbar';

class App extends Component {
  render() {
    return (
      <div className="App">
      <PrimarySearchAppBar  position="static"/>  

        <Login />    
      </div>
    );
  }
}

export default App;
