package view;

import javax.swing.JFrame;
import controller.LightController;

public class LightFrame extends JFrame
{
	private LightController appController;
	private LightPanel appPanel;
	
	public LightFrame(LightController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new LightPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Lights Out!");
		this.setResizable(false);
		this.setVisible(true);
	}
}
