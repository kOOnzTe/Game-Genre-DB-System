import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class RemoveGameFrame extends JFrame {

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
					RemoveGameFrame frame = new RemoveGameFrame();
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
	public RemoveGameFrame(GameFrame g) {
		game=g;
		setTitle("Remove Game\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 105, 306, 148);
		contentPane.add(textArea);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel gameIdLabel = new JLabel("Game ID:");
		gameIdLabel.setBounds(32, 43, 58, 13);
		contentPane.add(gameIdLabel);
		
		idInput = new JTextField();
		idInput.setBounds(100, 40, 124, 19);
		contentPane.add(idInput);
		idInput.setColumns(10);
		
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idInput.getText().equalsIgnoreCase(""))
				{
					textArea.setText("Please enter a valid ID to remove!!");
				}
				else{
					if(!GameSys.removeGame(Integer.parseInt(idInput.getText())))
					{
						textArea.setText("There is no game related to this ID to be removed!!");
					}
					else
					{
						textArea.setText("Successfully Removed!!");
					}
							
				}
			}
		});
		removeButton.setBounds(253, 22, 85, 21);
		contentPane.add(removeButton);
		
		JButton btnNewButton_1 = new JButton("Done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(253, 56, 85, 21);
		contentPane.add(btnNewButton_1);
		
	}

}
