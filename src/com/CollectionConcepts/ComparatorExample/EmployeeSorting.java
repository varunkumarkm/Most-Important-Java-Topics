package com.CollectionConcepts.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
	
    public static void main(String[] args) {
    	
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Sunil",    "IT"));
        employees.add(new Employee(4, "Ajay",     "HR"));
        employees.add(new Employee(2, "Prashant", "IT"));
        employees.add(new Employee(1, "Laxman",   "HR"));
        employees.add(new Employee(5, "Rudra",    "Accounts"));

        // Sorting based on department and then by ID
//        Collections.sort(employees, Comparator
//                .comparing((Employee emp) -> emp.deptName)
//                .thenComparingInt(emp -> emp.empid));
//
//        // Print the sorted employees
//        for (Employee emp : employees) {
//            System.out.println(emp);
//            
//        //Print Using method referencing
//            employees.forEach(System.out::println);
//        }
        //Performing according to the name
//        Collections.sort(employees,(emp1, emp2)-> emp1.getName().compareTo(emp2.getName()));
//        employees.forEach(System.out::println);
        
        //Performing according to the salary
//          Collections.sort(employees,(emp1, emp2)->emp1.empid - emp2.getEmpid());
//          employees.forEach(System.out::println);
          
//          employees.stream().filter(n->n.getEmpid()>4).forEach(System.out::println);//Employee [empid=5, name=Rudra, deptName=Accounts]
//            List<String> collect = employees.stream().map(x->x.getDeptName()).collect(Collectors.toList());
//            System.out.println(collect);//[IT, HR, IT, HR, Accounts]
        
        //Average of empId
//              Double collectVal = employees.stream().collect(Collectors.averagingInt(e->e.getEmpid()));
//              System.out.println(collectVal);//3.0
        
        List<Integer> collectId = employees.stream().filter(emp->emp.getEmpid()<=2).map(emp->emp.getEmpid()+100).collect(Collectors.toList());
       System.out.println(collectId);
    }
 }







