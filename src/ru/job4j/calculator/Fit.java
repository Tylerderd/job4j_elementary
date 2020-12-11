package ru.job4j.calculator;

//        Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//        Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

public class Fit {

    public static double manWeight(short height) {
        return (height-100)*1.15;
    }

    public static double womanWeight(short height) {
        return  (height-110)*1.15;
    }

    public static void main(String[] args) {
        short menHeight = 196;
        short womenHeight = 163;

        double man = Fit.manWeight(menHeight);
        double woman = Fit.manWeight(womenHeight);
        System.out.println("Perfect weight for man who is "+menHeight+" cm -  " + man);
        System.out.println("Perfect weight for woman who is "+womenHeight+" cm -  " + woman);

    }
}
