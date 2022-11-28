package com.xworkz.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.xworkz.bean.BusStop;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("created spring config constructor....");
	}

	@Bean
	public BusStop busStop() {
		BusStop bus = new BusStop();
		return bus;
	}

	@Bean
	// @Primary
	public String busStopName() {
		return "Mejestic";
	}

	@Bean
	public int noOfbus() {
		return 1500;
	}

	@Bean
	// @Primary
	public String busNo() {
		return "KA01RA2765";
	}

	@Bean
	public double price() {
		return 3500000.00;
	}

	@Bean
	public String name() {
		return "SDM";
	}

	@Bean
	public int noOfDoctors() {
		return 80;
	}

	@Bean
	public String founderName() {
		return "Virendra Hegde";
	}

	@Bean
	public int age() {
		return 56;
	}

	@Bean
	public String mallName() {
		return "lulu mall";
	}

	@Bean
	public int noOfShops() {
		return 110;
	}

	@Bean
	public String mallOwnerName() {
		return "DK shivakumar";
	}

	@Bean
	public int ownerAge() {
		return 58;
	}

	@Bean
	public String movieName() {
		return "kantara";
	}

	@Bean
	public double budget() {
		return 30.00;
	}

	@Bean
	public String directorName() {
		return "rishab shetty";
	}

	@Bean
	public int directorAge() {
		return 38;
	}

	@Bean
	public String schoolName() {
		return "adarsh School";
	}

	@Bean
	public int noOfStudents() {
		return 550;
	}

	@Bean
	public String studentName() {
		return "akash";
	}

	@Bean
	public int studentAge() {
		return 12;
	}

	@Bean
	public String gymName() {
		return "sky gym";
	}

	@Bean
	public int noOfGymItems() {
		return 45;
	}

	@Bean
	public String trainerName() {
		return "vikash";
	}

	@Bean
	public double trainerHeight() {
		return 5.11;
	}

	@Bean
	public String hotelName() {
		return "kamat";
	}

	@Bean
	public String type() {
		return "veg";
	}

	@Bean
	public String ownerName() {
		return "darshan";
	}

	@Bean
	public int hotelOwnerAge() {
		return 37;
	}

	@Bean
	public String pgName() {
		return "krishna";
	}

	@Bean
	public int noOfRooms() {
		return 30;
	}

	@Bean
	public String pgOwnerName() {
		return "Balu";
	}

	@Bean
	public int pgOwnerAge() {
		return 40;
	}

	@Bean
	public String stationName() {
		return "SRS hubli";
	}

	@Bean
	public int noOfPlatforms() {
		return 10;
	}

	@Bean
	public String trainName() {
		return "Hampi express";
	}

	@Bean
	public int trainCapacity() {
		return 2500;
	}

	@Bean
	public String mobileName() {
		return "vivoV5";
	}

	@Bean
	public int mobilePrice() {
		return 15000;
	}

	@Bean
	public String mobileCompany() {
		return "vivo";
	}

	@Bean
	public double mobileSize() {
		return 5.1;
	}

	@Bean
	public String barName() {
		return "swarnaloka";

	}

	@Bean
	public String address() {
		return "btm";
	}

	@Bean
	public String barOwnerName() {
		return "raghavendra";
	}

	@Bean
	public int barOwnerAge() {
		return 45;
	}

	@Bean
	public String metroName() {
		return "namma metro";
	}

	@Bean
	public int noOfWorkers() {
		return 1000;
	}

	@Bean
	public String metroColor() {
		return "green";
	}

	@Bean
	public int noOfStops() {
		return 23;
	}

	@Bean
	public String collegeName() {
		return "nalanda pu ccoolege";
	}

	@Bean
	public int noOfStudents1() {
		return 550;
	}

	@Bean
	public String principalName() {
		return "BC Nanjappa";
	}

	@Bean
	public String principalEducation() {
		return "MA";
	}

	@Bean
	public String companyName() {
		return "IBM";
	}

	@Bean
	public int noOfEmployees() {
		return 6000;
	}

	@Bean
	public String employeeName() {
		return "chidanand";
	}

	@Bean
	public int employeeAge() {
		return 25;
	}

	@Bean
	public int shopRent() {
		return 10000;
	}

	@Bean
	public String shopName() {
		return " Manjunath";
	}

	@Bean
	public String brand() {
		return "DXC";
	}

	@Bean
	public double dressPrice() {
		return 500.00;
	}

	@Bean
	public String bikeBrand() {
		return "Honda";
	}

	@Bean
	public double bikePrice() {
		return 80000.00;
	}

	@Bean
	public String colour() {
		return "Red";
	}

	@Bean
	public String ownerOfHonda() {
		return "Soichiro Honda";
	}

	@Bean
	public double entryFee() {
		return 1000.00;
	}

	@Bean
	public String pubName() {
		return "MRP";
	}

	@Bean
	public String pubOwnerName() {
		return "Mr.Sathish";

	}

	@Bean
	public double pubRent() {
		return 15000.00;
	}

	@Bean
	public String bookName() {
		return "One Day Life Will Change";
	}

	@Bean
	public int bookPrice() {
		return 150;
	}

	@Bean
	public String adress() {
		return "B.T.M 2nd Stage";
	}

	@Bean
	public String libraryName() {
		return "Central Library";
	}

	@Bean
	public int noOfHostelStudents() {
		return 1000;
	}

	@Bean
	public String hostelType() {
		return "BoysHostel";
	}

	@Bean
	public String wardenName() {
		return "Malatesh";
	}

	@Bean
	public int wardenAge() {
		return 25;
	}

	@Bean
	public String zooName() {
		return "International Zoo Mysuru ";
	}

	@Bean
	public Integer noOfAnimals() {
		return 100;
	}

	@Bean
	public String animalName() {
		return "Bear";
	}

	@Bean
	public Integer animalAge() {
		return 24;
	}

	@Bean
	public String gardenName() {
		return "MahathmaGandi Garden";
	}

	@Bean
	public Integer noOfChairs() {
		return 20;
	}

	@Bean
	public Integer noOfTrees() {
		return 30;
	}

	@Bean
	public String treeName() {
		return "Neemtree";
	}

	@Bean
	public int bloodPump() {
		return 60;
	}

	@Bean
	public String heartColour() {
		return "Red";
	}

	@Bean
	public String humanName() {
		return "Raghu";
	}

	@Bean
	public String humantype() {
		return "Boy";
	}

	@Bean
	public String bakeryName() {
		return "IyengarBakery";
	}

	@Bean
	public double rent() {
		return 8000.00;
	}

	@Bean
	public String sweetName() {
		return "DharwadPedha";
	}

	@Bean
	public Integer sweetPrice() {
		return 80;
	}

	@Bean
	public String marriageType() {
		return "lovemarriage";
	}

	@Bean
	public String marriagePlace() {
		return "hubli";
	}

	@Bean
	public String groomName() {
		return "Ramya";

	}

	@Bean
	public int groomAge() {
		return 28;
	}

	@Bean
	public String studentNames() {
		return "prajwal";
	}

	@Bean
	public double institutionFee() {
		return 30000.00;
	}

	@Bean
	public String institutionName() {
		return "XWORKZ";
	}

	@Bean
	public Integer institutionRent() {
		return 15000;
	}
}
