package ContactManagementSystem;

public class Contacts {

    private String name;
    private String phoneNumber;

    Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: " + name + "," + " Phone number: " + phoneNumber;
    }

}
