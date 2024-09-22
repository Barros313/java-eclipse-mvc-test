package sample.controller;


/**
 * Runner object for the MVC sample application.
 * 
 * @author Barros313
 * @version Sep 21, 2024  08:37 PM
 */
public class SampleAppRunner {
	
	/**
	 * Main starter method or entry point for the Java program
	 * @param args Unused as this is a sample application
	 */
	public static void main(String[] args) {
		SampleAppController baseApp = new SampleAppController();
		
		baseApp.start();
	}

}
