package coreHw4.database;

import coreHw4.classes.COurBuyer;
import coreHw4.enums.Gender;

public class DBBuyers {
    public static COurBuyer[] ourBuyerBase = {new COurBuyer(1, "Ivan", "Petrov", 32, "+79283334455", Gender.MALE),
            new COurBuyer(2, "Magomed", "Ashokov", 40, "+79881127788", Gender.MALE),
            new COurBuyer(3, "Zlata", "Volk", 27, "+79189998800", Gender.FEMALE)};
}
