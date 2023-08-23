package com.bonelli.modal;


import com.bonelli.dto.CarDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
@Document
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private int carId;
    private String carMake;
    private String carName;
    private String carType;
    private int carModel;
    private double carPrice;

        public Car(CarDTO carDTO)
        {
            this.carId = carDTO.getCarId();
            this.carMake = carDTO.getCarMake();
            this.carName = carDTO.getCarName();
            this.carType = carDTO.getCarType();
            this.carModel = carDTO.getCarModel();
            this.carPrice = carDTO.getCarPrice();
        }
}
