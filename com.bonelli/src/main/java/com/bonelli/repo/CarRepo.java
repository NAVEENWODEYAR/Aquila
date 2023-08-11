package com.bonelli.repo;

import com.bonelli.modal.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

//public interface CarRepo extends MongoRepository<Car,String>
public interface CarRepo extends JpaRepository<Car,Integer>
{
    /** @Query, custom queries.,
    @Query(value = "SELECT * FROM cars WHERE cars.carName=carName")
    Car findByName(String carName);
    */
}
