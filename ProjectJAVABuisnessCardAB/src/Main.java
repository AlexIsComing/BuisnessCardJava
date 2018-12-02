import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String FirstName, LastName, Phone, City;

        System.out.println("Enter your First name :");
        FirstName = sc.nextLine();
        System.out.println("Enter your Last name :");
        LastName = sc.nextLine();
        System.out.println("Enter your Phone :");
        Phone = sc.nextLine();
        System.out.println("Enter your City :");
        City = sc.nextLine();


        BuisnessCard Bc = new BuisnessCard(FirstName,LastName,Phone,City);
        System.out.println(Bc.toString());



    }
}

