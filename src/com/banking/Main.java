package com.banking;

import com.banking.model.Customer;


import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank Management System!!!");
		while(true) {
			System.out.println("Bank Management System!!!");
			System.out.println("Options are:");
			System.out.println("1.Create new account");
			System.out.println("2.View Account details");
			System.out.println("3.Update customer details");
			System.out.println("4.Deposit money");
			System.out.println("5.Withdraw money");
			System.out.println("6.Check account balance");
			System.out.println("7.Transfer money");
            System.out.println("0.Exit");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				System.out.print("Enter customer name: ");
				String name = sc.next();
				
				System.out.print("Enter mobile no: ");
				String mobileNo = sc.next();
				
				System.out.print("Enter email: ");
				String email = sc.next();
				
				System.out.print("Enter address: ");
				String address = sc.next();
				
				Customer customer = new Customer(name,mobileNo,email,address);
				
			}
			
			
		}

	}

}
