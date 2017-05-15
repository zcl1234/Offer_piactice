package concurrent;

import java.util.concurrent.Phaser;

public class PhaserTest4 {
	public static void main(String[] args)
	{
		Phaser phaser=new Phaser(1);
		new taskA(phaser).start();
		new taskB(phaser).start();
		System.out.println(phaser.getRegisteredParties());
	}
		
}
class taskA extends Thread
{
	Phaser phaser;
	public taskA(Phaser phaser)
	{
		this.phaser=phaser;
		//phaser.register();
	}
	
	public void run()
	{
		int i=0;
		System.out.println(phaser.getPhase());
		while(i<5)
		{
			System.out.println(i);
			i++;
			
		}
		phaser.arriveAndAwaitAdvance();
		System.out.println("here");
	//	phaser.awaitAdvance(1);
		//phaser.arriveAndDeregister();
	}
}

class taskB extends Thread
{
	Phaser phaser;
	public taskB(Phaser phaser)
	{
		this.phaser=phaser;
		//phaser.register();
	}
	
	public void run()
	{
		int i=5;
		System.out.println(phaser.getPhase());
		while(i<10)
		{
			phaser.awaitAdvance(1);
			System.out.println(i);
			i++;
			
		}
	    phaser.arriveAndDeregister();
	}
}



