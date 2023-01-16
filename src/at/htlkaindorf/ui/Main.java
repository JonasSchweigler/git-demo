package at.htlkaindorf.ui;

import at.htlkaindorf.beans.Person;

public class Main {
    public static void main(String[] args) {
        Person jan = new Person("Jan Fofnjka", 16);
        System.out.println("Name - Age");
        System.out.println(jan);
    }
}
