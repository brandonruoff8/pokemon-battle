package DefaultPokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;


public class PokeFrame extends JFrame {
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	
	private GridLayout gridLayout = new GridLayout(2,2);
	private FlowLayout flowLayout = new FlowLayout();
	
	private JPanel battlePanel = new JPanel();
	private JPanel textPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	private JTextArea textArea = new JTextArea();
	
	private JLabel playerImageLabel = new JLabel();
	private JLabel brandonImageLabel = new JLabel();
	
	private ImageIcon playerPokeIcon = new ImageIcon();
	private ImageIcon brandonPokeIcon = new ImageIcon();
	
	private JButton move1Button = new JButton();
	private JButton move2Button = new JButton();
	private JButton move3Button = new JButton();
	private JButton move4Button = new JButton();
	private JButton enterButton = new JButton();
	
	private EnterListener enterListener = new EnterListener();

	
   public PokeFrame()
   {  
	  setSize(FRAME_WIDTH, FRAME_HEIGHT);
      createtextArea();
      createMoveButtons();
	  createIcons();
      createBattlePanel();
      createButtonPanel();
      createTextPanel(""); 
   }
   
   public void createMoveButtons() {
	   move1Button = new JButton("Move 1");
	   move2Button = new JButton("Move 2");
	   move3Button = new JButton("Move 3");
	   move4Button = new JButton("Move 4");
	   enterButton = new JButton("Enter");
   }
   
   public void createtextArea() {
	   textArea = new JTextArea(2, 50);
	   textArea.append("Brandon");
   }
   
   public void createIcons() {
	   playerPokeIcon = new ImageIcon("pictures/VenusaurPic.jpg");
	   playerImageLabel = new JLabel(playerPokeIcon);
	   playerImageLabel.setVisible(true);
	   
	   brandonPokeIcon = new ImageIcon("pictures/GalvantulaPic.jpg");
	   brandonImageLabel = new JLabel(brandonPokeIcon);
	   brandonImageLabel.setVisible(true);
   }
   
   public void createBattlePanel() {
	   battlePanel.add(playerImageLabel);
	   battlePanel.add(brandonImageLabel);
	   add(battlePanel);
   }
   
   public void createTextPanel() {
	   add(textPanel);
   }
   
   public void setLabelText(String text) {
	   
	   textArea.setText(text);
   }
   
   public void createTextPanel(String inputString) {
	   textPanel.setLayout(flowLayout);
	   textArea.append(inputString);
	   enterButton.addActionListener(enterListener);
	   textPanel.add(textArea);
	   textPanel.add(enterButton);
	   add(textPanel, BorderLayout.SOUTH);
   }
   
   public void createButtonPanel() {
	   buttonPanel.setLayout(gridLayout);
	   buttonPanel.add(move1Button);
	   buttonPanel.add(move2Button);
	   buttonPanel.add(move3Button);
	   buttonPanel.add(move4Button);
	   buttonPanel.setVisible(false);
   }
   
   public void enterButtonWait() {
	   
   }
   
   class EnterListener implements ActionListener
   {
     public void actionPerformed(ActionEvent event)
     {
    	 
     }
   } 
   
   public void setMoveButtons(Pokemon playerPoke) {
	   textPanel.setVisible(false);
	   move1Button.setText(playerPoke.getMoves()[0].getName());
	   move1Button.setBackground(playerPoke.getMoves()[0].getType().getColor());
	   move2Button.setText(playerPoke.getMoves()[1].getName());
	   move1Button.setBackground(playerPoke.getMoves()[0].getType().getColor());
	   move3Button.setText(playerPoke.getMoves()[2].getName());
	   move1Button.setBackground(playerPoke.getMoves()[0].getType().getColor());
	   move4Button.setText(playerPoke.getMoves()[3].getName());
	   move1Button.setBackground(playerPoke.getMoves()[0].getType().getColor());
	   buttonPanel.setVisible(true);
	   add(buttonPanel, BorderLayout.SOUTH);
   }
}
