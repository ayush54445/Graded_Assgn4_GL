package com.greatlearning.hello.Entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private double salary;
	private LocalDate dateOfJoining;

}
