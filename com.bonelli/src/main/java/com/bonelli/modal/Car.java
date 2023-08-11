package com.bonelli.modal;


import com.bonelli.dto.CarDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "Cars")
public class Car
{
    @Id
    private String id;
    private int carId;
    private String carMake;
    private String carName;
    private String carType;
    private Year carModel;
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
