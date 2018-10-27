/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/kimk.jpeg";
	String secondImage = "src/GRAYSON.jpeg";
	String thirdImage = "src/noah.jpeg";
	String fourthImage = "src/Ethan.jpeg";
	String fifthImage = "src/chicago.jpeg";
	String sixthImage = "src/north.jpeg";
	String seventhImage = "src/khloe.jpeg";
	String eighthImage = "src/north.jpeg";
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int score= 0;
		// 2. Set the size of the window in the initializeGui() method below
			
		// 4. Ask the user who this person is and store their answer
		String guess= JOptionPane.showInputDialog("Who is this?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
if(guess.equals("Kim K")) {
	JOptionPane.showMessageDialog(null, "You are correct!");
	score=1;
}
else {
	JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Kim K");
}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();
	    	// 8. Show them their current score
JOptionPane.showMessageDialog(null, "Your score is"+score);
		// 9. .... repeat for all your images.....

	

	

	String guesstwo= JOptionPane.showInputDialog("Who is this?");
	if(guesstwo.equals("Grayson D")) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=2;
	}
	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Grayson D");
	}
	showNextImage();
	String guessthree = JOptionPane.showInputDialog("Who is this?");
	if(guessthree.equals("Noah C")) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=3;
	}
	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Noah C");
	}
	showNextImage();
	String guessfour= JOptionPane.showInputDialog("Who is this?");
	if(guessfour.equals("Ethan D")) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=4;
	}

	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Ethan D");
	}
	JOptionPane.showMessageDialog(null, "Your score is "+score);
	showNextImage();
	String guessfive= JOptionPane.showInputDialog("Who is this?");
	if(guessfive.equals("Chicago W")) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=5;
	}

	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Chicago W");
	}
	
	JOptionPane.showMessageDialog(null, "Your score is "+score);
	showNextImage();
	String guesssix= JOptionPane.showInputDialog("Who is this?");
	if(guessfive.equals("North W)") ) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=6;
	}

	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is North W");
	}
	JOptionPane.showMessageDialog(null, "Your score is "+score);
	showNextImage();
	String guessseven= JOptionPane.showInputDialog("Who is this?");
	if(guessfive.equals("Khloe K)") ) {
		JOptionPane.showMessageDialog(null, "You are correct!");
		score=7;
	}

	else {
		JOptionPane.showMessageDialog(null, "You are wrong :( the answer is Khloe K");
	}
	}
	
	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		window.setSize(200,150);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fifthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(sixthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(seventhImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(eighthImage);
		imageList.add(imageLabel);

	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
