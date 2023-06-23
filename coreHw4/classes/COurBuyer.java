package coreHw4.classes;

import coreHw4.abstracts.ABuyer;
import coreHw4.enums.Gender;

public class COurBuyer extends ABuyer {


    public COurBuyer(int id, String firstName, String lastName, int age, String phone, Gender gender) {
        super(id, firstName, lastName, age, phone, gender);
    }
}
