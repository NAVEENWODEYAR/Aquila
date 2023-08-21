package com.tawny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TawnyApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(TawnyApplication.class, args);
		System.out.println("Tawny Eagle");
	}

}
