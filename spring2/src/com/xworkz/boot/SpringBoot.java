package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Ambulance;
import com.xworkz.beans.Court;
import com.xworkz.beans.Farmer;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Land;
import com.xworkz.beans.MRP;
import com.xworkz.springconfig.SpringConfig;

public class SpringBoot {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("---------------------------Hospital---------------------------");
		
		Hospital bean1 = context.getBean(Hospital.class);
		bean1.setSince(1973);
		System.out.println(bean1);

		System.out.println("-------------------------Land---------------------------------");
		Land bean = context.getBean(Land.class);
		bean.setSoilType("Black");
		System.out.println(bean);

		System.out.println("---------------------------Institute--------------------------");
		Institute bean2 = context.getBean(Institute.class);
		bean2.setProjecter(false);
		System.out.println(bean2);

		System.out.println("---------------------------Court------------------------------");

		Court bean3 = context.getBean(Court.class);
		bean3.setAdress("hubli");
		System.out.println(bean3);

		System.out.println("---------------------------MRP--------------------------------");

		MRP bean4 = context.getBean(MRP.class);
		bean4.setNoOfItems(45);
		System.out.println(bean4);

	}
}