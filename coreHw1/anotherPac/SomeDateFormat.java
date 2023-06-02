package coreHw1.anotherPac;

import java.text.DateFormat;
import java.util.Date;

public class SomeDateFormat {
    private final Date nowDate = new Date();

    public void getDateEng() {
        DateFormat eng = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locEngland);
        System.out.println("England Format: " + eng.format(nowDate));
    }

    public void getDateItalian() {
        DateFormat ita = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locItalian);
        System.out.println("Italian Format: " + ita.format(nowDate));
    }

    public void getDateRussian() {
        DateFormat rus = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locRussian);
        System.out.println("Russian Format: " + rus.format(nowDate));
    }

    public void getDateFrance() {
        DateFormat france = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locFrench);
        System.out.println("French Format: " + france.format(nowDate));
    }

    public void getDateSpanish() {
        DateFormat spa = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locSpanish);
        System.out.println("Spanish Format: " + spa.format(nowDate));
    }

    public void getDateChinese() {
        DateFormat china = DateFormat.getDateInstance(DateFormat.FULL, SomeLocal.locChinese);
        System.out.println("Chinese Format: " + china.format(nowDate));
    }
}
