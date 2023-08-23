import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ViewBooks = () => {

  // object to store the data,
    const [cars,setCars] = useState([]);

  // to render page each time
    useEffect(()=> {getCarsdData()},[])

  // fetch the data from the database,
    let getCarsdData = async()=>{
        const result = await axios.get('http://localhost:96/getCars',{ maxRedirects: 0,});
        console.log(result.data)
    }



  return (
    <>
      <div className="container">
        <div className="py-4">
          <table className="table border shadow">
            <thead>
              <tr>
                <th scope="col">Serial No</th>
                <th scope="col">Car Id</th>
                <th scope="col">Company Name</th>
                <th scope="col">Car Name</th>
                <th scope="col">Car Type</th>
                <th scope="col">Car Model</th>
                <th scope="col">Car Price</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>12</td>
                <td>Ford</td>
                <td>Mustang</td>
                <td>SUV</td>
                <td>2028</td>
                <td>5000000</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
}
export default ViewBooks;