import React, { useEffect, useState } from 'react'
import axios from 'axios';
const UpdateBook = () => {

  // to store the data in 
  const[cars,setCars] = useState([]);

  // render the page each time,
  useEffect(()=> {},[]);

  // get the data from the databse.,
  let booksData = async () => {
        let result = await axios.get("http://localhost:96/getCars");
        console.log(result.data);
        setCars(result.data);
  }


  return(
    <>
        <div className="container" style={{marginTop:"20px"}}>
          <table className='table table-hover table-bordered'>
            <caption> LuxuRy Cars </caption>
            <thead className='thead-dark'>
              <tr>
                <th> Serial NO </th>
                <th> Car Id </th>
                <th> Car Company </th>
                <th> Car Name </th>
                <th> Car Type </th>
                <th> Car Model </th>
                <th> Car Price </th>
              </tr>
            </thead>
            <tbody>
              {
                cars.length >0 ?
                <>
                  {
                    cars.map((car)=> {
                      return <tr>
                                  <td>{car.carId}</td>
                                  <td>{car.carMake}</td>
                                  <td>{car.carName}</td>
                                  <td>{car.carType}</td>
                                  <td>{car.carModel}</td>
                                  <td>{car.carPrice}</td>
                      </tr>
                    })
                  }
                </>
                :<h2> No data found in the database </h2>
              }
            </tbody>
          </table>
        </div>
    </>
  )
}

export default UpdateBook