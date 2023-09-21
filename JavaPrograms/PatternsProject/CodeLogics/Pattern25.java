import java.util.Scanner;
public class Pattern25 {
	
	//The method for printing the pattern
	public static void printPattern(int n) {
		//Temporary variable to display
		int temp=n*n;
		//Loop related to rows
		for(int i=1; i<=n; i++) {
			
			//Loop for columns
			for(int j=1; j<=n; j++) {
				if(temp<10)
					System.out.print("0");
				System.out.print(temp+" ");
				temp--;
			}
			
			System.out.println();
		}
	}
	public static void main(String arg[]) {
		//Creating object for scanner class
		
		Scanner scan = new Scanner(System.in);
		//Reading user input
		System.out.println("Enter number of rows");
		
		int rows = scan.nextInt(); // To store rows count
		scan.close();
		printPattern(rows);
	}
}

