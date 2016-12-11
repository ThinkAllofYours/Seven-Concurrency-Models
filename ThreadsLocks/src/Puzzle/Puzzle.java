package Puzzle;

public class Puzzle {
	static boolean answerReady = false;
	static int answer = 0;
	static Thread t1 = new Thread(){
		public void run(){
			answer = 42;
			answerReady = true;
		}
	};
	
//	static Thread t2 = new Thread(){
//		public void run() {
//			if(answerReady)
//				System.out.println("The meaning of life is : " + answer);
//			else
//				System.out.println("I don't know the answer");
//		}
//	};
	
	static Thread t2 = new Thread(){
		public void run() {
			while(!answerReady)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("The meaning of life is : " + answer);
		}
	};
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		t1.start(); t2.start();
		t1.join(); t2.join();
	}

}
