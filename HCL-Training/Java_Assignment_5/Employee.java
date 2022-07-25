package com.hcl.assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	int empId;
	String empName;
	int empAge;
	String empGender;
	String empDept;
	int yearOfJoining;
	double empSalary;

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(123, "Chris", 25, "Male", "IT", 2020, 80000));
		employeeList.add(new Employee(124, "David", 22, "Male", "IT", 2019, 90000));
		employeeList.add(new Employee(125, "Mike", 39, "Male", "Maintenance", 2010, 120000));
		employeeList.add(new Employee(126, "Ashley", 27, "Female", "IT", 2019, 90000));
		employeeList.add(new Employee(127, "Jessica", 23, "Female", "HR", 2022, 70000));
		employeeList.add(new Employee(128, "Hasan", 28, "Male", "HR", 2017, 115000));
		employeeList.add(new Employee(129, "Christopher", 34, "Male", "IT", 2015, 140000));
		employeeList.add(new Employee(130, "Samantha", 39, "Female", "Management", 2011, 150000));
		employeeList.add(new Employee(131, "Michael", 45, "Male", "Management", 2008, 170000));
		employeeList.add(new Employee(132, "Jennifer", 31, "Female", "Maintenance", 2019, 90000));
		employeeList.add(new Employee(133, "Michelle", 43, "Female", "Management", 2022, 170000));
		employeeList.add(new Employee(134, "Steven", 28, "Male", "HR", 2018, 110000));

		// 1) How many male and female employees are there in this organization
		Map<String, Long> maleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpGender, Collectors.counting()));

		System.out.println("Number of male and female employees: " + maleAndFemaleEmployees);

		// 2) Find out the average age of me and female employees
		Map<String, Double> avgEmpAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpGender, Collectors.averagingInt(Employee::getEmpAge)));
		System.out.println("Average age of employees: " + avgEmpAge);
		// 3) Find the highest paid employee
		Optional<Employee> bestEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)));

		Employee bestEmployee = bestEmployeeWrapper.get();
		System.out.println("Highest Paid Employee: ");

		System.out.println("Employee ID : " + bestEmployee.getEmpId());

		System.out.println("Employee Name : " + bestEmployee.getEmpName());

		System.out.println("Employee Salary : " + bestEmployee.getEmpSalary());
		// 4) List all the names of the employees who has joined after 2015?
		System.out.println("Employees who joined after 2015:");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getEmpName)
				.forEach(System.out::println);
		// 5) Find out the senior most employee
		System.out.println("Most senior employees: ");
		employeeList.stream().filter(e -> e.getEmpAge() > 40).map(Employee::getEmpName).forEach(System.out::println);
		// 6) Count the number of employees in each department
		Map<String, List<Employee>> employeeListByDepartment=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpDept));
				         
				Set<Entry<String, List<Employee>>> entrySet3 = employeeListByDepartment.entrySet();
				         
				for (Entry<String, List<Employee>> entry : entrySet3) 
				{
				    System.out.println("--------------------------------------");
				             
				    System.out.println("Employees In "+entry.getKey() + " : ");
				             
				    System.out.println("--------------------------------------");
				             
				    List<Employee> list = entry.getValue();
				             
				    for (Employee e : list) 
				    {
				        System.out.println(e.getEmpName());
				    }
				}
		// 7) Find the male and female employees in the Maintenance department
		System.out.println("Number of employees in Maintenace department: ");
		Map<String, Long> countMaintenanceEmployees = employeeList.stream().filter(e -> e.getEmpDept() == "Maintenance")
				.collect(Collectors.groupingBy(Employee::getEmpGender, Collectors.counting()));

		System.out.println(countMaintenanceEmployees);
		// 8) Find the average salary of male and female employees
		System.out.println("Average salary of male and female employees: ");
		Map<String, Double> avgSalary = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getEmpGender, Collectors.averagingDouble(Employee::getEmpSalary)));

		System.out.println(avgSalary);

		// 9) Employees younger or equal to 30 years and older than 25 years
		Map<Boolean, List<Employee>> byEmpAge=
				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getEmpAge() > 25));
				         
				Set<Entry<Boolean, List<Employee>>> entrySet = byEmpAge.entrySet();
				         
				for (Entry<Boolean, List<Employee>> entry : entrySet) 
				{
				    System.out.println("----------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employees older than 25:");
				    }
				    else
				    {
				        System.out.println("Employees younger or equal to 30:");
				    }
				             
				    System.out.println("----------------------------");
				             
				    List<Employee> list = entry.getValue();
				             
				    for (Employee e : list) 
				    {
				        System.out.println(e.getEmpName());
				    }
				}
		// 10) List down the names of all employees in each department
		Map<String, List<Employee>> listByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpDept));

		Set<Entry<String, List<Employee>>> entrySet2 = listByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet2) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getEmpName());
			}
		}
	}

}
