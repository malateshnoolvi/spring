package com.xworkz.abstraction1.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.abstraction1.configuration.SpringConfig;
import com.xworkz.abstraction1.service.AgricultureServiceImpl;
import com.xworkz.abstraction1.service.AlcoholServiceImpl;
import com.xworkz.abstraction1.service.ArmyServiceImpl;
import com.xworkz.abstraction1.service.BikeServiceImpl;
import com.xworkz.abstraction1.service.CameraServiceImpl;
import com.xworkz.abstraction1.service.DistrictServiceImpl;
import com.xworkz.abstraction1.service.DoctorServiceImpl;
import com.xworkz.abstraction1.service.DriverServiceImpl;
import com.xworkz.abstraction1.service.FruitServiceImpl;
import com.xworkz.abstraction1.service.PenServiceImpl;
import com.xworkz.abstraction1.service.SallonServiceImpl;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AgricultureServiceImpl bean = context.getBean(AgricultureServiceImpl.class);
		System.out.println(bean.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		CameraServiceImpl bean2 = context.getBean(CameraServiceImpl.class);
		System.out.println(bean2.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		DriverServiceImpl bean3 = context.getBean(DriverServiceImpl.class);
		System.out.println(bean3.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		FruitServiceImpl bean4 = context.getBean(FruitServiceImpl.class);
		System.out.println(bean4.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		BikeServiceImpl bean5 = context.getBean(BikeServiceImpl.class);
		System.out.println(bean5.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		DoctorServiceImpl bean6 = context.getBean(DoctorServiceImpl.class);
		System.out.println(bean6.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		ArmyServiceImpl bean7 = context.getBean(ArmyServiceImpl.class);
		System.out.println(bean7.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		DistrictServiceImpl bean8 = context.getBean(DistrictServiceImpl.class);
		System.out.println(bean8.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		AlcoholServiceImpl bean9 = context.getBean(AlcoholServiceImpl.class);
		System.out.println(bean9.validateAndSave());
		System.out.println("------------------------------------------------------");
		PenServiceImpl bean10 = context.getBean(PenServiceImpl.class);
		System.out.println(bean10.validateAndSave(null));
		System.out.println("------------------------------------------------------");
		SallonServiceImpl bean11 = context.getBean(SallonServiceImpl.class);
		System.out.println(bean11.validateAndSave(null));
		System.out.println("------------------------------------------------------");

	}

}
