import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class AddGameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	GameFrame game=null;
	private JTextField idText;
	private JTextField nameText;
	private JTextField genreText;
	private JTextField publisherText;
	private JTextField priceText;
	private JTextField devText;
	private JTextField ageText;
	private JTextField dateText;
	private JTextField languagesText;
	private JTextField playerCountText;
	private JTextField controllerCountText;
	private JTextField sizeText;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField hardwareText;
	private JTextField enviromentSizeText;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JTextField timeText;
	private JTextField learningCurveText;
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGameFrame frame = new AddGameFrame();
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
	public AddGameFrame(GameFrame g) {
		setTitle("Add Game\r\n");
		game=g;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Console Game", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(364, 33, 291, 296);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel inAppPurchaseLabel = new JLabel("In App Purchases:");
		inAppPurchaseLabel.setBounds(21, 25, 132, 13);
		panel_1.add(inAppPurchaseLabel);
		
		JLabel diskReaderLabel = new JLabel("Disk Reader:");
		diskReaderLabel.setBounds(21, 48, 81, 13);
		panel_1.add(diskReaderLabel);
		
		JLabel numOfControllerLabel = new JLabel("Controller Count:");
		numOfControllerLabel.setBounds(21, 71, 124, 13);
		panel_1.add(numOfControllerLabel);
		
		JLabel sizeLabel = new JLabel("Size:");
		sizeLabel.setBounds(21, 94, 45, 13);
		panel_1.add(sizeLabel);
		
		JLabel isMultiplayerLabel = new JLabel("Is Multiplayer:");
		isMultiplayerLabel.setBounds(21, 117, 105, 13);
		panel_1.add(isMultiplayerLabel);
		
		JRadioButton inAppYes = new JRadioButton("Yes");
		inAppYes.setToolTipText("true");
		inAppYes.setSelected(true);
		buttonGroup.add(inAppYes);
		inAppYes.setBounds(155, 21, 71, 21);
		panel_1.add(inAppYes);
		
		JRadioButton inAppNo = new JRadioButton("No");
		inAppNo.setToolTipText("false");
		inAppNo.setSelected(true);
		buttonGroup.add(inAppNo);
		inAppNo.setBounds(203, 22, 71, 21);
		panel_1.add(inAppNo);
		
		JRadioButton diskNo = new JRadioButton("No");
		diskNo.setSelected(true);
		buttonGroup_1.add(diskNo);
		diskNo.setBounds(202, 45, 72, 21);
		panel_1.add(diskNo);
		
		JRadioButton diskYes = new JRadioButton("Yes");
		diskYes.setSelected(true);
		buttonGroup_1.add(diskYes);
		diskYes.setBounds(155, 45, 71, 21);
		panel_1.add(diskYes);
		
		JRadioButton isMCNo = new JRadioButton("No");
		isMCNo.setSelected(true);
		buttonGroup_2.add(isMCNo);
		isMCNo.setBounds(203, 115, 55, 21);
		panel_1.add(isMCNo);
		
		JRadioButton isMCYes = new JRadioButton("Yes");
		isMCYes.setSelected(true);
		buttonGroup_2.add(isMCYes);
		isMCYes.setBounds(155, 115, 71, 21);
		panel_1.add(isMCYes);
		
		controllerCountText = new JTextField();
		controllerCountText.setEnabled(false);
		controllerCountText.setBounds(151, 68, 96, 19);
		panel_1.add(controllerCountText);
		controllerCountText.setColumns(10);
		
		sizeText = new JTextField();
		sizeText.setEnabled(false);
		sizeText.setBounds(151, 91, 96, 19);
		panel_1.add(sizeText);
		sizeText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Region:");
		lblNewLabel.setBounds(31, 149, 61, 16);
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(21, 177, 251, 102);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Currency:");
		lblNewLabel_1.setBounds(18, 37, 60, 16);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Language:");
		lblNewLabel_2.setBounds(18, 65, 81, 16);
		panel_4.add(lblNewLabel_2);
		
		JComboBox comboBoxLanguage = new JComboBox();
		comboBoxLanguage.setBounds(125, 61, 120, 27);
		panel_4.add(comboBoxLanguage);
		comboBoxLanguage.setEnabled(false);
		
		
		
		JComboBox comboBoxCurrency = new JComboBox();
		comboBoxCurrency.setBounds(125, 33, 120, 27);
		panel_4.add(comboBoxCurrency);
		comboBoxCurrency.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("Country Name:");
		lblNewLabel_3.setBounds(17, 9, 104, 16);
		panel_4.add(lblNewLabel_3);
		
		JComboBox comboBoxCountryName = new JComboBox();
		comboBoxCountryName.setModel(new DefaultComboBoxModel(new String[] {"-"}));
		comboBoxCountryName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			
				if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("China")) {
					
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("Standart Chinese");
					comboBoxLanguage.addItem("Mandarin Chinese");
					
					comboBoxCurrency.addItem("Yuan");
					comboBoxCurrency.addItem("US Dollar");
					
					
				}
				else if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("Japan")){
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("Japanese");
					
					comboBoxCurrency.addItem("Yen");
					comboBoxCurrency.addItem("US Dollar");
				}
				
				else if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("Turkey")) {
					
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("Turkish");
					
					
					comboBoxCurrency.addItem("TL");
					
					
					
					}
					else if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("Switzerland")) {
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("German");
					comboBoxLanguage.addItem("French");
					comboBoxLanguage.addItem("Italian");
					
					
					
					comboBoxCurrency.addItem("Frank");
					comboBoxCurrency.addItem("Euro");
				}	
					else if (comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("Spain")){
						comboBoxLanguage.removeAllItems();
						comboBoxCurrency.removeAllItems();
						
						comboBoxLanguage.addItem("Spanish");
						comboBoxLanguage.addItem("English");
						
					
						comboBoxCurrency.addItem("Euro");
					}
					else if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("USA")) {
					
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("English");
					comboBoxLanguage.addItem("Spanish");
					
					comboBoxCurrency.addItem("US Dollar");
					
					
					
				}
				else if(comboBoxCountryName.getSelectedItem().toString().equalsIgnoreCase("Mexico")){
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxLanguage.addItem("Spanish");
					
					comboBoxCurrency.addItem("Pesos");
					comboBoxCurrency.addItem("US Dollar");
				
				}
				else {
					comboBoxLanguage.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
				}
				
			}
		});
		comboBoxCountryName.setEnabled(false);
		comboBoxCountryName.setBounds(125, 5, 120, 27);
		panel_4.add(comboBoxCountryName);
		
		
		JComboBox comboBoxRegion = new JComboBox();
		comboBoxRegion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxCountryName.enable();
				comboBoxCurrency.enable();
				comboBoxLanguage.enable();
				
				int size = comboBoxCountryName.getItemCount();
				System.out.println(size);
				if(comboBoxRegion.getSelectedIndex() == 0) {
					
					for(int i = size-1; i>0;i--)
						comboBoxCountryName.removeItemAt(i);
					
					
					comboBoxCountryName.addItem("China");
					comboBoxCountryName.addItem("Japan");
					
					
				}
				else if(comboBoxRegion.getSelectedIndex() == 1) {
					for(int i = size-1; i>0;i--)
						comboBoxCountryName.removeItemAt(i);
					
					comboBoxCountryName.addItem("Turkey");
					comboBoxCountryName.addItem("Switzerland");
					comboBoxCountryName.addItem("Spain");
					
						
				}
				else if(comboBoxRegion.getSelectedIndex() == 2){
					for(int i = size-1; i>0;i--)
						comboBoxCountryName.removeItemAt(i);
					
					comboBoxCountryName.addItem("USA");
					comboBoxCountryName.addItem("Mexico");
					

					
					
				}
			}
		});
		comboBoxRegion.setEnabled(false);
		comboBoxRegion.setModel(new DefaultComboBoxModel(new String[] {"Asia", "Europe", "America"}));
		comboBoxRegion.setBounds(155, 145, 96, 27);
		panel_1.add(comboBoxRegion);
		

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "VrGame", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 318, 342, 165);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel extraHardwareLabel = new JLabel("Extra Hardware:");
		extraHardwareLabel.setBounds(10, 32, 136, 13);
		panel_2.add(extraHardwareLabel);
		
		JLabel hardwareRequirementLabel = new JLabel("Hardware Requirement:");
		hardwareRequirementLabel.setBounds(10, 55, 162, 13);
		panel_2.add(hardwareRequirementLabel);
		
		JLabel environmentSizeLabel = new JLabel("Environment Size:");
		environmentSizeLabel.setBounds(10, 81, 148, 13);
		panel_2.add(environmentSizeLabel);
		
		JLabel environmentTypeLabel = new JLabel("Environment Type:");
		environmentTypeLabel.setBounds(10, 106, 136, 13);
		panel_2.add(environmentTypeLabel);
		
		JLabel isMultiplayerLabel2 = new JLabel("Is Multiplayer:");
		isMultiplayerLabel2.setBounds(10, 127, 110, 13);
		panel_2.add(isMultiplayerLabel2);
		
		JRadioButton extraHardNo = new JRadioButton("No");
		extraHardNo.setSelected(true);
		buttonGroup_3.add(extraHardNo);
		extraHardNo.setBounds(237, 24, 62, 21);
		panel_2.add(extraHardNo);
		
		JRadioButton extraHardYes = new JRadioButton("Yes");
		extraHardYes.setSelected(true);
		buttonGroup_3.add(extraHardYes);
		extraHardYes.setBounds(190, 24, 54, 21);
		panel_2.add(extraHardYes);
		
		JRadioButton isMNo = new JRadioButton("No");
		isMNo.setSelected(true);
		buttonGroup_4.add(isMNo);
		isMNo.setBounds(237, 127, 62, 21);
		panel_2.add(isMNo);
		
		JRadioButton isMYes = new JRadioButton("Yes");
		isMYes.setSelected(true);
		buttonGroup_4.add(isMYes);
		isMYes.setBounds(190, 127, 62, 21);
		panel_2.add(isMYes);
		
		hardwareText = new JTextField();
		hardwareText.setEnabled(false);
		hardwareText.setColumns(10);
		hardwareText.setBounds(184, 49, 96, 19);
		panel_2.add(hardwareText);
		
		enviromentSizeText = new JTextField();
		enviromentSizeText.setEnabled(false);
		enviromentSizeText.setColumns(10);
		enviromentSizeText.setBounds(184, 75, 96, 19);
		panel_2.add(enviromentSizeText);
		
		JComboBox comboBoxEnvironment = new JComboBox();
		comboBoxEnvironment.setModel(new DefaultComboBoxModel(new String[] {"Open World", "One Room"}));
		comboBoxEnvironment.setEnabled(false);
		comboBoxEnvironment.setBounds(173, 100, 126, 27);
		panel_2.add(comboBoxEnvironment);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "TabletopGame", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(364, 341, 291, 129);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel timeLabel = new JLabel("Time:");
		timeLabel.setBounds(10, 31, 97, 13);
		panel_3.add(timeLabel);
		
		JLabel learningCurveLabel = new JLabel("Learning Curve:");
		learningCurveLabel.setBounds(10, 60, 123, 13);
		panel_3.add(learningCurveLabel);
		
		JLabel isDeterministicLabel = new JLabel("Is Deterministic:");
		isDeterministicLabel.setBounds(10, 91, 125, 13);
		panel_3.add(isDeterministicLabel);
		
		timeText = new JTextField();
		timeText.setEnabled(false);
		timeText.setColumns(10);
		timeText.setBounds(148, 28, 96, 19);
		panel_3.add(timeText);
		
		learningCurveText = new JTextField();
		learningCurveText.setEnabled(false);
		learningCurveText.setColumns(10);
		learningCurveText.setBounds(148, 57, 96, 19);
		panel_3.add(learningCurveText);
		
		JRadioButton isDetYes = new JRadioButton("Yes");
		isDetYes.setSelected(true);
		isDetYes.setToolTipText("Yes");
		buttonGroup_5.add(isDetYes);
		isDetYes.setBounds(129, 86, 71, 21);
		panel_3.add(isDetYes);
		
		JRadioButton isDetNo = new JRadioButton("No");
		isDetNo.setSelected(true);
		isDetNo.setToolTipText("No");
		buttonGroup_5.add(isDetNo);
		isDetNo.setBounds(204, 86, 59, 21);
		panel_3.add(isDetNo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Game", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 33, 342, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel idLabel = new JLabel("  ID:");
		idLabel.setBounds(10, 50, 45, 13);
		panel.add(idLabel);
		
		JLabel nameLabel = new JLabel("  Name:");
		nameLabel.setBounds(8, 71, 85, 13);
		panel.add(nameLabel);
		
		JLabel genreLabel = new JLabel("  Genre:");
		genreLabel.setBounds(9, 92, 74, 13);
		panel.add(genreLabel);
		
		JLabel publisherLabel = new JLabel("  Publisher:");
		publisherLabel.setBounds(10, 113, 87, 13);
		panel.add(publisherLabel);
		
		JLabel priceLabel = new JLabel("  Price:");
		priceLabel.setBounds(11, 134, 45, 13);
		panel.add(priceLabel);
		
		JLabel developerLabel = new JLabel("  Developer:");
		developerLabel.setBounds(9, 155, 87, 13);
		panel.add(developerLabel);
		
		JLabel minAgeRestrictionLabel = new JLabel("  Min Age Restriction:");
		minAgeRestrictionLabel.setBounds(10, 176, 161, 13);
		panel.add(minAgeRestrictionLabel);
		
		JLabel releaseDateLabel = new JLabel("  Release Date:");
		releaseDateLabel.setBounds(10, 197, 98, 13);
		panel.add(releaseDateLabel);
		
		JLabel supportedLanguagesLabel = new JLabel("  Supported Languages:");
		supportedLanguagesLabel.setBounds(9, 218, 162, 13);
		panel.add(supportedLanguagesLabel);
		
		JLabel playerCountLabel = new JLabel("  Player Count:");
		playerCountLabel.setBounds(11, 239, 113, 13);
		panel.add(playerCountLabel);
		
		idText = new JTextField();
		idText.setBounds(183, 50, 96, 19);
		panel.add(idText);
		idText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setBounds(183, 71, 96, 19);
		panel.add(nameText);
		nameText.setColumns(10);
		
		genreText = new JTextField();
		genreText.setColumns(10);
		genreText.setBounds(183, 92, 96, 19);
		panel.add(genreText);
		
		publisherText = new JTextField();
		publisherText.setColumns(10);
		publisherText.setBounds(183, 113, 96, 19);
		panel.add(publisherText);
		
		priceText = new JTextField();
		priceText.setColumns(10);
		priceText.setBounds(183, 134, 96, 19);
		panel.add(priceText);
		
		devText = new JTextField();
		devText.setColumns(10);
		devText.setBounds(183, 155, 96, 19);
		panel.add(devText);
		
		ageText = new JTextField();
		ageText.setColumns(10);
		ageText.setBounds(182, 176, 96, 19);
		panel.add(ageText);
		
		dateText = new JTextField();
		dateText.setColumns(10);
		dateText.setBounds(182, 197, 96, 19);
		panel.add(dateText);
		
		languagesText = new JTextField();
		languagesText.setColumns(10);
		languagesText.setBounds(183, 218, 96, 19);
		panel.add(languagesText);
		
		playerCountText = new JTextField();
		playerCountText.setColumns(10);
		playerCountText.setBounds(182, 239, 96, 19);
		panel.add(playerCountText);
		
		//for the first add button execution -bug solver-
		extraHardYes.setEnabled(false);
		extraHardNo.setEnabled(false);
		isMYes.setEnabled(false);
		isMNo.setEnabled(false);
		isDetYes.setEnabled(false);
		isDetNo.setEnabled(false);
		
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setBounds(142, 17, 137, 21);
		panel.add(comboBoxType);
		comboBoxType.addItemListener(new ItemListener() {
			@SuppressWarnings("deprecation")
			public void itemStateChanged(ItemEvent e) 
			{	
				
				if(comboBoxType.getSelectedIndex() == 0) //console game
				{
					//console
				//enable console's buttons
				inAppYes.setEnabled(true);
				inAppNo.setEnabled(true);
				diskYes.setEnabled(true);
				diskNo.setEnabled(true);
				isMCYes.setEnabled(true);
				isMCNo.setEnabled(true);
					
				controllerCountText.enable();
				sizeText.enable();
				comboBoxRegion.enable();
				
				
				//vr
				extraHardYes.setEnabled(false);
				extraHardNo.setEnabled(false);
				isMYes.setEnabled(false);
				isMNo.setEnabled(false);
				
				extraHardYes.disable();
				extraHardNo.disable();
				hardwareText.disable();
				enviromentSizeText.disable();
				comboBoxEnvironment.disable();
				hardwareText.setText("");
				enviromentSizeText.setText("");
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				
				
				
				//tabletop
				isDetYes.setEnabled(false);
				isDetNo.setEnabled(false);
				
				timeText.disable();
				learningCurveText.disable();
				timeText.setText("");
				learningCurveText.setText("");
				buttonGroup_5.clearSelection();
				
				}
				else if(comboBoxType.getSelectedIndex() == 1) //vr game
				{
					
					
					//vr
					extraHardYes.setEnabled(true);
					extraHardNo.setEnabled(true);
					isMYes.setEnabled(true);
					isMNo.setEnabled(true);
					
					extraHardYes.enable();
					extraHardNo.enable();
					hardwareText.enable();
					enviromentSizeText.enable();
					comboBoxEnvironment.enable();
					
					
					//console
					inAppYes.setEnabled(false);
					inAppNo.setEnabled(false);
					diskYes.setEnabled(false);
					diskNo.setEnabled(false);
					isMCYes.setEnabled(false);
					isMCNo.setEnabled(false);
					
					buttonGroup.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_1.clearSelection();
					controllerCountText.disable();
					sizeText.disable();
					comboBoxRegion.disable();
					comboBoxCurrency.disable();
					comboBoxLanguage.disable();
					comboBoxCountryName.disable();
					controllerCountText.setText("");
					sizeText.setText("");
					comboBoxCountryName.setSelectedIndex(0);
					
					
					
					//tabletop
					isDetYes.setEnabled(false);
					isDetNo.setEnabled(false);
					
					timeText.disable();
					learningCurveText.disable();
					timeText.setText("");
					learningCurveText.setText("");
					buttonGroup_5.clearSelection();
					
				}
				else //tabletop 
				{
					//tabletop
					isDetYes.setEnabled(true);
					isDetNo.setEnabled(true);
					
					timeText.enable();
					learningCurveText.enable();
			
					
					//console
					inAppYes.setEnabled(false);
					inAppNo.setEnabled(false);
					diskYes.setEnabled(false);
					diskNo.setEnabled(false);
					isMCYes.setEnabled(false);
					isMCNo.setEnabled(false);
					
					buttonGroup.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_1.clearSelection();
					controllerCountText.disable();
					sizeText.disable();
					comboBoxRegion.disable();
					comboBoxCurrency.disable();
					comboBoxLanguage.disable();
					comboBoxCountryName.disable();
					controllerCountText.setText("");
					sizeText.setText("");
					comboBoxCountryName.setSelectedIndex(0);
					
					//vr
					extraHardYes.setEnabled(false);
					extraHardNo.setEnabled(false);
					isMYes.setEnabled(false);
					isMNo.setEnabled(false);
					
					extraHardYes.disable();
					extraHardNo.disable();
					hardwareText.disable();
					enviromentSizeText.disable();
					comboBoxEnvironment.disable();
					hardwareText.setText("");
					enviromentSizeText.setText("");
					buttonGroup_3.clearSelection();
					buttonGroup_4.clearSelection();
				}
			}
		});
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"ConsoleGame", "VrGame", "TableTop"}));
		
		

		JLabel typeLabel = new JLabel("Type:");
		typeLabel.setBounds(10, 20, 45, 13);
		panel.add(typeLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(671, 189, 184, 285);
		contentPane.add(textArea);
		
		JButton addGameButton = new JButton("Add Game");
		addGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(idText.getText().isEmpty() || nameText.getText().isEmpty() ||  genreText.getText().isEmpty()|| publisherText.getText().isEmpty() ||  priceText.getText().isEmpty()
						|| devText.getText().isEmpty() ||  ageText.getText().isEmpty() ||  dateText.getText().isEmpty()||  languagesText.getText().isEmpty() || playerCountText.getText().isEmpty())
					{
					System.out.println("bos");
					textArea.setText("Please fill Game panel!");
				}
				else {
					
					int id = Integer.parseInt(idText.getText().toString());
					String type = comboBoxType.getSelectedItem().toString();
					String name = nameText.getText().toString();
					String genre = genreText.getText().toString();
					String publisher = publisherText.getText().toString();
					double price = Double.parseDouble(priceText.getText().toString());
					String developer = devText.getText().toString();
					int minAgeRestriction = Integer.parseInt(ageText.getText().toString());
					String releaseDate = dateText.getText().toString();
					String[] supportedLanguages = languagesText.getText().toString().split(" ");
					int playerCount = Integer.parseInt(playerCountText.getText().toString());
					
					
					if(comboBoxType.getSelectedIndex() == 0) {
						
						if(buttonGroup.isSelected(null) || buttonGroup_1.isSelected(null) || buttonGroup_2.isSelected(null) || controllerCountText.getText().isEmpty() || sizeText.getText().isEmpty() ) {
							System.out.println("radio");
							textArea.setText("Please fill the selected Game Type panel!");
						}
						else {
							if(comboBoxCountryName.getSelectedItem().toString().equals("-")) {
								textArea.setText("Please select a Country!");
							}
							else {
								Region r = new Region(comboBoxCountryName.getSelectedItem().toString(),comboBoxCurrency.getSelectedItem().toString(),comboBoxLanguage.getSelectedItem().toString());
								
								ArrayList<Region> ar = new ArrayList<Region>();
								ar.add(r);
								boolean inAppPurchases = inAppYes.isSelected();
								boolean diskReader = diskYes.isSelected();
								int numOfController = Integer.parseInt(controllerCountText.getText().toString());
								double size = Double.parseDouble(sizeText.getText().toString());
								boolean isMultiplayerC = isMCYes.isSelected();
								
								if(!GameSys.addGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount, inAppPurchases, diskReader, numOfController, size, isMultiplayerC, ar, false, null, 0, null, 0, null, false))
								textArea.setText("There is a game with that id! Change the id.");
								else
									textArea.setText("Game with "+id+" id added.");

								
							}
						}
					}
					else if(comboBoxType.getSelectedIndex() == 1) {
						
						if(buttonGroup_3.isSelected(null) || hardwareText.getText().isEmpty() || enviromentSizeText.getText().isEmpty() || buttonGroup_4.isSelected(null)){
							textArea.setText("Please fill the selected Game Type panel!");
						}
						else {
						
						boolean extraHardware = extraHardYes.isSelected();
						String hardwareRequirement = hardwareText.getText().toString();
						double environmentSize = Double.parseDouble(enviromentSizeText.getText().toString());
						String environmentType = comboBoxEnvironment.getSelectedItem().toString();
						boolean isMultiplayer = isMYes.isSelected();
						
						
						if(!GameSys.addGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount, false, false, 0, 0, isMultiplayer, null, extraHardware, hardwareRequirement, environmentSize, environmentType, 0, null, false))

							textArea.setText("There is a game with that id! Change the id.");
						else
							textArea.setText("Game with "+id+" id added.");
						}
					}
					else if(comboBoxType.getSelectedIndex() == 2) {
						if(timeText.getText().isEmpty() || learningCurveText.getText().isEmpty() || buttonGroup_5.isSelected(null)) {
							textArea.setText("Please fill the selected Game Type panel!");
						}
						else {
						double time = Double.parseDouble(timeText.getText().toString()) ;
						String learningCurve = learningCurveText.getText().toString();
						boolean isDeterministic = isDetYes.isSelected();
						if(!GameSys.addGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount, false, false, 0,0, false, null, false, null, 0, null, time, learningCurve, isDeterministic))
							textArea.setText("There is a game with that id! Change the id.");
						else
							textArea.setText("Game with "+id+" id added.");
						}
					}
					
				}
					
			}
		});
		addGameButton.setBounds(701, 61, 128, 39);
		contentPane.add(addGameButton);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(701, 112, 128, 39);
		contentPane.add(doneButton);
		
		
	}
}