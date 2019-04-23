package com.company;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", 53186, "Wisconsin", "414-262-5555");
        Address address2 = new Address("2941 Downer Ave", 60506, "Iliinois", "404-454-1982");
        Student student1 = new Student(address1, "Sue Shoe", 23);
        Student student2 = new Student(address2, "Bob Fredrickson", 32);

      

        System.out.println(student1.getName() + " is from " + student1.getState());
        System.out.println(student2.getName() + " is from " + student2.getState());
    }
}
