 import java.util.*;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = sc.nextInt();

//         int sum = num1 + num2;

//         System.out.println("The sum of the two numbers is: " + sum);
//     }
// }

// wap to show student name ,age,fees,roll no ,college name or marital status using scanner class.
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student fees: ");
        double fees = sc.nextDouble();

        System.out.print("Enter student roll number: ");
        long int  rollNo = sc.nextLong();

        sc.nextLine(); // Consume newline left-over

        System.out.print("Enter college name: ");
        String collegeName = sc.nextLine();

        System.out.print("Enter marital status: ");
        String maritalStatus = sc.nextLine();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Fees: " + fees);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("College Name: " + collegeName);
        System.out.println("Marital Status: " + maritalStatus);
    }
}