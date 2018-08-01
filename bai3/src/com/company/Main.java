package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(11.3);
        rectangle1.setHeight(1000.0);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(11.3);
        rectangle2.setHeight(1000.0);
        //System.out.println(rectangle2.comparewidth(rectangle1));
        //System.out.println(rectangle2.compareArea(rectangle1));
        //System.out.println(rectangle2.compareWidthAndHeight(rectangle1));
        Employee employee1 = new Employee("Khang1", 20, 1200);
        Employee employee2 = new Employee("Khang2", 30, 1300);
        Employee employee3 = new Employee("Khang3", 25, 12600);
        Employee employee4 = new Employee("Khang4", 28, 1800);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println(employees);

        public static void main(String[] args)
    }
}
