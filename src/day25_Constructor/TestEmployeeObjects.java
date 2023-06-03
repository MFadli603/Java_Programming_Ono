package day25_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

     Employee e1 = new Employee("Josh",32, 'M', "Developer", 190000, LocalDate.of(2022, 12, 21));

        System.out.println(e1);

        Employee e2 = new Employee("Mohammad", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));

        System.out.println(e2);

    }
}
