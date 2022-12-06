package com.xworkz.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@AllArgsConstructor
public class SimDTO {

	private int id;
	private String type;
	private String operator;
	private long imeiNo;

}
