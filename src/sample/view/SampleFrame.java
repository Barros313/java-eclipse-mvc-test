package sample.view;

import javax.swing.JFrame;

import sample.controller.SampleAppController;

/**
 * {@link SampleFrame} object that extends JFrame for use with a MVC GUI.
 * 
 * @author Gabriel Barros - Barros313
 * @version 1.1 Sep 21, 2024 - 09:31 PM Added documentation.
 */
public class SampleFrame extends JFrame {
	/**
	 * Reference to the application {@link SamplePanel}.
	 */
	private SamplePanel basePanel;
	
	/**
	 * Create a {@link SampleFrame} object passing a reference to the {@link SampleAppController} for use by the {@link SampleFrame} object.
	 * 
	 * @param baseController The reference to the {@link SampleAppController} object for MVC.
	 */
	public SampleFrame(SampleAppController baseController) {
		basePanel = new SamplePanel(baseController);
		setupFrame();
	}
	
	/**
	 * Sets the content pane, size and makes the frame visible.
	 */
	private void setupFrame() {
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
