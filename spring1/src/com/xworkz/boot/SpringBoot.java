package com.xworkz.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Bakery;
import com.xworkz.bean.Bar;
import com.xworkz.bean.Bike;
import com.xworkz.bean.BusStop;
import com.xworkz.bean.College;
import com.xworkz.bean.Company;
import com.xworkz.bean.Garden;
import com.xworkz.bean.Gym;
import com.xworkz.bean.Hospital;
import com.xworkz.bean.Hostel;
import com.xworkz.bean.Hotel;
import com.xworkz.bean.Human;
import com.xworkz.bean.Institution;
import com.xworkz.bean.Library;
import com.xworkz.bean.Mall;
import com.xworkz.bean.Marriage;
import com.xworkz.bean.Metro;
import com.xworkz.bean.Mobile;
import com.xworkz.bean.Movie;
import com.xworkz.bean.PG;
import com.xworkz.bean.Pub;
import com.xworkz.bean.RailwayStation;
import com.xworkz.bean.School;
import com.xworkz.bean.Shop;
import com.xworkz.bean.Zoo;
import com.xworkz.config.SpringConfig;

public class SpringBoot {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		System.out.println("------------------Busstop--------------------");

		BusStop bean = context.getBean(BusStop.class);
		System.out.println(bean.getBusStopName());
		System.out.println(bean.getNoOfbus());
		bean.display();

		System.out.println("----------------Hospital------------------");

		Hospital bean2 = context.getBean(Hospital.class);
		System.out.println(bean2.getName());
		System.out.println(bean2.getNoOfDoctors());
		bean2.dispaly();

		System.out.println("------------------mall--------------------");

		Mall bean3 = context.getBean(Mall.class);
		System.out.println(bean3.getMallName());
		System.out.println(bean3.getNoOfShops());
		bean3.dispaly();

		System.out.println("------------------Movie--------------------");

		Movie bean4 = context.getBean(Movie.class);
		System.out.println(bean4.getMovieName());
		System.out.println(bean4.getBudget());
		bean4.display();

		System.out.println("------------------School--------------------");

		School bean5 = context.getBean(School.class);
		System.out.println(bean5.getSchoolName());
		System.out.println(bean5.getNoOfStudents());
		bean5.diplay();

		System.out.println("------------------Gym--------------------");

		Gym bean6 = context.getBean(Gym.class);
		System.out.println(bean6.getGymName());
		System.out.println(bean6.getNoOfGymItems());
		bean6.display();

		System.out.println("------------------Hotel--------------------");

		Hotel bean7 = context.getBean(Hotel.class);
		System.out.println(bean7.getHotelName());
		System.out.println(bean7.getType());
		bean7.display();

		System.out.println("------------------PG--------------------");

		PG bean8 = context.getBean(PG.class);
		System.out.println(bean8.getPgName());
		System.out.println(bean8.getNoOfRooms());
		bean8.display();

		System.out.println("------------------RailwayStation--------------------");

		RailwayStation bean9 = context.getBean(RailwayStation.class);
		System.out.println(bean9.getStationName());
		System.out.println(bean9.getNoOfPlatforms());
		bean9.display();

		System.out.println("------------------Mobile--------------------");

		Mobile bean10 = context.getBean(Mobile.class);
		System.out.println(bean10.getMobileName());
		System.out.println(bean10.getMobilePrice());
		bean10.display();

		System.out.println("------------------Bar--------------------");

		Bar bean11 = context.getBean(Bar.class);
		System.out.println(bean11.getBarName());
		System.out.println(bean11.getAddress());
		bean11.display();

		System.out.println("------------------Metro--------------------");

		Metro bean12 = context.getBean(Metro.class);
		System.out.println(bean12.getMetroName());
		System.out.println(bean12.getNoOfWorkers());
		bean12.display();

		System.out.println("------------------College--------------------");

		College bean13 = context.getBean(College.class);
		System.out.println(bean13.getCollegeName());
		System.out.println(bean13.getNoOfStudents());
		bean13.display();

		System.out.println("------------------Company--------------------");

		Company bean14 = context.getBean(Company.class);
		System.out.println(bean14.getCompanyName());
		System.out.println(bean14.getNoOfEmployees());
		bean14.display();

		System.out.println("------------Shop---------------");
		Shop bean15 = context.getBean(Shop.class);
		System.out.println(bean15.getShopName());
		System.out.println(bean15.getShopRent());
		bean15.display();

		System.out.println("------------------Bike---------------------------------");
		Bike bean16 = context.getBean(Bike.class);
		System.out.println(bean16.getBikeBrand());
		System.out.println(bean16.getBikePrice());
		bean16.display();

		System.out.println("------------------Pub---------------------------------");

		Pub bean17 = context.getBean(Pub.class);
		System.out.println(bean17.getPubOwnerName());
		System.out.println(bean17.getPubRent());
		bean17.display();

		System.out.println("------------------Library------------------------");

		Library bean18 = context.getBean(Library.class);
		System.out.println(bean18.getAdress());
		System.out.println(bean18.getLibraryName());
		bean18.display();

		System.out.println("------------------Hostel------------------------");

		Hostel bean19 = context.getBean(Hostel.class);
		System.out.println(bean19.getNoOfStudents());
		System.out.println(bean19.getType());
		bean19.display();

		System.out.println("------------------Zoo------------------------");
		
		Zoo bean20 = context.getBean(Zoo.class);
		System.out.println(bean20.getZooName());
		System.out.println(bean20.getNoOfAnimals());
		bean20.display();

		System.out.println("------------------Garden------------------------");
		
		Garden bean21 = context.getBean(Garden.class);
		System.out.println(bean21.getGardenName());
		System.out.println(bean21.getNoOfChairs());
		bean21.display();

		System.out.println("------------------Human------------------------");
		
		Human bean22 = context.getBean(Human.class);
		System.out.println(bean22.getHumanName());
		System.out.println(bean22.getType());
		bean22.display();

		System.out.println("------------------Bakery------------------------");
		
		Bakery bean23 = context.getBean(Bakery.class);
		System.out.println(bean23.getBakeryName());
		System.out.println(bean23.getRent());
		bean23.display();

		System.out.println("------------------Marriage------------------------");
		
		Marriage bean24 = context.getBean(Marriage.class);
		System.out.println(bean24.getMarriagePlace());
		System.out.println(bean24.getMarriageType());
		bean24.display();

		System.out.println("------------------Institution------------------------");
		
		Institution bean25 = context.getBean(Institution.class);
		System.out.println(bean25.getInstitutionName());
		System.out.println(bean25.getInstitutionRent());
		bean25.display();

	}

}
