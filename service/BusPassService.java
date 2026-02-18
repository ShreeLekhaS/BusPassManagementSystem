package service;

import model.*;
import java.util.*;

public class BusPassService {

    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<Route> routes = new ArrayList<>();
    private ArrayList<BusPass> passes = new ArrayList<>();
    private ArrayList<Payment> payments = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void registerPassenger() {
        System.out.print("Passenger ID: ");
        int id = sc.nextInt(); sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt(); sc.nextLine();

        System.out.print("Gender: ");
        String gender = sc.nextLine();

        System.out.print("DOB: ");
        String dob = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Mobile: ");
        String mobile = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        passengers.add(new Passenger(id, name, age, gender, dob, address, mobile, email, category));
        System.out.println("Passenger registered successfully!");
    }

    public void addRoute() {
        System.out.print("Route ID: ");
        int id = sc.nextInt(); sc.nextLine();

        System.out.print("Route Name: ");
        String name = sc.nextLine();

        System.out.print("Source: ");
        String source = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        routes.add(new Route(id, name, source, destination));
        System.out.println("Route added!");
    }

    public void issuePass() {
        System.out.print("Pass ID: ");
        int passId = sc.nextInt();

        System.out.print("Passenger ID: ");
        int pid = sc.nextInt();

        for (BusPass p : passes) {
            if (p.getPassengerId() == pid && p.getPassStatus().equals("Active")) {
                System.out.println("Only one active pass allowed!");
                return;
            }
        }

        System.out.print("Route ID: ");
        int routeId = sc.nextInt(); sc.nextLine();

        System.out.print("Pass Type: ");
        String type = sc.nextLine();

        System.out.print("Issue Date: ");
        String issue = sc.nextLine();

        System.out.print("Expiry Date: ");
        String expiry = sc.nextLine();

        System.out.print("Validity (days): ");
        int validity = sc.nextInt();

        passes.add(new BusPass(passId, pid, routeId, type, issue, expiry, validity));
        System.out.println("Bus pass issued!");
    }

    public void makePayment() {
        System.out.print("Payment ID: ");
        int payId = sc.nextInt();

        System.out.print("Passenger ID: ");
        int pid = sc.nextInt();

        System.out.print("Amount: ");
        double amt = sc.nextDouble(); sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Mode: ");
        String mode = sc.nextLine();

        payments.add(new Payment(payId, pid, amt, date, mode));
        System.out.println("Payment successful!");
    }
}
