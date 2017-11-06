package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot firstRing = new Robot(500,500);
	Robot secondRing = new Robot(750,500);
	Robot thirdRing = new Robot(1000,500);
	Robot fourthRing = new Robot(625,600);
	Robot fifthRing = new Robot(875,600);
	
	firstRing.setSpeed(500);
	secondRing.setSpeed(50);
	thirdRing.setSpeed(50);
	fourthRing.setSpeed(50);
	fifthRing.setSpeed(50);
	
	
	Thread thread1 = new Thread(()->  {
		firstRing.penDown();
		firstRing.setPenColor(Color.BLUE);
		firstRing.setPenWidth(20);
		for (int i = 0; i < 360; i++) {
			firstRing.turn(1);
			firstRing.move(2);
		}
		firstRing.penUp();
		firstRing.moveTo(500, 700);
	});
	thread1.start();
	
	Thread thread2 = new Thread(()->  {
		secondRing.penDown();
		secondRing.setPenColor(Color.BLACK);
		secondRing.setPenWidth(20);
		for (int i = 0; i < 360; i++) {
			secondRing.turn(1);
			secondRing.move(2);
		}
		secondRing.penUp();
		secondRing.moveTo(650, 700);
	});
	thread2.start();
	
	Thread thread3 = new Thread(()->  {
		thirdRing.penDown();
		thirdRing.setPenColor(Color.RED);
		thirdRing.setPenWidth(20);
		for (int i = 0; i < 360; i++) {
			thirdRing.turn(1);
			thirdRing.move(2);
		}
		thirdRing.penUp();
		thirdRing.moveTo(800, 700);
	});
	thread3.start();
	
	Thread thread4 = new Thread(()->  {
		fourthRing.penDown();
		fourthRing.setPenColor(Color.YELLOW);
		fourthRing.setPenWidth(20);
		for (int i = 0; i < 360; i++) {
			fourthRing.turn(1);
			fourthRing.move(2);
		}
		fourthRing.penUp();
		fourthRing.moveTo(950, 700);
	});
	thread4.start();
	
	Thread thread5 = new Thread(()->  {
		fifthRing.penDown();
		fifthRing.setPenColor(Color.GREEN);
		fifthRing.setPenWidth(20);
		for (int i = 0; i < 360; i++) {
			fifthRing.turn(1);
			fifthRing.move(2);
		}
		fifthRing.penUp();
		fifthRing.moveTo(950, 700);
	});
	thread5.start();
}

}

