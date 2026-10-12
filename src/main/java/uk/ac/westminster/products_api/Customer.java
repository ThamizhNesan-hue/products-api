package uk.ac.westminster.products_api;

public class Customer {
    private Long id;
    private String name;
    private double price;
    private Address address;

    public Customer(){
    }

    public Customer(Long id, String name, double price, Address address){
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Address getAddress() {
        return address;
    }
}
