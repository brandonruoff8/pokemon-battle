package DefaultPokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PokeFrame extends JFrame {
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	
	private GridLayout gridLayout = new GridLayout(2,2);
	
	private JPanel battlePanel = new JPanel();
	private JPanel textPanel = new JPanel();
	private JPanel movePanel = new JPanel();
	
	private JTextField textField = new JTextField();
	
	private JLabel playerImageLabel = new JLabel();
	private JLabel brandonImageLabel = new JLabel();
	
	private ImageIcon playerPokeIcon = new ImageIcon();
	private ImageIcon brandonPokeIcon = new ImageIcon();
	
	private JButton move1Button = new JButton();
	private JButton move2Button = new JButton();
	private JButton move3Button = new JButton();
	private JButton move4Button = new JButton();

	
   public PokeFrame()
   {              
//      createTextField();
      //createMoveButtons();
	  createIcons();
      createBattlePanel();
      createBottomPanel();
//      createTextPanel();

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
   public void createMoveButtons() {
	   move1Button = new JButton("Move 1");
	   move2Button = new JButton("Move 2");
	   move3Button = new JButton("Move 3");
	   move4Button = new JButton("Move 4");
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
	   textField = new JTextField(20);
	   textField.setText("");
	   add(textPanel);
   }
   
   public void setLabelText(String inputString) {
	   textField.setText(inputString);
   }
   
   public void createBottomPanel() {
	   movePanel.setLayout(gridLayout);
	   movePanel.add(move1Button);
	   movePanel.add(move2Button);
	   movePanel.add(move3Button);
	   movePanel.add(move4Button);
	   add(movePanel, BorderLayout.SOUTH);   
   }
}
