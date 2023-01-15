import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	EntranceFrame ent = null;
	SearchGameFrame s = new SearchGameFrame(this);
	RemoveGameFrame r=new RemoveGameFrame(this);
	AddGameFrame add=new AddGameFrame(this);
	DisplayGamebyPriceFrame ddp = new DisplayGamebyPriceFrame(this);
	DisplayGamebyName n = new DisplayGamebyName(this);
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame(EntranceFrame e) {
		setTitle("Game Frame\r\n");
		ent = e;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 62, 410, 277);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(GameSys.getReadcount() == 0)
					textArea.setText("Please read the database first");
				else
					textArea.setText(GameSys.displayAllGames());
			}
		});
		
		JButton readfromfile_btn = new JButton("Read All Games from Database");
		readfromfile_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(GameSys.readFromFile())
					textArea.setText("The database has read!");
				else
					textArea.setText("There is an error occured. File cannot be read!");
			}
		});
		readfromfile_btn.setBounds(17, 19, 243, 29);
		contentPane.add(readfromfile_btn);
		
		JButton btnNewButton = new JButton("Display All Games");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else	
					textArea.setText(GameSys.displayAllGames());
			}
		});
		btnNewButton.setBounds(270, 19, 158, 29);
		contentPane.add(btnNewButton);
		
		JButton searchGameButton = new JButton("Search Game");
		searchGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else
				{
					s.setVisible(true);
					setVisible(false);
				}
				
			}
		});
		searchGameButton.setBounds(439, 136, 191, 29);
		contentPane.add(searchGameButton);
		
		JButton addGameButton = new JButton("Add Game");
		addGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else
				{
					add.setVisible(true);
					setVisible(false);
				}
			}
		});
		addGameButton.setBounds(439, 177, 191, 29);
		contentPane.add(addGameButton);
		
		JButton calcNewPriceButton = new JButton("Calculate New Price");
		calcNewPriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else
				{
					GameSys.calcAllNewPrice();
					textArea.setText("New prices are calculated for all games!!");
				}
			}
		});
		calcNewPriceButton.setBounds(439, 216, 191, 29);
		contentPane.add(calcNewPriceButton);
		
		JButton removeGameButton = new JButton("Remove Game");
		removeGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");
				}
				else
				{
					r.setVisible(true);
					setVisible(false); 
				}
			}
		});
		removeGameButton.setBounds(439, 255, 191, 29);
		contentPane.add(removeGameButton);
		
		JButton displayGamesbyPriceButton = new JButton("Display Game by Price");
		displayGamesbyPriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else
				{
					ddp.setVisible(true);
					dispose(); 
				}
			}
		});
		displayGamesbyPriceButton.setBounds(440, 19, 191, 29);
		contentPane.add(displayGamesbyPriceButton);
		
		JButton btnNewButton_1 = new JButton("Display Game by Name");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(GameSys.getReadcount() == 0)
				{
					textArea.setText("The Database did not read by the System." + "\n" + "Thus, please click the 'Read All Games from Database' button first!");				}
				else
				{
					n.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1.setBounds(439, 59, 191, 29);
		contentPane.add(btnNewButton_1);
	}
}
