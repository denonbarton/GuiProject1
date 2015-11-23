package gui.controller;

import gui.view.GUIFrame;

/**
 * AppController for the simple GUI project.
 * @author dbar0540
 * @version 0.1 Nov 9, 2015
 */
public class GuiController
{
	private GUIFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}	
}
