package Main;
import service.BusPassService;
import model.Admin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BusPassService service = new BusPassService();
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BUS PASS SYSTEM =====");
            System.out.println("1. Register Passenger");
            System.out.println("2. Add Route");
            System.out.println("3. Issue Bus Pass");
            System.out.println("4. Make Payment");
            System.out.println("5. Admin Login");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> service.registerPassenger();
                case 2 -> service.addRoute();
                case 3 -> service.issuePass();
                case 4 -> service.makePayment();
                case 5 -> {
                    sc.nextLine();
                    System.out.print("Admin Email: ");
                    String email = sc.nextLine();
                    System.out.print("Password: ");
                    String pwd = sc.nextLine();
                    System.out.println(admin.login(email, pwd)
                            ? "Admin login success"
                            : "Invalid admin credentials");
                }
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
