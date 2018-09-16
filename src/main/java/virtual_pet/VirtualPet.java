package virtual_pet;

public class VirtualPet {

	int hunger = 0;
	int thirst = 0;
	int waste = 0;
	int boredom = 0;
	int life = 5;
	int happiness = 0;
	boolean disease = false;

	public VirtualPet() {

	}

	public void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		waste = waste + 1;
		boredom = boredom + 1;

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
			waste = waste + 3;
		}

	}

	public void play(String activityType) {
		hunger = +1;
		thirst = +1;
		boredom = -1;

	}

}
