import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class DisplayGamebyName extends JFrame 
{

	private JPanel contentPane;
	private JTextField gamename;

	/**
	 * Launch the application.
	 */
	GameFrame game=null;

	/**
	 * Create the frame.
	 */
	public DisplayGamebyName(GameFrame g) 
	{
		setTitle("Display Game by Name");
		game=g;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name of the Game:");
		lblNewLabel.setBounds(24, 6, 207, 16);
		contentPane.add(lblNewLabel);
		
		gamename = new JTextField();
		gamename.setBounds(186, 1, 160, 26);
		contentPane.add(gamename);
		gamename.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 80, 408, 226);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton displayButton = new JButton("Display");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(gamename.getText().isEmpty())
				{
					textArea.setText("Please fill the blanks!");
				}
				else
				{
					String game = gamename.getText().toString();
					if(GameSys.displayTheGame(game) == null)
					{
						textArea.setText("Game is not found");
					}
					else
					{
						textArea.setText(GameSys.displayTheGame(game));
					}
				}
				
				
			}
		});
		displayButton.setBounds(56, 39, 160, 29);
		contentPane.add(displayButton);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(254, 39, 117, 29);
		contentPane.add(doneButton);
	}
}
