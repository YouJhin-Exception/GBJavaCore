package coreHw3.classes;

import coreHw3.abstracts.AEmployee;

import java.util.List;

public class CHeadDepartment extends AEmployee{

    public CHeadDepartment(String firstName, String lastName, int age, String post, int salary) {
        super(firstName, lastName, age, post, salary);
    }

    public static void changeSalary(List<AEmployee> employees, int addedSalary){
        for (AEmployee employee : employees) {
            if (employee instanceof COfficeEmployees) { // можно еще || сравнение департаментов, чтоб начальник отдела назначал только своему отделу...
                employee.setSalary(((COfficeEmployees) employee).getSalary() + addedSalary);
            }
        }
    }
}
