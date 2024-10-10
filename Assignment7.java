package com.test;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gender = "Female";
		int age = 54;
		// checkTicketFare(gender, age)

		// Check Male or Female
		if (gender == "Male") {
			if (age <= 2) {
				System.out.println("Ticket is free for kids");
			} else {
				if (age <= 12) {
					System.out.println("Ticket is half price for 2-12");
				} else {
					if (age <= 60) {
						System.out.println("Ticket is fully chargeable for Adult");
					} else {
						System.out.println("Free for above 60");
					}
				}

			}

		} else {
			System.out.println("Ticket is free for Female");
		}

	}

}
