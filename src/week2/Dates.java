package week2;

import java.util.Objects;

public class Dates {
    private int day;
    private int month;
    private int year;

    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return String.format("%d/%d/%d",day,month,year);
    }



    public boolean equals(Object o)
   {
        Dates dates = (Dates) o;
        return Objects.equals(year,dates.year) && Objects.equals(day,dates.day) && Objects.equals(month,dates.month);
    }




}
