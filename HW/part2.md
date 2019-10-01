Public abstract class Person {
public string name;
public string email;
public Address address;
}
Public class Address {
public string street;
public string postalcode;
public string city;

}
Public class Employee extends Person {
public class Subcontractor;
}
Public class Customer extends Person {
public Subcontractor;
public BankAccount bankAccount;
}
Public class Subcontractor {
}
Public class BankAccount{
public double number;
public string depositer;
public string bank;
}
Public class Company {
public string name;
public Address headquaters;
public Employee[] employee;
public Customer[] customer;
public VehicleRentalService[] service;
public Car[] car;

public Motorbike[] motorbike;
public Truck[] truck;
}
Public interface IRentable{
public void rent();
}
Public abstract class Vehicle implements IRentable{}
Public class Truck extends Vehicle{
public double weight;
public double power;
public string manufacturer;
public string regNo;
}
Public class Car extends Vehicle{
public Carkind[] kind;
public double noSeats;
public double power;
public string manufacturer;
public string regNo;
}
Public class Motorbike extends Vehicle{

public MbKind[] kind;
public double cylinderCap;
public double power;
public string manufacturer;
public string regNo;
}
Public abstract class Service{
public Customer[] customer;
}
Public class VehicleRentalService extends Service{
public Vehicle[] vehicle;
public void offerCar();
public void offerMotorbike();
public void offerTruck();
}
