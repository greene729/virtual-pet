package virtual_pet;

public class VirtualPet {

	int hunger;
	int thirst;
	int waste;
	int boredom;
	int health;
	int happiness;
	boolean disease;

	public VirtualPet() {

	}

	public void tick() {
		hunger = +1;
		thirst = +1;
		waste = +1;
		boredom = +1;

	}

	public void feed(int foodType) {
		if (foodType == 1) {
			hunger = -2;
			thirst = -2;
			waste = +2;
			tick();
		} else if (foodType == 2) {
			hunger = -4;
			thirst = +1;
			waste = +3;
			tick();
		} else if (foodType == 3) {
			hunger = -6;
			thirst = +2;
			waste = +3;
			tick();
		}

	}

	public void play(String activityType) {
		hunger = +1;
		thirst = +1;
		boredom = -1;

	}

}
