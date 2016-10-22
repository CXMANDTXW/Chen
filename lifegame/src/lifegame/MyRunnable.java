package lifegame;

import java.awt.Color;
public class MyRunnable implements Runnable {
	private int [][]ColorArray =new int[7][8];
	Object c = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		init();
		synchronized(c){
		while(true){
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        suanfa();
        show();  
        if(main.q==0)
        	c.notify();
        if(main.q==1){
        try {
			c.wait(0);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}}
	}

public void init()
{
	 double random;
     int i,j;
     for(i=0;i<5;i++)
     {
    	 for(j=0;j<6;j++)
    	 {
    		 random=Math.random();
    		 if(random>=0.5)
    		 {
    			ColorArray[i+1][j+1] = 0;
    			main.btnArray[i][j].setBackground(Color.BLACK);   
    		 }
   		   else 
   		   {
   			   main.btnArray[i][j].setBackground(Color.white);
   			   ColorArray[i+1][j+1] = 1;   
   		   }
    	 }
     }
}
public void suanfa()
{
	for (int i=1;i<6;i++)
		for(int j=1;j<7;j++)
		{
			change(i,j);
		}
}
public void change(int i,int j)
{
	int sum=0;
	if(ColorArray[i-1][j-1]==1)
		sum++;
	if(ColorArray[i][j-1]==1)
		sum++;
	if(ColorArray[i+1][j-1]==1)
		sum++;
	if(ColorArray[i-1][j]==1)
		sum++;
	if(ColorArray[i+1][j]==1)
		sum++;
	if(ColorArray[i-1][j+1]==1)
		sum++;
	if(ColorArray[i][j+1]==1)
		sum++;
	if(ColorArray[i+1][j+1]==1)
		sum++;
	ColorArray[i][j]=judge(sum,ColorArray[i][j]);
}
public int judge(int sum,int a)
{
	if(sum==3)
		return a=1;
	else if(sum==2)
		return a;
	else return a=0;
}
public void show()
{
	for(int i=1;i<6;i++)
		for(int j=1;j<7;j++)
		{
			if(ColorArray[i][j]==0)
				main.btnArray[i-1][j-1].setBackground(Color.black);
			else
				main.btnArray[i-1][j-1].setBackground(Color.white);
		}
}
}
