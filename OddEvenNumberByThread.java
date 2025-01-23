package com.java.interview;

class NumberPrinter {
	 
	private int limit;
	private int number = 1;
	private boolean oddTurn = true;
 
	public NumberPrinter(int limit) {
		this.limit = limit;
	}
 
	public synchronized void printOdd() {
		while (number <= limit) {
			while (!oddTurn) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Thread Inerrupted");
				}
			}

			if (number <= limit) {
				
				System.out.println("Odd: " + number);
				number++;
				oddTurn = false;

				notify();
			}
		}
	}

	public synchronized void printEven() {

		while (number <= limit) {
			while (oddTurn) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Thread Interrupted");
				}
			}
 
			if (number <= limit) {
				
				System.out.println("Even: " + number);
				number++;
				oddTurn = true;
 
				notify();
			}
		}
	}
}
 
public class OddEvenNumberByThread {
 
	public static void main(String[] args) {
 
		int limit = 10;
		NumberPrinter numberPrinter = new NumberPrinter(limit);
 
		Thread oddThread = new Thread(numberPrinter::printOdd);
		Thread evenThread = new Thread(numberPrinter::printEven);
 
		oddThread.start();
		evenThread.start();
	}
}

 