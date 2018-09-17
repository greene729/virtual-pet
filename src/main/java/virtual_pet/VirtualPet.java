package virtual_pet;

public class VirtualPet {

	int hunger = 2;
	int thirst = 1;
	int boredom = 3;
	int waste = 0;
	int life = 10;
	int damage;

	public VirtualPet() {

	}

	public void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		boredom = boredom + 1;
		waste = waste + 1;
		collectDamage();
		applyDamage();
		damage = 0;

	}

	public void feed(int foodType) {
		if (foodType == 1) {
			hunger = hunger - 2;
			thirst = thirst - 2;
			waste = waste + 2;
		} else if (foodType == 2) {
			hunger = hunger - 4;
			thirst = thirst + 1;
			waste = waste + 3;
		} else if (foodType == 3) {
			hunger = hunger - 6;
			thirst = thirst + 2;
			waste = waste + 4;
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

	public void play(int playType) {
		if (playType == 1) {
			boredom = boredom - 1;
		} else if (playType == 2) {
			hunger = hunger + 1;
			thirst = thirst + 1;
			boredom = boredom - 3;
		} else if (playType == 3) {
			hunger = hunger + 2;
			thirst = thirst + 2;
			boredom = boredom - 5;
		}
	}

	public void clean() {
		waste = -1; // when tick() is called, waste will == 0
		boredom = boredom + 1;
		hunger = hunger + 1;
		thirst = thirst + 1;
	}

	public void collectDamage() {
		if (hunger >= 5) {
			damage = damage + 1;
		}
		if (thirst >= 5) {
			damage = damage + 1;
		}
		if (waste >= 5) {
			damage = damage + 1;
		}
		if (boredom >= 5) {
			damage = damage + 1;
		}
	}

	public void applyDamage() {
		life = life - damage;
	}

	public void checkThirst() {
		if (thirst > 5) {
			damage = damage + 1;
		} else {
			damage = damage + 0;
		}
	}

}
