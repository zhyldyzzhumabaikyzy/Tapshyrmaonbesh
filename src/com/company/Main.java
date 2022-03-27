package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Alan", "man");
        Programmer programmer = new Programmer("Сноуден", "программист", "FBR");
        Dancer dancer = new Dancer("Aigerim", "bely danser", "dansers");
        Singer singer = new Singer("Atabekov", "singer", "NONE ");

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);


    }
}
