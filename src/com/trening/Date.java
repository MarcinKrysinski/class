package com.trening;

public class Date {
    private int year;
    private int month;
    private int day;

    Date(){
        this.year = 1990;
        this.month = 8;
        this.day = 2;
    }

    Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
