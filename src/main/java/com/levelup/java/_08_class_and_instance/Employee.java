package com.levelup.java._08_class_and_instance;

public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Employee shallowCopy() {
        return new Employee(this.name, this.address);
    }

    public Employee deepCopy() {
        return new Employee(this.name, new Address(this.address.getStreet(), this.address.toString()));
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', address=" + address + "}";
    }

}
