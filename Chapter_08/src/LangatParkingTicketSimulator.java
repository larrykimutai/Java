/**
 Author: Larry Langat
 Date: October 24, 2018
 Purpose: simulate a police officer issuing parking ticket
          with the use of multiple classes.
 */
public class LangatParkingTicketSimulator {
    public static void main(String[] args){
        ParkedCar myCar = new ParkedCar("Toyota", "2010", "Silver", "VSD143", 35);
        PoliceOfficer police = new PoliceOfficer("John Doe", "34");
        ParkingTicket ticket = new ParkingTicket(myCar, police, 30);

        displaySimulator(myCar, ticket, police);
    }
    public static void displaySimulator(ParkedCar car, ParkingTicket ticket, PoliceOfficer police){
        System.out.println("A " + car.getColor() + " " + car.getYear() + " " + car.getMake() +
                " received a ticket of " + ticket.getFine() + " from Officer " + police.getName() +
                " with badge number " + police.getBadgeNumber());
    }
}
