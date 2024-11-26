package loops;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		// loops: while , do while
		//while
		int contador = 1;
		while (contador<=5) {
			System.out.println("Iteración: " + contador);
			contador++;
	}
		//do while
		int contadorDoWhile = 1;
		do {
			System.out.println("IteracionDoWhile: " + contadorDoWhile);
			contadorDoWhile++;
		} while (contadorDoWhile <=5);
		//for
		//las condiciones de los for se basan en 3 partes:
		// 1.- inicialización -> se inicializa el contador
		// 2.- condicion -> se utiliza la comparacion de 2 variables: el inicializador y la cantidad que delimite la "n" numero de iteraciones, de preferencia se iguala
		// 3.- incremento(o actualización) del contador
		for(int i = 1; i<=5 ; i++) {
			System.out.println("contador for: " + i);
		}
		//ForEach Java
		//utiliza la palabra reservada for, similar a como usa un for puro
		// en lugar de recibir condicional de tres partes:
		//1.- inicializador: condicion;incremento
		//2.- va utilizar una estructura de parametros
		String[] names = { "xamitl", "maggy", "alex"};
		String misCompaneros = "" ;
		for(String name : names) {
			misCompaneros += name;
		}
		System.out.println(misCompaneros);

		//Ejercicio For: Part 3: For loops
		//Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
		//Hint You can use the following String functions:
		//lenght() -> returns the total number of characters of a given String
		//chartAt(i) -> returns the character at the given position(i) of a String
		String texto = "Jesus" ;
		
		for(int i = 0; i< texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}
}
			/*
			 * Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci
The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."
The beginning of the sequence is thus:
0 1 1 2 3 5 8 13 21 34 55 89 ...
Add the following import to be able to capture user input n
  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n
Fibonacci(n)
0
0
1
1
2
1
3
2
4
3
5
5
6
8
7
13
...
...
		*/
		    
/*
 * 
 * Part 1: While loops
Open your IDE and create a new Java class named Table
Copy the following code into your Java class Table and verify it works
    import java.util.Scanner;

    public class Table
    {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);
            int num;
            
            System.out.print("Enter any positive integer: ");
            num = console.nextInt();
                    
            System.out.println("Multiplication Table of " + num);
            
           //TODO implement While loop to get print result
        }
    }
Implement a while loop that prints out the multiplication table of the given input number.
 * 
 * */

		

	


