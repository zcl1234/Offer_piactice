package concurrent;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class PhaserTest3 {

	public static void main(String[] args) {
		  final Phaser phaser = new Phaser(1);  
		    for(int i=0;i<10;i++){  
		        phaser.register();  
		        new Thread(new Runnable() {  
		            @Override  
		            public void run() {  
		                phaser.arriveAndAwaitAdvance();  
		                System.out.println(Thread.currentThread() +" start!!!!");  
		            }  
		        }).start();  
		    }  
		    try {  
		        TimeUnit.SECONDS.sleep(5);  
		        phaser.arriveAndDeregister();  
		    } catch (InterruptedException e) {  
		        e.printStackTrace();  
		    }  
	}

}
