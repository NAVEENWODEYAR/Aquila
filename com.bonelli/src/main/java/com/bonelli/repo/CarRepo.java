package com.bonelli.repo;

import com.bonelli.modal.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

//public interface CarRepo extends MongoRepository<Car,String>
public interface CarRepo extends JpaRepository<Car,Integer>
{
    @Query(value = "SELECT * FROM cars WHERE cars.carName=carName")
    Car findByName(String carName);

//    @Query(value = "SELECT * FROM cars ORDER BY cars.carName DESC")
//    List<Car> findByDescOrder();
}
