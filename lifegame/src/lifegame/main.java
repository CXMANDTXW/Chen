package lifegame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class main {
	static JFrame frame = new JFrame("我的生命游戏");
	static Thread thread = new Thread(new MyRunnable());
	static JButton[][] btnArray = new JButton[5][6];
	static MyRunnable m = new MyRunnable();
	static int q = 2;
public static void main(String args[]){
	
	frame.setLayout(null);
	frame.setSize(300, 330);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	JPanel panel = new JPanel();
	panel.setLocation(0, 0);
	panel.setSize(300, 250);
	panel.setBackground(Color.gray);
	CreateButton();
	frame.setResizable(false);
	frame.add(panel);
	frame.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
}

public static void CreateButton()
{

	JButton start = new JButton("start");
	JButton stop = new JButton("stop");
	JButton exit = new JButton("exit");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<6;j++)
		{
			btnArray[i][j] = new JButton();
			btnArray[i][j].setLocation(j*50, i*50);
			btnArray[i][j].setSize(50, 50);
			frame.add(btnArray[i][j]);
		}
	}
	start.setLocation(20,260);
	start.setSize(65, 40);
	stop.setLocation(120, 260);
	stop.setSize(65, 40);
	exit.setLocation(220, 260);
	exit.setSize(65, 40);
	start.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MethodOfStart();
		}	
	});
	stop.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MethodOfStop();
				}
		
			});
	exit.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MethodOfExit();
				}
		  
			});
	frame.add(exit);
	frame.add(stop);
	frame.add(start);
}
private static void MethodOfStart() 
{
	if(q==2)	
	thread.start();
    q=0;
}
private static void MethodOfStop()
{
          q=1;	
}
private static void MethodOfExit()
{
	System.exit(0);
}
}
