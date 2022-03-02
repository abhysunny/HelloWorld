package com.abhysunny.simple;

public class Person {
    private String FirstName;
    private String LastName;

    public String FirstName() {
        return FirstName;
    }
    public String LastName() {
        return LastName;
    }

    public void setName(String newFirstName,String newLastName) {
        this.FirstName = newFirstName;
        this.LastName = newLastName;

    }

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.FirstName = "Abhy";  // error
        myObj.LastName = "Sunny";
        System.out.println(myObj.FirstName + myObj.LastName); // error
    }
}
