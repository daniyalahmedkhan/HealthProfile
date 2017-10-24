package com.example.java;

/**
 * Created by Kashif on 10/24/2017.
 */
public class HealthProfile {

    String first_name;
    String last_name;
    String gender;
    double height;
    double weight;
    int day;
    int month;
    int year;
    double kilogram = 0.453592;
    double meter = 0.0254;

    public HealthProfile() {
    }

    public HealthProfile(String first_name, String last_name, String gender, double height, double weight, int day, int month, int year, double kilogram, double meter) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.day = day;
        this.month = month;
        this.year = year;
        this.kilogram = kilogram;
        this.meter = meter;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double getKilogram() {
        return kilogram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void Calculate(){

        int year = 2017;
        int age;
        int Max_hear_rate;
        double BMI;

        age = (year - this.year);
        System.out.println(this.first_name + " Age in Year: \t" + age);


        Max_hear_rate = (220 - age);
        System.out.println(this.first_name +" Max Heart Rate: \t" + Max_hear_rate);

        this.weight = (this.weight * kilogram);
        this.height = (this.height * meter);


        BMI =   (weight/height) / height;

        System.out.println(this.first_name + " Weight in Kilogram: \t" + weight);
        System.out.println( this.first_name + " Height in Meter: \t" + height);

        System.out.println(this.first_name +" Body Mass Index (BMI): \t" + BMI);





    }
}
