package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 170;
        short womanHeight = 160;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Perfect weight for man who is " + manHeight + " cm -  " + man);
        System.out.println("Perfect weight for woman who is " + womanHeight + " cm -  " + woman);
    }
}
