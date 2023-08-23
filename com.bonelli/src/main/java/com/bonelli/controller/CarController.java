package com.bonelli.controller;

import com.bonelli.dto.CarDTO;
import com.bonelli.dto.ResponseDTO;
import com.bonelli.modal.Car;
import com.bonelli.service.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/car")
@CrossOrigin("http://localhost:3000")
public class CarController
{
    // DI of the service object.,
    @Autowired
    private CarService carService;

        // API Generation,
        // 1. Post for inserting the data.,
        @PostMapping("/insertCar")
        public ResponseEntity<ResponseDTO> insertCar(@Valid @RequestBody CarDTO carDTO)
        {
            Car car = carService.insertCar(carDTO);
            ResponseDTO responseDTO = new ResponseDTO("Car details successfully saved into the table,",car);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        }

        // 2. Get for receiving the data
        @GetMapping("/getCar")
        public ResponseEntity<ResponseDTO> getCars()
        {
            List<Car> list = carService.getCars();
            ResponseDTO responseDTO = new ResponseDTO("Successfully found the cars,",list);
            return new ResponseEntity<>(responseDTO,HttpStatus.FOUND);
        }

        // 2.a Select by name,
        @GetMapping("/getCarByName/{carName}")
        public ResponseEntity<ResponseDTO> getCarByName(@PathVariable String carName)
        {
            Car car = carService.getCarByName(carName);
            ResponseDTO responseDTO = new ResponseDTO("Car found",car);
            return new ResponseEntity<>(responseDTO,HttpStatus.FOUND);
        }


        // 3. Put update the data.,
        @PutMapping("/updateCar/{id}")
        public ResponseEntity<ResponseDTO> updateCar(@RequestBody CarDTO carDTO, @PathVariable String id)
        {
            Car car = carService.updateCar(carDTO,id);
            ResponseDTO responseDTO = new ResponseDTO("Updated successfully,",car);
            return new ResponseEntity<>(responseDTO,HttpStatus.ACCEPTED);
        }

        // 4. Delete for deleting the record.,
        @DeleteMapping("/deleteCar/{id}")
        public ResponseEntity<ResponseDTO> deleteCar(@PathVariable String id)
        {
            carService.deleteById(id);
            ResponseDTO responseDTO = new ResponseDTO("Deleted successfully","Car with the id:"+id);
            return new ResponseEntity<>(responseDTO,HttpStatus.GONE);
        }

}
