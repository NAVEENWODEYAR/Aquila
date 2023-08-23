import React from 'react';
import {BrowserRouter as Router,Routes,Route,Link} from 'react-router-dom';
import AddBook from './AddBook';
import ViewBooks from './ViewBooks';
import UpdateBook from './UpdateBook';
import DeleteBook from './DeleteBook';
import AboutUs from './AboutUs';

function Navbar() {
  return (
      <>
      <Router>
       <nav className='navbar navbar-dark bg-dark navbar-expand-lg'>
           <Link to="#" className='navbar-brand' > @Bonelli </Link>
              <div className='ml-auto'>
                <ul className='navbar-nav'>
                    <li className='nav-list'> <Link to='#' className='nav-link'> Home </Link></li>
                    <li className='nav-list'> <Link to='/AddBook' className='nav-link'> AddBooks </Link></li>
                    <li className='nav-list'> <Link to='ViewBook' className='nav-link'> ViewBooks </Link></li>
                    <li className='nav-list'> <Link to='UpdateBook' className='nav-link'> UpdateBook </Link></li>
                    <li className='nav-list'> <Link to='DeleteBook' className='nav-link'> DeleteBook </Link></li>
                    <li className='nav-list'> <Link to='AboutUs' className='nav-link'> AboutUs </Link></li>
                </ul>
              </div>
       </nav>

          <Routes>
            <Route path='/AddBook' element={<AddBook/>} />
            <Route path='/ViewBook' element={<ViewBooks/>} />
            <Route path='/UpdateBook' element={<UpdateBook/>} />
            <Route path='/DeleteBook' element={<DeleteBook/>} />
            <Route path='/AboutUs' element={<AboutUs/>} />
          </Routes>
        </Router>
      </>
  )
}

export default Navbar