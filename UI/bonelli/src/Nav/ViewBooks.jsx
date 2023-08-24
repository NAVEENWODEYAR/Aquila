import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ViewBooks = () => {

  // object to store the data,
  const [cars, setCars] = useState([]);

  // to render page each time
  useEffect(() => { getCarsdData() }, [])

  // fetch the data from the database,
  let getCarsdData = async () => {
    let result = await axios.get('http://localhost:9090/getBookData');    // ,{ maxRedirects: 0,}
    console.log(result.data);
    setCars(result.data)
  }



  return (
    <>
    <h1>{JSON.stringify(cars)}</h1>
      <div className="container">
        <div className="py-4">
          <table className="table border shadow">
            <thead>
              <tr>
                <th scope="col">Book Id</th>
                <th scope="col">Book Name</th>
                <th scope="col">Book Price</th>
                <th scope="col">Book Author</th>
                <th scope="col">Book Mail</th>
              </tr>
            </thead>
            <tbody>
              {cars.length > 0 ?
                <>
                  {
                    cars.map((car)=>{
                      return  <tr>
                                  <td>{car.bId}</td>
                                  <td>{car.bName}</td>
                                  <td>{car.bPrice}</td>
                                  <td>{car.bAuthor}</td>
                                  <td>{car.aMail}</td>
                                </tr>
                    })
                  }
                </> :
                <h2> No data in the database,</h2>
              }
             
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
}
export default ViewBooks;