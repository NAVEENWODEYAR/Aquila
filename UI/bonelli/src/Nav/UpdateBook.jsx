import React, { useEffect, useState } from 'react'
import axios from 'axios';
const UpdateBook = () => {

  // to store the data in 
  const[book,setBooks] = useState([]);

  // render the page each time,
  useEffect(()=> {},[]);

  // get the data from the databse.,
  let booksData = async () => {
        let result = await axios.get("http://localhost:96/getCars");
        console.log(result.data);
        setBooks(result.data);
  }


  return(
    <>

    </>
  )
}

export default UpdateBook