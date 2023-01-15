import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EntranceFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	GameFrame g = new GameFrame(this);
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntranceFrame frame = new EntranceFrame();
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
	public EntranceFrame() {
		setTitle("Welcome to the Game Genre System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) 
				{
					g.setVisible(true);
					dispose();
				}
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBounds(151, 51, 300, 200);
		contentPane.add(lblNewLabel);
		
		//inserting an image 
		ImageIcon icon = new ImageIcon("Images/entrance.png"); //221Project/Images/entrance.png
		Image img = icon.getImage();
		Image modifiedimage = img.getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(modifiedimage);
		lblNewLabel.setIcon(icon);
		
		JButton btnNewButton = new JButton("Let's Get Started!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				g.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) 
				{
					g.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(185, 294, 235, 29);
		contentPane.add(btnNewButton);
		
		
		
	}
}
