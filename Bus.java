package com.test;

public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = "Female";
		int age = 60;
		// checkTicketFare(gender, age)

		// Check Male or Female
		if (gender == "Male") {
			if (age <= 2 ) {
				System.out.println("Ticket is free for kids and");
			}

			if (age > 2 && age <= 18) {
				System.out.println("Ticket is half price for 2-18");
			}

			if (age > 18 && age < 60) {
				System.out.println("Ticket is fully chargeable for Adult");
			}
		if (age>=60) {
			
			System.out.println("Ticket is free for senior citizen");
		}
			} else {
				System.out.println("Ticket is free for Female");
			}

		}
	
}
