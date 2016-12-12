package DiningPhilosophers;

import java.util.Random;

public class Philosopher extends Thread{
	private Chopstick first, second;
	private Random random;
	private int thinkCount;
	

	public Philosopher(Chopstick left, Chopstick right) {
		if(left.getId() < right.getId()){
			first = left; second = right;
		}else{
			first = right; second = left;
		}
		random = new Random();
	}
	
	@Override
	public void run() {
		try{
			while(true){
				++thinkCount;
//				if(thinkCount % 10 == 0)
					System.out.println("Philosopher " + this + " has thougnt  -- > " + thinkCount + " times");
				Thread.sleep(random.nextInt(1000)); //��û����Ѵ�.
				synchronized (first) { //ù��° �������� ���. 
					System.out.println("Philosopher : " + this + " has chopstick No. " + first.getStrId());
					synchronized (second) { //�ι�° �������� ���.
						System.out.println("Philosopher : " + this + " has chopstick No. " + second.getStrId());							
						Thread.sleep(random.nextInt(1000));//��øԴ´�.
					}
				}
			}
		}catch(InterruptedException ex){}
	}
}
