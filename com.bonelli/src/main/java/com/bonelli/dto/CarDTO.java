package com.bonelli.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.Year;
// Data Transfer Object
@Data
@NoArgsConstructor
public class CarDTO
{
    @NotNull(message = "Id can't be null")
    private int carId;

    @NotEmpty(message = "Please provide your car company")
    private String carMake;

    @NotEmpty(message = "Please provide your car name")
    private String carName;

    @NotEmpty(message = "Please provide your car category")
    private String carType;

    @NotNull(message = "Car model means year of make")
    private int carModel;

    @Min(value = 1500000,message = "Please type the price in lakhs")
    private double carPrice;
}
