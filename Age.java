import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
     // Read the age from the user   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old.");
        System.out.println("Next year you will be " + (age + 1) + " years old.");
    }
}
