package virtual_pet;

import java.util.Scanner;

public class VirtualPetUser {
	public static void main(String[] args) {
		System.out.println("A strange man approaches you.");
		System.out.println("He sidles up to you and speaks to you without looking directly at you.");
		System.out.println();
		System.out.println("\"Eh, man. You want this egg?\"");

		Scanner input = new Scanner(System.in);
		boolean eggResponse = false;
		do {
			String yesNo = input.next();

			if (yesNo.toLowerCase().equals("no")) {
				System.out.println("\"Fine.\"");
				System.out.println("\"Your loss.\"");
				System.out.println("\"Bye now\"");
				System.out.println();
				System.out.println("He leaves. You are filled with a profound sense of regret.");
				System.out.println("The curiousity over what could have been eventually kills you.");
				System.out.println("Sorry about your luck.");
				System.exit(0);
			} else if (yesNo.toLowerCase().equals("yes")) {
				System.out.println("\"You do? Nice!\"");
				System.out.println("He hands you the egg.");
				System.out.println("\"Good luck!\"");
				System.out.println("You blink and he is gone.");
				System.out.println("Now you have this egg.");
				System.out.println();
				System.out.println("Some time passes.");
				System.out.println();
				System.out.println("Now the egg is hatching.");
				System.out.println();
				eggResponse = false;
			} else {
				System.out.println("\"What?\"");
				System.out.println("\"Do you want this egg or not?\"");
				eggResponse = true;
			}

		} while (eggResponse);

		VirtualPet myVirtualPet = new VirtualPet();

		System.out.println("Congratulations. It's a...thing.");
		System.out.println();

		boolean userKeepsPlaying;
		do {
			System.out.println("~Stats~");
			System.out.println("Life - " + myVirtualPet.life);
			System.out.println("Hunger - " + myVirtualPet.hunger);
			System.out.println("Thirst - " + myVirtualPet.thirst);
			System.out.println("Waste - " + myVirtualPet.waste);
			System.out.println("Diseased - " + myVirtualPet.disease);
			System.out.println("");
			System.out.println("What do you want to do?");
			System.out.println("1 - Feed");
			System.out.println("2 - Play");
			System.out.println("3 - Give Drink");
			System.out.println("4 - Go to the Doctor");
			System.out.println("5 - Clean");
			System.out.println("type \"Quit\" to quit");

			String activity = input.next();

			switch (activity.toLowerCase()) {
			case "1":
			case "feed":
				System.out.println("Pick a food:");
				System.out.println("1 - Some sort of fruit");
				System.out.println("2 - A dish typically thought of as a side");
				System.out.println("3 - Large quantity of meat");
				int foodType = input.nextInt();
				myVirtualPet.feed(foodType);
				myVirtualPet.tick();
				userKeepsPlaying = true;
				break;
			case "2":
			case "play":
				System.out.println();

			}
		} while (userKeepsPlaying = true);

		// String[] foodTypeOne = {"Peach", "Apple", "Grapes"};
		// String[] foodTypeTwo = {"Fries", "Salad", "Soup"};
		// String[] foodTypeThree = {"Ham", "Steak", "Turkey"};

		input.close();
	}

}
