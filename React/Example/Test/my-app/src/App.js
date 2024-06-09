import React from 'react';
import { BrowserRouter as Router, Routes, Link } from 'react-router-dom';
import HomePage from './components/HomePage';
import Catalog from './components/Catalog';



const App = () => (
  <Router>
    <div>
      <nav>
        <ul>
          <li>
            <Link to="/">Главная страница</Link>
          </li>
          <li>
            <Link to="/about">Каталог</Link>
          </li>
        </ul>
      </nav>

      <Routes exact path="/" component={HomePage} />
      <Routes path="/about" component={Catalog} />
      

    </div>
  </Router>
  
);

export default App;
