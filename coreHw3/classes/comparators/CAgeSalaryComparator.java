package coreHw3.classes.comparators;

import coreHw3.abstracts.AEmployee;

import java.util.Comparator;

public class CAgeSalaryComparator implements Comparator<AEmployee> {
    public int compare(AEmployee emp1, AEmployee emp2) {
        int result = Integer.compare(emp1.getAge(), emp2.getAge());
        if (result == 0) {
                result = Double.compare(emp1.getSalary(), emp2.getSalary());
        }
        return result;
    }
}

