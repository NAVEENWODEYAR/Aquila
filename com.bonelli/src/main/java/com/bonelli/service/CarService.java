package com.bonelli.service;

import com.bonelli.dto.CarDTO;
import com.bonelli.exception.CarNotFoundException;
import com.bonelli.modal.Car;
import com.bonelli.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarService
{
    // DI of repo
    @Autowired
    private CarRepo carRepo;

        // CRUD operations.,
        // 1. insert values into the table,
        public Car insertCar(CarDTO carDTO)
        {
            Car car = new Car(carDTO);
            return carRepo.save(car);
        }

        // 2. Select * from table,
        public List<Car> getCars()
        {
            List<Car> list = carRepo.findAll();
            return list;
        }

        // 3. Select * fom table Where id = __
        public Optional<Car> getCar(int id)
        {
            Optional<Car> car = carRepo.findById(id);
                if(car.isPresent())
                {
                    return car;
                }
                else
                {
                    throw new CarNotFoundException("Sorry unable to find the car with the id,"+id);
                }
        }

        // 4. Delete the record by id
        public void deleteById(int id)
        {
            Optional<Car> car = carRepo.findById(id);
            if(car.isPresent())
            {
                carRepo.deleteById(id);
            }
            else
            {
                throw new CarNotFoundException("Sorry unable to delete," + id);
            }
        }

        // 5. update the record.,
        public Car updateCar(CarDTO carDTO,int id)
        {
            Car car = carRepo.findById(id).get();
                if(carRepo.findById(id).isPresent())
                {
                    car.setCarId(carDTO.getCarId());
                    car.setCarName(carDTO.getCarName());
                    car.setCarModel(carDTO.getCarModel());
                    car.setCarMake(carDTO.getCarMake());
                    car.setCarType(carDTO.getCarType());
                    car.setCarPrice(carDTO.getCarPrice());

                    return carRepo.save(car);
                }
                else
                {
                    throw new CarNotFoundException("Sorry wrong carId,"+id);
                }
        }

         // 6. Select by name
        public Car getCarByName(String carName)
        {
            Car car = carRepo.findByCarName(carName);
                if(carRepo.findByCarName(carName)==null)
                {
                    throw new CarNotFoundException("No such car with name in the database,"+carName);
                }
                else
                    return car;
        }

}
