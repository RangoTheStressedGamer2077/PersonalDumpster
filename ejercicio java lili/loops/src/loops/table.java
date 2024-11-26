package loops;
import java.util.Scanner;
public class table {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num = 5;
        int i = 1;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        
        System.out.println("Multiplication Table of " + num);
		// TODO Auto-generated method stub

		while(i<= 10) {
			System.out.println(num + " x " + i + " = " + (num* i));
			i++;
		}
		
	console.close();
		
        }
	}


