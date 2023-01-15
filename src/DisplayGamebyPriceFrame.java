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

public class DisplayGamebyPriceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField minprice;
	private JTextField maxprice;

	/**
	 * Launch the application.
	 */
	GameFrame game=null;

	/**
	 * Create the frame.
	 */
	public DisplayGamebyPriceFrame(GameFrame g) 
	{
		setTitle("Display Game by Price");
		game=g;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Min Price:");
		lblNewLabel.setBounds(24, 6, 113, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Max Price:");
		lblNewLabel_1.setBounds(24, 34, 113, 16);
		contentPane.add(lblNewLabel_1);
		
		minprice = new JTextField();
		minprice.setBounds(128, 1, 92, 26);
		contentPane.add(minprice);
		minprice.setColumns(10);
		
		maxprice = new JTextField();
		maxprice.setBounds(128, 29, 92, 26);
		contentPane.add(maxprice);
		maxprice.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 80, 408, 226);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton displayButton = new JButton("Display");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(minprice.getText().isEmpty() || maxprice.getText().isEmpty())
				{
					textArea.setText("Please fill the blanks!");
				}
				else
				{
					double min = Double.parseDouble(minprice.getText().toString());
					double max = Double.parseDouble(maxprice.getText().toString());
					if(GameSys.displayTheGameByPrice(max, min) == null)
					{
						textArea.setText("Game that you search is not found!");
					}
					else
						textArea.setText(GameSys.displayTheGameByPrice(max, min));
				}
				
				
			}
		});
		displayButton.setBounds(253, 6, 160, 29);
		contentPane.add(displayButton);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(274, 39, 117, 29);
		contentPane.add(doneButton);
	}
}
