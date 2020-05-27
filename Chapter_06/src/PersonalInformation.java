import java.util.Date;

public class PersonalInformation {
    //field
    private String  Address,
                    Name,
                    Phone;
    private int     Age;

    //constructor
    public PersonalInformation(String name, String address, int age, String phone) {
        Address = address;
        Name = name;
        Age = age;
        Phone = phone;
    }

     //default constructor
     public PersonalInformation(){
         Address = "";
         Name = "";
         Age = 0;
         Phone = "";

    }

    //accessor constructors
    public String getAddress(){
        return Address;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getPhone(){
        return Phone;
    }
}

