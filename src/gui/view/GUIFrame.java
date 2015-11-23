package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
import java.awt.Color;

/**
 * Creates the frame for the GUI project.
 * 
 * @author dbar0540
 * @version 0.x Nov 9, 2015 added a refrence to the GUIPanel and installed it as
 *          the content pane added the setupFrame helper method
 */

public class GUIFrame extends JFrame
{
	private GuiController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController;
		
		basePanel = new GUIPanel(baseController);
		basePanel.setBackground(Color.CYAN);
		basePanel.setForeground(Color.DARK_GRAY);
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		
		this.setTitle("my window app");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public GuiController getBaseController()
	{
		return baseController;
	}
}
