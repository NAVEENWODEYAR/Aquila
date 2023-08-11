package com.bonelli.repo;

import com.bonelli.modal.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepo extends MongoRepository<Car,String>
{

}
