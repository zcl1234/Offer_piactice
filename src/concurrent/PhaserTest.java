package concurrent;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class PhaserTest {

	public static void main(String[] args) {
	Phaser phaser=new Phaser(1){
		 @Override  
         protected boolean onAdvance(int phase, int registeredParties) {  
             System.out.println("\n=========华丽的分割线=============");  
             //本例中，当只剩一个线程时，这个线程必定是主线程，返回true表示终结  
             return phase== 1;   
         }   
	};
	for(int i=0; i<3; i++) {  
        new Thread(new MyThread((char)(97+i), phaser)).start();  
    }  
	
    try {  
        TimeUnit.SECONDS.sleep(3);  
    } catch (InterruptedException e) {  
        e.printStackTrace();  
    }  
    phaser.arrive();  //此处可使用latch.countDown()
}  
}
class MyThread implements Runnable
{
	Phaser phaser;
	char c;
	public MyThread(char c,Phaser phaser)
	{
		this.c=c;
		this.phaser=phaser;
	}
	
	
	public void run()
	{
		phaser.awaitAdvance(phaser.getPhase());
		//phaser.arriveAndAwaitAdvance();
		System.out.println(phaser.getPhase());
		for(int i=0; i<100; i++) {  
            System.out.print(c+" ");  
            if(i % 10 == 9) {  
                System.out.println();  
            }  
	}
}
}