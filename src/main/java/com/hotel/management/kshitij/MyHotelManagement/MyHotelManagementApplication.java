package com.hotel.management.kshitij.MyHotelManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hotel.management.kshitij.controller")
public class MyHotelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHotelManagementApplication.class, args);
	}

}
