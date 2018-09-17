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

		do {
			System.out.println("~Stats~");
			System.out.println("Life - " + myVirtualPet.life);
			System.out.println("Hunger - " + myVirtualPet.hunger);
			System.out.println("Thirst - " + myVirtualPet.thirst);
			System.out.println("Boredom - " + myVirtualPet.boredom);
			System.out.println("Waste - " + myVirtualPet.waste);
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1 - Feed");
			System.out.println("2 - Play");
			System.out.println("3 - Give Drink");
			System.out.println("4 - Clean");
			System.out.println("5 - Do Nothing");
			System.out.println("type \"Quit\" to quit");

			String activity = input.next();

			switch (activity.toLowerCase()) {
			case "1":
			case "feed":
				System.out.println("Pick a food:");
				System.out.println("1 - Some sort of fruit?");
				System.out.println("2 - A salad or something. It's certainly leafy.");
				System.out.println("3 - Large quantity of unidentifiable meat");
				int foodType = input.nextInt();
				myVirtualPet.feed(foodType);
				break;
			case "2":
			case "play":
				System.out.println("Pick an activity:");
				System.out.println("1 - Play a board game.");
				System.out.println("2 - Take the...thing for a brisk walk");
				System.out.println("3 - Sports? Do a sports or something?");
				int playType = input.nextInt();
				myVirtualPet.play(playType);
				break;
			case "3":
			case "give drink":
				System.out.println("Pick a drink:");
				System.out.println("1 - Good, old-fashioned, clearish water.");
				System.out.println("2 - A warm liquid that smells vaguely of ham");
				System.out.println("3 - Fancy schmancy electrolyte infused water.");
				int drinkType = input.nextInt();
				myVirtualPet.drink(drinkType);
				break;
			case "4":
			case "clean":
				System.out.println("You clean up after the whatever-it-is.");
				System.out.println("Who knew this thing could make such a mess.");
				System.out.println("The thing looks pretty bored.");
				System.out.println("And a little peckish.");
				System.out.println();
				myVirtualPet.clean();
				break;
			case "5":
			case "do nothing":
				System.out.println("You do nothing.");
				System.out.println("Unsurprisingly, nothing happens.");
				System.out.println();
				break;
			case "quit":
				System.out.println("Are you sure you want to quit?");
				String quitResponse = input.nextLine();
				if (quitResponse.toLowerCase().equals("yes")) {
					System.out.println("Oh. Well alright then.");
					System.out.println("I'll kill this thing for you.");
					System.out.println();
					myVirtualPet.life = 0;
				} else if (quitResponse.toLowerCase().equals("no")) {
					System.out.println("Alright then. Let's get on with it.");
					System.out.println("This counts as a turn though.");
				}

			}

			myVirtualPet.tick();

		} while (myVirtualPet.life > 0);
		System.out.println("You have killed whatever it was.");
		System.out.println("You are filled with a profound feeling of shame.");
		System.out.println("The shame eventually eats away at you until you die.");
		System.out.println("Sorry about your luck.");

		input.close();
	}

}
