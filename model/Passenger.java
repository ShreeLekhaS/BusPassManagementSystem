
package model;

public class Passenger {
    private int passengerId;
    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String mobileNumber;
    private String email;
    private String passengerCategory;

    public Passenger(int passengerId, String name, int age, String gender,
                     String dateOfBirth, String address,
                     String mobileNumber, String email, String passengerCategory) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.passengerCategory = passengerCategory;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getPassengerCategory() {
        return passengerCategory;
    }
}
