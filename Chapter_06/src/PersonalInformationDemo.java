import javax.swing.*;

public class PersonalInformationDemo {
    public static void main(String args[]){
        //call methods
        howManyTimes();
    }
    private static String getUserName(){
        return JOptionPane.showInputDialog
                ("What is your name? ");
    }
    private static String getUserAddress() {
        return JOptionPane.showInputDialog
                ("What is your address? ");
    }
    private static int getUserAge() {
        String input = JOptionPane.showInputDialog
                ("What is your age? ");
        return Integer.parseInt(input);
    }
    private static String getUserPhone() {
        return JOptionPane.showInputDialog
                ("What is your phone number? ");
    }
    private static void displayperson(PersonalInformation person){
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone() + "\n");

    }
    private static void howManyTimes(){
        String input = JOptionPane.showInputDialog
                ("How many people are you entering ?");
        int people = Integer.parseInt(input);
        int cntr = 0;
        do {
            String  address,
                    name,
                    phone;
            int     age;
           name = getUserName();
           age = getUserAge();
           address = getUserAddress();
           phone = getUserPhone();
            PersonalInformation person1 = new PersonalInformation
                    (name, address, age, phone);
            displayperson(person1);
            cntr ++;
        } while (cntr < people);
    }
}
