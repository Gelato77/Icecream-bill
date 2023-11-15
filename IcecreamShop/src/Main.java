import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Would you like to place an order for Icecream?");
        System.out.println("Type 'Y' for yes 'N' for no");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        while (answer.toLowerCase().equals("y")) {
            Icecream order = new Icecream();
            System.out.println("Would you like to place another order?");
            System.out.println("Type 'Y' for yes 'N' for no");
            answer = in.nextLine();
        }
    }
}