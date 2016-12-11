package DiningPhilosophers;

import java.util.Random;

public class Philosopher extends Thread{
	private Chopstick left, right;
	private Random random;
	

	public Philosopher(Chopstick left, Chopstick right) {
		this.left = left; this.right = right;
		random = new Random();
	}
	
	@Override
	public void run() {
		try{
			while(true){
				Thread.sleep(random.nextInt(1000)); //��û����Ѵ�.
				synchronized (left) { //���� �������� ���.
					synchronized (right) { //������ �������� ���.
						Thread.sleep(random.nextInt(1000));
					}
				}
			}
		}catch(Exception ex){
			
		}
	}
	
}
