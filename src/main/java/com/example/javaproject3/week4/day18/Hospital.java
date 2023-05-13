package com.example.javaproject3.week4.day18;

public class Hospital {
    String name;
    String websiteAddr;
    Address address;

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.address = address;
    }
}
