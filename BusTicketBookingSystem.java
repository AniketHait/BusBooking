
//     import java.util.Scanner;
//     public class BusTicketBookingSystem {
//     public static void main(String[] args) throws InvalidBookingException {
//         Scanner scanner = new Scanner(System.in);
//         BusBookingSystem busBookingSystem = new BusBookingSystem();
//         while (true) {
//             System.out.println("Welcome to ToyBus!");
//             System.out.println("1. Book a ticket");
//             System.out.println("2. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();
//             scanner.nextLine();
//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter source: ");
//                     String source = scanner.nextLine();
//                     System.out.print("Enter destination: ");
//                     String destination = scanner.nextLine();
//                     busBookingSystem.bookTicket(source, destination);
//                     break;
//                 case 2:
//                     System.out.println("Thank you for using ToyBus!");
//                     return;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//     }
// }
// interface BusBooking {
//     void bookTicket(String source, String destination) throws InvalidBookingException;
// }
// class BusBookingSystem implements BusBooking {
//     public static final String[] BUS_NAMES = {"Bus1", "Bus2", "Bus3"};
//     public static final int[] BUS_PRICES = {400, 450, 500};
//     @Override
//     public void bookTicket(String source, String destination) throws InvalidBookingException {
//         System.out.println("Available buses:");
//         for (int i = 0; i < BUS_NAMES.length; i++) {
//             System.out.println((i + 1) + ". " + BUS_NAMES[i] + " - Rs." + BUS_PRICES[i]);
//         }
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter bus number: ");
//         int busNumber = scanner.nextInt();
//         if (busNumber < 1 || busNumber > BUS_NAMES.length) {
//             throw new InvalidBookingException("Invalid bus number");
//         }
//         System.out.print("Enter name: ");
//         String name = scanner.next();
//         System.out.print("Enter age: ");
//         int age = scanner.nextInt();
//         scanner.nextLine();
//         System.out.print("Enter Booking Date: ");
//         String dateOfBooking = scanner.nextLine();`
//         System.out.println("Booking done for " + name + " (age " + age + ") on " + BUS_NAMES[busNumber - 1] +
//                 " from " + source + " to " + destination + " on " + dateOfBooking + ". Total fare: Rs." + BUS_PRICES[busNumber - 1]);
//     }
// }
// class InvalidBookingException extends Exception {
//     public InvalidBookingException(String message) {
//         super(message);
//     }
// }

//``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````package BusTicketBooking;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.function.Predicate;
interface BusBooking {
    void bookTicket(String source, String destination) throws InvalidBookingException;
}
class BusBookingSystem implements BusBooking {
    public static final String[] BUSES = {"Bus1", "Bus2", "Bus3"};
    public static final int[] BUSFARE = {100, 150, 200};
    Map<String,Integer> dict = new HashMap<>();
    @Override
    public void bookTicket(String source, String destination) throws InvalidBookingException {
        System.out.println("Available buses:");
        for (int i = 0; i < BUSES.length; i++) {
            System.out.println((i + 1) + ". " + BUSES[i] + " - Rs." + BUSFARE[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        int busNumber = sc.nextInt();
        if (busNumber < 1 || busNumber > BUSES.length) {
            throw new InvalidBookingException("Invalid bus number");
        }
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        dict.put(name,age);
        System.out.print("Enter the  date of booking: ");
        String dateOfBooking = sc.nextLine();
        for (String n: dict.keySet()){
            System.out.println("Booking done for " + n + " (age " + dict.get(n) + ") on " + BUSES[busNumber - 1] +
                    " from " + source + " to " + destination + " on " + dateOfBooking + ". Total fare: Rs." + BUSFARE[busNumber - 1]);
        }
    }
}
class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}
public class BusTicketBookingSystem {
    public static void main(String[] args) throws InvalidBookingException {
        List<Integer> BusNo =Arrays.asList( 3333,2222,4444);
        Stream<Integer> bus=BusNo.stream();
        Stream<Integer> stream=bus.filter(t->t%2!=0);
    
        
        Scanner sc = new Scanner(System.in);
        BusBookingSystem busBookingSystem = new BusBookingSystem();
        while (true) {
            System.out.println("Welcome to the Bus Service");
            System.out.println("1. Book a bus ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("From where do you want to travel: ");
                    String source="";
                    try{
                        source = sc.nextLine();
                        if (!source.matches("[A-Za-z]")){
                            throw new InvalidBookingException("Invalid source");
                        }
                    }catch(Exception e){
                        System.out.println("Enter a Valid Source");
                    }
                    System.out.print("Enter your destination: ");
                    String destination = sc.nextLine();
                    busBookingSystem.bookTicket(source, destination);
                    break;
                case 2:
                    System.out.println("Thank you for using the  Bus Service!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}









