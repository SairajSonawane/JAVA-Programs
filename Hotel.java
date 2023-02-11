import java.util.Scanner;

class Hotel {
    int roomNum;
    String guestName;
    int nightStay;

    void checkIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room number: ");
        roomNum = sc.nextInt();
        System.out.println("Enter guest name: ");
        guestName = sc.next();
        System.out.println("Enter number of nights to stay: ");
        nightStay = sc.nextInt();
    }

    void checkOut() {
        System.out.println("Room Number: " + roomNum);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights Stayed: " + nightStay);
        System.out.println("Thank you for choosing our hotel!");
    }
}

public class Main {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        System.out.println("Check-In");
        h1.checkIn();
        System.out.println("Check-Out");
        h1.checkOut();
    }
}
