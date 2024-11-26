package loops;

import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
        int num = 0;
        int i = 1;
        System.out.print("Enter how many fibonacci numbers you want: ");
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
