package DiningPhilosophers;

public class Chopstick {
	private int id;

	public int getId() {
		return id;
	}
	
	public Chopstick(int id) {
		this.id = id;
	}
	
	public String getStrId(){
		return Integer.toString(id);
	}
	
}
