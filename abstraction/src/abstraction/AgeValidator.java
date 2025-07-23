package abstraction;
import java.util.*;


class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeValidator {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     try {
         
         System.out.print("Enter name: ");
         String name = sc.nextLine();

         System.out.print("Enter age: ");
         int age = Integer.parseInt(sc.nextLine());

         
         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Age must be between 18 and 59.");
         }

         
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Validation successful!");

     } catch (NumberFormatException e) {
         System.out.println("Invalid input: Age must be a valid integer.");
     } catch (InvalidAgeException e) {
         System.out.println("InvalidAgeException: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
     } finally {
         sc.close();
     }
 }
}

