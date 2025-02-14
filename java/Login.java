import java.util.Scanner; // Import Scanner class

public class Login {
    public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in); 

        // Read a string
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
		
		 System.out.print("Enter your email ID: ");
        String userEmail = scanner.nextLine();
		
		

        // Read an integer
		 System.out.print("Enter your Mobile Number: ");
        String userMobileNumber = scanner.nextLine();

        // Display the input
        System.out.println(userName);
		 System.out.println(userEmail);
		  System.out.println(userMobileNumber);
		
		
		
		
		
		
		
		
		
		
        System.out.println("Hello, World!");
    }
}
