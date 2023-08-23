import React from 'react';
import {Link} from 'react-router-dom';

function Navbar() {
  return (
      <>
       <nav className='navbar navbar-dark bg-dark navbar-expand-lg'>
           <Link to="#" className='navbar-brand' > @Bonelli </Link>
              <div className='ml-auto'>
                <ul className='navbar-nav'>
                    <li className='nav-list'> <Link to='' className='nav-link'> Home </Link></li>
                    <li className='nav-list'> <Link to='' className='nav-link'> AddBooks </Link></li>
                    <li className='nav-list'> <Link to='' className='nav-link'> ViewBooks </Link></li>
                    <li className='nav-list'> <Link to='' className='nav-link'> UpdateBook </Link></li>
                    <li className='nav-list'> <Link to='' className='nav-link'> DeleteBook </Link></li>
                    <li className='nav-list'> <Link to='' className='nav-link'> AboutUs </Link></li>
                </ul>
              </div>
       </nav>
      </>
  )
}

export default Navbar