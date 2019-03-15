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
	
	public LightPanel(LightController appController)
	{
		super();
		this.appController = appController;
		
		resetButton = new JButton("Reset");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.SOUTH, resetButton, -67, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -205, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 800));
		this.add(resetButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}
