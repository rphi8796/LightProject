package view;

import controller.LightController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
	private JButton startButton;
	private ArrayList<ArrayList<Integer>> grid;
	private ArrayList<Integer> rowOne;
	private ArrayList<Integer> rowTwo;
	private ArrayList<Integer> rowThree;
	
	public LightPanel(LightController appController)
	{
		super();
		this.appController = appController;
		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		startButton = new JButton("Start");
		startButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
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
		appLayout.putConstraint(SpringLayout.NORTH, startButton, 0, SpringLayout.NORTH, resetButton);
		appLayout.putConstraint(SpringLayout.WEST, startButton, -108, SpringLayout.EAST, oneOne);
		appLayout.putConstraint(SpringLayout.SOUTH, startButton, 0, SpringLayout.SOUTH, resetButton);
		appLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, oneOne);
		
		colorChangePossible();
		createGrid();
		setupPanel();
		setupLayout();
		setupListeners();
		
		
		System.out.println(grid);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 800));
		this.add(startButton);
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
	
	private void colorChangePossible()
	{
		oneOne.setOpaque(true);
		oneTwo.setOpaque(true);
		oneThree.setOpaque(true);
		twoOne.setOpaque(true);
		twoTwo.setOpaque(true);
		twoThree.setOpaque(true);
		threeOne.setOpaque(true);
		threeTwo.setOpaque(true);
		threeThree.setOpaque(true);
		oneOne.setBorderPainted(false);
		oneTwo.setBorderPainted(false);
		oneThree.setBorderPainted(false);
		twoOne.setBorderPainted(false);
		twoTwo.setBorderPainted(false);
		twoThree.setBorderPainted(false);
		threeOne.setBorderPainted(false);
		threeTwo.setBorderPainted(false);
		threeThree.setBorderPainted(false);

	}
	
	private void createGrid()
	{
		grid = new ArrayList<ArrayList<Integer>>();
		rowOne = new ArrayList<Integer>();
		rowTwo = new ArrayList<Integer>();
		rowThree = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++)
		{
			int value = (int) (Math.random() * 2);
			rowOne.add(value);
		}
		for(int i = 0; i < 3; i++)
		{
			int value = (int) (Math.random() * 2);
			rowTwo.add(value);
		}
		for(int i = 0; i < 3; i++)
		{
			int value = (int) (Math.random() * 2);
			rowThree.add(value);
		}
		
		grid.add(rowOne);
		grid.add(rowTwo);
		grid.add(rowThree);
	}
	
	private void refresh()
	{
		
		if (rowOne.get(0) == 0)
		{
			oneOne.setBackground(Color.GRAY);
		}
		else
		{
			oneOne.setBackground(Color.WHITE);
		}
		
		if (rowOne.get(1) == 0)
		{
			oneTwo.setBackground(Color.GRAY);
		}
		else
		{
			oneTwo.setBackground(Color.WHITE);
		}
		
		if (rowOne.get(2) == 0)
		{
			oneThree.setBackground(Color.GRAY);
		}
		else
		{
			oneThree.setBackground(Color.WHITE);
		}
		
		if (rowTwo.get(0) == 0)
		{
			twoOne.setBackground(Color.GRAY);
		}
		else
		{
			twoOne.setBackground(Color.WHITE);
		}
		
		if (rowTwo.get(1) == 0)
		{
			twoTwo.setBackground(Color.GRAY);
		}
		else
		{
			twoTwo.setBackground(Color.WHITE);
		}
		
		if (rowTwo.get(2) == 0)
		{
			twoThree.setBackground(Color.GRAY);
		}
		else
		{
			twoThree.setBackground(Color.WHITE);
		}
		
		if (rowThree.get(0) == 0)
		{
			threeOne.setBackground(Color.GRAY);
		}
		else
		{
			threeOne.setBackground(Color.WHITE);
		}
		
		if (rowThree.get(1) == 0)
		{
			threeTwo.setBackground(Color.GRAY);
		}
		else
		{
			threeTwo.setBackground(Color.WHITE);
		}
		
		if (rowThree.get(2) == 0)
		{
			threeThree.setBackground(Color.GRAY);
		}
		else
		{
			threeThree.setBackground(Color.WHITE);
		}
		
		int total = 0;
		for (int nums : rowOne)
		{
			total += nums;
		}
		for (int nums : rowTwo)
		{
			total += nums;
		}
		for (int nums : rowThree)
		{
			total += nums;
		}
		if(total == 0)
		{
			JOptionPane.showMessageDialog(null, "YOU WIN!!");
		}
	}
	
	private int change(int value)
	{
		if (value == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, threeThree, 550, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, threeThree, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, threeTwo, -300, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, threeThree, 450, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, threeThree, -150, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, threeTwo, 450, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, threeTwo, 300, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, threeOne, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, threeOne, -150, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, threeOne, -550, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoThree, 230, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, twoThree, 550, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoThree, -370, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, twoThree, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoTwo, 230, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, twoTwo, -300, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, oneTwo, 300, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, twoTwo, 300, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, twoOne, 230, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, twoOne, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, twoOne, -550, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneThree, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, oneThree, -250, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneThree, -590, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneTwo, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneTwo, -590, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, threeTwo, -150, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, -100, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, oneThree);
		appLayout.putConstraint(SpringLayout.SOUTH, resetButton, -39, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -142, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoTwo, -370, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoOne, -370, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, threeOne, 450, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, oneOne, -590, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, oneOne, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, oneTwo, -300, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, oneThree, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, oneOne, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, oneOne, -550, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		oneOne.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(0, change(rowOne.get(0)));
				rowOne.set(1, change(rowOne.get(1)));
				rowTwo.set(0, change(rowTwo.get(0)));
				refresh();
			}
		});
		
		oneTwo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(0, change(rowOne.get(0)));
				rowOne.set(1, change(rowOne.get(1)));
				rowOne.set(2, change(rowOne.get(2)));
				rowTwo.set(1, change(rowTwo.get(1)));
				refresh();
			}
		});
		
		oneThree.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(1, change(rowOne.get(1)));
				rowOne.set(2, change(rowOne.get(2)));
				rowTwo.set(2, change(rowTwo.get(2)));
				refresh();
			}
		});
		
		twoOne.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(0, change(rowOne.get(0)));
				rowTwo.set(0, change(rowTwo.get(0)));
				rowTwo.set(1, change(rowTwo.get(1)));
				rowThree.set(0, change(rowThree.get(0)));
				refresh();
			}
		});
		
		twoTwo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(1, change(rowOne.get(1)));
				rowTwo.set(0, change(rowTwo.get(0)));
				rowTwo.set(1, change(rowTwo.get(1)));
				rowTwo.set(2, change(rowTwo.get(2)));
				rowThree.set(1, change(rowThree.get(1)));
				refresh();
			}
		});
		
		twoThree.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowOne.set(2, change(rowOne.get(2)));
				rowTwo.set(1, change(rowTwo.get(1)));
				rowTwo.set(2, change(rowTwo.get(2)));
				rowThree.set(2, change(rowThree.get(2)));
				refresh();
			}
		});
		
		threeOne.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowTwo.set(0, change(rowTwo.get(0)));
				rowThree.set(0, change(rowThree.get(0)));
				rowThree.set(1, change(rowThree.get(1)));
				refresh();
			}
		});
		
		threeTwo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowTwo.set(1, change(rowTwo.get(1)));
				rowThree.set(0, change(rowThree.get(0)));
				rowThree.set(1, change(rowThree.get(1)));
				rowThree.set(2, change(rowThree.get(2)));
				refresh();
			}
		});
		
		threeThree.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				rowTwo.set(2, change(rowTwo.get(2)));
				rowThree.set(1, change(rowThree.get(1)));
				rowThree.set(2, change(rowThree.get(2)));
				refresh();
			}
		});
		
		
		startButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				refresh();
			}
		});
		
		resetButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				createGrid();
				refresh();
			}
		});
		
		
	}
	
	
}
