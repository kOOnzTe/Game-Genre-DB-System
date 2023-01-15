import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SearchGameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idInput;

	/**
	 * Launch the application.
	 */
	GameFrame game=null;
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGameFrame frame = new SearchGameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SearchGameFrame(GameFrame g) {
		game=g;
		
		setTitle("Search Game\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 94, 367, 246);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idInput = new JTextField();
		idInput.setBounds(107, 38, 96, 19);
		contentPane.add(idInput);
		idInput.setColumns(10);
		
		JLabel gameIdLabel = new JLabel("Enter Game ID:");
		gameIdLabel.setBounds(22, 41, 102, 13);
		contentPane.add(gameIdLabel);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(idInput.getText().equalsIgnoreCase(""))
				{
					textArea.setText("Please enter an ID!");
				}else 
				{	
					if(GameSys.searchGame(Integer.parseInt(idInput.getText()))==null)
						textArea.setText("Game CANNOT found!!");
					else
					{
						textArea.setText(GameSys.searchGame(Integer.parseInt(idInput.getText())).toString());
					}
				}
				
			}
		});
		searchButton.setBounds(213, 37, 96, 21);
		contentPane.add(searchButton);
		
		JButton doneBtn = new JButton("Done");
		doneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setVisible(true);
				dispose();
			}
		});
		doneBtn.setBounds(323, 37, 85, 21);
		contentPane.add(doneBtn);
		
		JButton calculateHardnessButton = new JButton("Calculate Hardness");
		calculateHardnessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idInput.getText().equalsIgnoreCase(""))
					textArea.setText("Please enter an ID!!");
				else {
					String output=String.valueOf(GameSys.dispSelectedHardness(Integer.parseInt(idInput.getText())));
					textArea.setText("Hardness of the game is calculated!!\nHardness is: "+output);
				}
		
			}
		});
		calculateHardnessButton.setBounds(213, 68, 192, 21);
		contentPane.add(calculateHardnessButton);
		
		
		

	}
}
