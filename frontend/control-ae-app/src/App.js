import React from 'react';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Login from './pages/auth/Login';
import HomeAcudiente from './pages/HomeAcudiente';
import HomeAdmin from './pages/HomeAdmin';
import HomeDocente from './pages/HomeDocente';


 const App = () => {
   return (
      <Router>
        <Routes>
          <Route path="/" exact element={<Login/>} />          
          <Route path="/homeadmin" exact element={<HomeAdmin />} />
          <Route path="/homeacudiente" exact element={<HomeAcudiente />} />
          <Route path="/homedocente" exact element={<HomeDocente />} />          
        </Routes>
      </Router>
    );
 }
  
 export default App 
