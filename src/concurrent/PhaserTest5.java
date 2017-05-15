package concurrent;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class PhaserTest5 {

	public static void main(String[] args) {  
	    final Phaser phaser = new Phaser(1){  
	        protected boolean onAdvance(int phase, int registeredParties) {  
	            System.out.println("now phase is " + phase);  
	            
	            return phase>=5||registeredParties == 0;  
	        }  
	    };  
	   
	    for(int i=0;i<5;i++){  
	        phaser.register();  
	        final int time = i;  
	        new Thread(new Runnable() {  
	            @Override  
	            public void run() {  
	                do{  
	                    phaser.arriveAndAwaitAdvance();  
	                    System.out.println(Thread.currentThread() +" start-"+time+"!!!!");  
	                }while(!phaser.isTerminated());  
	            }  
	        }).start();  
	    }  
	    try {  
	        TimeUnit.SECONDS.sleep(5);  
	        System.out.println("arriveAndDeregister...");  
	        phaser.arriveAndDeregister();  
	    } catch (InterruptedException e) {  
	        e.printStackTrace();  
	    }  
	}  

}
