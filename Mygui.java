package ldhjava;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Mygui implements ActionListener{
	private static String labelPrefix = "Num of button clicks : ";
    private int click = 0;
	JFrame jFrame = new JFrame("Dialog and button");
	JDialog jDialog = new JDialog(jFrame, "Here Comes Dialog");
	JButton jButton = new JButton("Click:+1");
	JButton jButton2 = new JButton("Click:-1");
	JLabel jLabel = new JLabel(labelPrefix+ "0     ");
	// constructor of mygui
	public Mygui(){
		
		// set size of frame
		jFrame.setSize(500, 500);
		jFrame.setVisible(true);

		//exit when click x button
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add label which shows the num of clicks to frame
		jFrame.getContentPane().add(jLabel);

		//Center alignment of Label in the Frame
		jFrame.setLayout(new FlowLayout());

		//add actionlistener to button
		jButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText(labelPrefix + ++click);
			}
		});
		jButton2.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText(labelPrefix + --click);
			}
		});
		// add button to dialog
		jDialog.add(jButton, "East");
		jDialog.add(jButton2, "North");

		// set size of dialog
		jDialog.setSize(300, 300);
		jDialog.setVisible(true);
		//exit dialog when click x button
		jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	public static void main(String[] args)
	{
		//launcher
		new Mygui();
	}

}