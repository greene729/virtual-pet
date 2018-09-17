package virtual_pet;

public class VirtualPet {

	int hunger = 0;
	int thirst = 0;
	int waste = 0;
	int boredom = 0;
	int life = 10;
	int happiness = 0;
	int damage;
	boolean disease = false;

	public VirtualPet() {

	}

	public void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		waste = waste + 1;
		boredom = boredom + 1;
		checkHunger();
		takeDamage();

	}

	public void feed(int foodType) {
		if (foodType == 1) {
			hunger = hunger - 2;
			thirst = thirst - 2;
			waste = waste + 2;
			checkOverfeed();
		} else if (foodType == 2) {
			hunger = hunger - 4;
			thirst = thirst + 1;
			waste = waste + 3;
			checkOverfeed();
		} else if (foodType == 3) {
			hunger = hunger - 6;
			thirst = thirst + 2;
			waste = waste + 4;
			checkOverfeed();
		}
	}

	public void checkOverfeed() {
		if (hunger < 0 && hunger > -3) {
			damage = 1;
		} else if (hunger <= -3) {
			damage = 2;
		} else {
			damage = 0;
		}
	}

	public void drink(int drinkType) {
		if (drinkType == 1) {
			thirst = thirst - 2;
			waste = waste + 1;
		} else if (drinkType == 2) {
			hunger = hunger - 1;
			thirst = thirst - 4;
			waste = waste + 2;
		} else if (drinkType == 3) {
			thirst = thirst - 6;
			waste = waste + 3;
		}
	}

	public void play() {
		hunger = +1;
		thirst = +1;
		boredom = -1;

	}

	public void takeDamage() {
		life = life - damage;
	}

	public void checkHunger() {
		if (hunger > 5) {
			damage = damage + 1;
		} else {
			damage = damage + 0;
		}
	}

	public void checkThirst() {
		if (thirst > 5) {
			damage = damage + 1;
		} else {
			damage = damage + 0;
		}
	}

}
