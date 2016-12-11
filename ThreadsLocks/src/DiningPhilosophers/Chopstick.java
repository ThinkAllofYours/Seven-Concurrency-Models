package DiningPhilosophers;

public class Chopstick {
	
	public Philosopher get_philosopher() {
		return _philosopher;
	}

	public void set_philosopher(Philosopher _philosopher) {
		this._philosopher = _philosopher;
	}

	private Philosopher _philosopher;
	
}
