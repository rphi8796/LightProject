package view;

import controller.LightController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LightPanel extends JPanel
{
	private LightController appController;
	private SpringLayout appLayout;
	private JButton resetButton;
	private JButton oneOne;
	private JButton oneTwo;
	private JButton oneThree;
	private JButton twoOne;
	private JButton twoTwo;
	private JButton twoThree;
	private JButton threeOne;
	private JButton threeTwo;
	private JButton threeThree;
	
	public LightPanel(LightController appController)
	{
		super();
		this.appController = appController;
		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		oneOne = new JButton();
		oneTwo = new JButton();
		oneThree = new JButton();
		twoOne = new JButton();
		twoTwo = new JButton();
		twoThree = new JButton();
		threeOne = new JButton();
		threeTwo = new JButton();
		threeThree = new JButton();
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, -100, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, resetButton, -39, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -142, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoThree, 20, SpringLayout.SOUTH, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, twoThree, -20, SpringLayout.NORTH, threeThree);
		appLayout.putConstraint(SpringLayout.SOUTH, threeThree, 0, SpringLayout.SOUTH, threeOne);
		appLayout.putConstraint(SpringLayout.EAST, threeThree, 0, SpringLayout.EAST, oneThree);
		appLayout.putConstraint(SpringLayout.NORTH, threeThree, 0, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.WEST, threeThree, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, threeTwo, 200, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.EAST, threeTwo, 200, SpringLayout.WEST, oneTwo);
		appLayout.putConstraint(SpringLayout.SOUTH, twoTwo, -370, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoOne, -370, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, threeOne, 450, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoTwo, 20, SpringLayout.SOUTH, oneTwo);
		appLayout.putConstraint(SpringLayout.NORTH, threeTwo, 0, SpringLayout.NORTH, threeOne);
		appLayout.putConstraint(SpringLayout.WEST, threeTwo, 0, SpringLayout.WEST, oneTwo);
		appLayout.putConstraint(SpringLayout.WEST, threeOne, 0, SpringLayout.WEST, oneOne);
		appLayout.putConstraint(SpringLayout.SOUTH, threeOne, 225, SpringLayout.SOUTH, twoOne);
		appLayout.putConstraint(SpringLayout.EAST, threeOne, 200, SpringLayout.WEST, oneOne);
		appLayout.putConstraint(SpringLayout.NORTH, twoOne, 20, SpringLayout.SOUTH, oneOne);
		appLayout.putConstraint(SpringLayout.WEST, twoOne, 0, SpringLayout.WEST, oneOne);
		appLayout.putConstraint(SpringLayout.EAST, twoOne, 0, SpringLayout.EAST, oneOne);
		appLayout.putConstraint(SpringLayout.WEST, twoThree, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.EAST, twoThree, 0, SpringLayout.EAST, oneThree);
		appLayout.putConstraint(SpringLayout.EAST, twoTwo, 0, SpringLayout.EAST, oneTwo);
		appLayout.putConstraint(SpringLayout.WEST, twoTwo, 0, SpringLayout.WEST, oneTwo);
		appLayout.putConstraint(SpringLayout.SOUTH, oneOne, -590, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneOne, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneTwo, 50, SpringLayout.EAST, oneOne);
		appLayout.putConstraint(SpringLayout.EAST, oneTwo, -300, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneThree, 0, SpringLayout.NORTH, oneOne);
		appLayout.putConstraint(SpringLayout.WEST, oneThree, 50, SpringLayout.EAST, oneTwo);
		appLayout.putConstraint(SpringLayout.SOUTH, oneThree, 0, SpringLayout.SOUTH, oneOne);
		appLayout.putConstraint(SpringLayout.EAST, oneThree, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneTwo, 0, SpringLayout.NORTH, oneOne);
		appLayout.putConstraint(SpringLayout.SOUTH, oneTwo, 0, SpringLayout.SOUTH, oneOne);
		appLayout.putConstraint(SpringLayout.WEST, oneOne, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, oneOne, -550, SpringLayout.EAST, this);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 800));
		this.add(resetButton);
		this.add(oneOne);
		this.add(oneTwo);
		this.add(oneThree);
		this.add(twoOne);
		this.add(twoTwo);
		this.add(twoThree);
		this.add(threeOne);
		this.add(threeTwo);
		this.add(threeThree);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}
