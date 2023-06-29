package lesson3_3;

import java.util.Date;

class Home {

    Integer countFloor;
    Integer yearStroit;
    String name;

    public Integer getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    public Integer getYearStroit() {
        return yearStroit;
    }

    public void setYearStroit(int yearStroit) {
        this.yearStroit = yearStroit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageHome(int year) {
        return year - yearStroit;
    }
}
