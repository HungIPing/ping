package main;

import javax.swing.JFrame;

import static util.Constant.*;

public class Game extends JFrame{
	
	private Background bk;


	public Game() {
		setTitle(FRAM_TITLE);
		setSize(FRAM_WIDTH,FRAM_HEIGH);
		setLocation(FRAM_X, FRAM_Y);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}
