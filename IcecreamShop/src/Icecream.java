import java.util.Scanner;

public class Icecream {
    int vCount = 0; int vPrice = 150;
    int cCount = 0; int cPrice = 200;
    int mCount = 0; int mPrice = 250;
    int sCount = 0; int sPrice = 300;
    int mixCount = 0; int mixPrice = 175;
    static int orderCount = 0;

    public Icecream(){
        System.out.println("Welcome to Icecream World Menu!");
        System.out.println("_________________________________");
        System.out.println("1. Vanilla ------------------150");
        System.out.println("2. Chocolate ----------------200");
        System.out.println("3. Mint ---------------------250");
        System.out.println("4. Strawberry ---------------300");
        System.out.println("5. Mixberry -----------------175");
        System.out.println("_________________________________");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the quantity for Vanilla:");
        vCount = in.nextInt();
        System.out.println("Enter the quantity for Chocolate:");
        cCount = in.nextInt();
        System.out.println("Enter the quantity for Mint:");
        mCount = in.nextInt();
        System.out.println("Enter the quantity for Strawberry:");
        sCount = in.nextInt();
        System.out.println("Enter the quantity for Mixberry:");
        mixCount = in.nextInt();

        orderCount++;

        generateBill();
    }

    public void generateBill() {
        System.out.println("==========================================================");
        System.out.println("Sl.no      Flavor      Price       Quantity      Amount");
        System.out.println("  1        Vanilla      " + vPrice + "           " + vCount + "             " + vCount*vPrice);
        System.out.println("  2        Chocolate    " + cPrice + "           " + cCount + "             " + cCount*cPrice);
        System.out.println("  3        Mint         " + mPrice + "           " + mCount + "             " + mCount*mPrice);
        System.out.println("  4        Strawberry   " + sPrice + "           " + sCount + "             " + sCount*sPrice);
        System.out.println("  5        Mixberry     " + mixPrice + "           " + mixCount + "             " + mixCount*mixPrice);
        System.out.println("----------------------------------------------------------");
        System.out.println("Your total amount is:                 " + totalQuantity() + "             " + totalPrice());
        System.out.println("==========================================================");
    }

    public int totalQuantity() {
        int total = vCount + cCount + mCount + sCount + mixCount;
        return total;
    }

    public int totalPrice() {
        int total = (vCount*vPrice) + (cCount*cPrice) + (mCount*mPrice) + (sCount*sPrice) + (mixCount*mixPrice);
        return total;
    }
}
