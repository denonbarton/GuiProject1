package gui.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.controller.GuiController;
import java.awt.Color;

public class GUIPanel extends JPanel

{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");
		firstTextField = new JTextField("you can type words in here");

		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);

		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);

	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("don't click it");
			}
		});

		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				changeRandomColor();
			}

			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}

			public void mouseEntered(MouseEvent entered)
			{
				//changeRandomColor();
			}

			public void mouseExited(MouseEvent exited)
			{
				//changeRandomColor();
			}

			public void mousePressed(MouseEvent pressed)
			{
				changeRandomColor();
			}
		});
	}

	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() *256);
		blue = (int) (Math.random() *256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
