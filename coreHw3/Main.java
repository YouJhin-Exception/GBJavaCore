package coreHw3;

import coreHw3.abstracts.AEmployee;
import coreHw3.classes.CHeadDepartment;
import coreHw3.classes.COfficeEmployees;
import coreHw3.classes.comparators.CAgeSalaryComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AEmployee> officeEmployees = new ArrayList<>();
        officeEmployees.add(new COfficeEmployees("Rony","Radke",40,"worker",10000));
        officeEmployees.add(new COfficeEmployees("Gene","Gray",32,"worker",10000));
        officeEmployees.add(new COfficeEmployees("Rain","Paris",30,"worker",10000));

        officeEmployees.add(new CHeadDepartment("Ozzy","Osbourne",45,"headDepartment",55000));
        officeEmployees.add(new CHeadDepartment("Charles Francis","Xavier",55,"headDepartment",50000));


        for (AEmployee e:officeEmployees) {
            System.out.println(e.toString());
        }
        System.out.println();

        CHeadDepartment.changeSalary(officeEmployees,5000);


        for (AEmployee e:officeEmployees) {
            System.out.println(e.toString());
        }
        System.out.println();

        System.out.println("Сортировка по возрасту и заработной плате");
        System.out.println();

        officeEmployees.sort(new CAgeSalaryComparator());

        for (AEmployee e:officeEmployees) {
            System.out.println(e.toString());
        }


    }


}
