import java.util.Scanner;
public class Pattern15 {
// 		The method for printing the pattern
	
	public static void printPattern(int n, char ch) {
		//Loop for the number of rows
		for(int i=1; i<=n; i++) {
			//Loop for the number of stars
			for(int j=1; j<=i; j++) {
				if(i==1 || i==n || j==1 || j==i)
					System.out.print(ch);
				else 
				   System.out.print(" ");
			}
			//To send cursor to next line
			System.out.println();
		}
	}
	
	// The main method 
	
	public static void main(String arg[]) {
		
		//Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		
		//Reading input form the users
		System.out.println("Enter the character");
		char ch =scan.next().charAt(0);
		System.out.println("Enter number of rows:");
		
		int n= scan.nextInt();
		
		printPattern(n,ch);
	}
}
