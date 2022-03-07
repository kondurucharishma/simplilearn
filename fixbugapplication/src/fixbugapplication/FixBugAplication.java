package fixbugapplication;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class FixBugAplication {

	public static void main(String[] args) {
				System.out.println("Welcome to Desk");
		optionsSelection();
	}

	private static void optionsSelection() 
	{
		String[] arr = { "1. I wish to review my expenditure", "2. I wish to add my expenditure",
				"3. I wish to delete my expenditure"};
		
		int[] arr1 = { 1, 2, 3};
		int slen = arr1.length;
		for (int i = 0; i < slen; i++)
		{
			System.out.println(arr[i]);
			}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> carexpenses = new ArrayList<Integer>();
		carexpenses.add(1111);
	    carexpenses.add(2222);
		carexpenses.add(3333);
		carexpenses.add(4444);
		carexpenses.add(5555);
		carexpenses.addAll(arrlist);
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options;
		do {
			options = sc.nextInt();
			switch (options) {
			case 1:
				System.out.println("Your saved carexpenses are listed below: \n");
				System.out.println(carexpenses + "\n");

				break;
			case 2:
				System.out.println("Enter the value to add your carExpense: \n");
				int value = sc.nextInt();
				carexpenses.add(value);
				System.out.println("Your value is updated\n");
				carexpenses.addAll(arrlist);
				System.out.println(carexpenses + "\n");

				break;
			case 3:
				System.out.println(
						"You are about the delete all your carexpenses! \nConfirm again by selecting the same option...\n");
				int con_choice = sc.nextInt();
				if (con_choice == options) {
					carexpenses.clear();
					System.out.println(carexpenses + "\n");
					System.out.println("All your carexpenses are erased!\n");
				} else {
					System.out.println("Oops... try again!");
				}
				break;
			
			}
		} while (options != 3);
	}
}