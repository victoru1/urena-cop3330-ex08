/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
    int people;
    int n_pizza;
    int s_pizza;
		
		System.out.print("How many people? ");
		people = input.nextInt();

    System.out.print("How many pizzas do you have? ");
		n_pizza = input.nextInt();

    System.out.print("How many slices per pizza? ");
		s_pizza = input.nextInt();

    int total_slices = n_pizza * s_pizza;
    int slices_per_person = total_slices / people;
    int slices_leftover = total_slices % people;

    System.out.printf("%d people with %d pizzas (%d slices) ", people, n_pizza, total_slices);

    System.out.printf("\nEach person gets %d pieces of pizza. ", slices_per_person);

    System.out.printf("\nThere are %d leftover pieces. ", slices_leftover);

	}

}
