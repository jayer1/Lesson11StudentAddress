package com.company;

public class Student {

    private String name;
    private int age;
    
    private Address myAddress;
    

    public Student(Address myAddress, String name, int age) {
        //super(streetAddress, zipCode, state, phone);
        this.myAddress = myAddress;
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Delegate the call to the Address object that contains the zip code
    public String getStreetAddress(){
        return this.getStreetAddress();
    }
    
    public String getState(){
        return this.myAddress.getState();
    }
    
    public int getZipCode() {
        return this.myAddress.getZipCode();
    }
    
    public String getPhone() {
        return this.myAddress.getPhone();
    }


    
    
}
