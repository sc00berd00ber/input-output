import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double subtotal = 22.87;
        double tax = subtotal * 0.0825;
        double totalDue = subtotal + tax;
        System.out.println("Total dues is: " + totalDue);
        System.out.println("Total due is: " + String.format("%.2f", totalDue));

        System.out.printf("Total due is: %.2f \n", totalDue);

        int id = 10135;
        String teamName = "Brandon Players";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $ %.2f\n", teamName, id, pay);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Howdy " + name + ".");
        System.out.printf("Howdy %s.\n", name);
    }
}