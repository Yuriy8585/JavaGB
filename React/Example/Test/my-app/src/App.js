import React from 'react';
import {BrowserRouter, Route, Routes} from "react-router-dom"
import HomePage from './components/HomePage';
import Catalog from './components/Catalog';



const App = () => (
  
      
    <BrowserRouter>
      <Routes>
        {/* подстановочный путь */}
        
        <Route path="/" element={<HomePage />}/> 
        <Route path="/Catalog" element={<Catalog/>} />
      </Routes>
    </BrowserRouter>

  
);

export default App;
