package lesson3_3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Home home1 = new Home();
        home1.setYearStroit(2000);
        home1.setCountFloor(10);
        home1.setName("New");
        System.out.println(home1.getName() + " " + home1.getYearStroit() + " " + home1.getCountFloor());

        Home home2 = new Home();
        home2.setYearStroit(2019);
        home2.setCountFloor(16);
        home2.setName("Super New");
        System.out.println(home2.getName() + " " + home2.getYearStroit() + " " + home2.getCountFloor());

        Date d = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(d);
        int year = gc.get(gc.YEAR);
        System.out.println("Дому " + home1.getName() + " (лет) - " + home1.ageHome(year));
        System.out.println("Дому " + home2.getName() + " (лет) - " + home2.ageHome(year));
    }

}
