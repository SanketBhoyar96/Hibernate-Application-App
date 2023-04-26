package com.soft;

import java.util.Scanner;

import com.soft.utility.UserMethodDefine;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome To hibernate Application");
		
		UserMethodDefine user = new UserMethodDefine();
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("============================================================");
			System.out.println("1.Insert User Data");
			System.out.println("2.Update User Data");
			System.out.println("3.Print Table Record");
			System.out.println("4.Delete User Record");
			System.out.println("============================================================");
			System.out.println("======Please Choose Above Option");
            option = sc.nextInt();
			switch (option) {
			case 1:
                 user.createUser();
				break;
			case 2:
                 user.updateUser();
				break;

			case 3:
                user.RetriveUser();
				break;

			case 4:
                 user.DeleteUser();
				break;
			case 5:
                 System.out.println("Thank you for Using Hibernate Application Vist Again.......!!");
				break;

			default:
				System.out.println("Plz Choose Correct option");
				break;
			}
		} while (option !=5);
		System.out.println("");
	}
}
