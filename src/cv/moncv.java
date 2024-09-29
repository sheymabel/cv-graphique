package cv;
import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class moncv  extends JFrame{
   private static JFrame frame = null;



/* private JLabel nomLabel, prenomLabel, adresseLabel, emailLabel, telephoneLabel, experienceLabel, formationLabel;
    private JTextField nomField, prenomField, adresseField, emailField, telephoneField;
    private JTextArea experienceArea, formationArea;
    private JButton enregistrerButton, annulerButton;*/
public moncv(String t) {
	super(t);
	 
 frame = new JFrame();
	setTitle("mon cv");
	setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();
    JMenu menuFichier = new JMenu("Fichier");
    JMenu menuOutils = new JMenu("Outils");

    JMenuItem menuItemNouveau = new JMenuItem("Nouveau CV");
    JMenuItem menuItemOuvrir = new JMenuItem("Ouvrir CV");
    JMenuItem menuItemEnregistrer = new JMenuItem("Enregistrer CV");
    JMenuItem menuItemExporter = new JMenuItem("Exporter CV");
    JMenuItem menuItemParametres = new JMenuItem("Paramètres");
    JMenuItem menuItemRechercher = new JMenuItem("Rechercher Emplois");

    menuFichier.add(menuItemNouveau);
    menuFichier.add(menuItemOuvrir);
    menuFichier.addSeparator();
    menuFichier.add(menuItemEnregistrer);
    menuFichier.add(menuItemExporter);

    menuOutils.add(menuItemParametres);
    menuOutils.add(menuItemRechercher);

    menuBar.add(menuFichier);
    menuBar.add(menuOutils);
    setJMenuBar(menuBar);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(new JButton("Nouveau"));
    buttonPanel.add(new JButton("Ouvrir"));
    buttonPanel.add(new JButton("Enregistrer"));
    buttonPanel.add(new JButton("Rechercher"));

    getContentPane().add(buttonPanel, BorderLayout.NORTH);

    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 1));

    JPanel personalInfoPanel = new JPanel(new GridLayout(2, 2));
    personalInfoPanel.add(new JLabel("Nom :"));
    personalInfoPanel.add(new JTextField(20));
    personalInfoPanel.add(new JLabel("Prénom :"));
    personalInfoPanel.add(new JTextField(20));
    p1.add(personalInfoPanel);

    JPanel addressPanel = new JPanel();
    addressPanel.add(new JLabel("Adresse :"));
    addressPanel.add(new JTextField(40));
    p1.add(addressPanel);

    JPanel emailPanel = new JPanel();
    emailPanel.add(new JLabel("Email :"));
    emailPanel.add(new JTextField(20));
    p1.add(emailPanel);

    JPanel genderPanel = new JPanel();
    genderPanel.add(new JLabel("Genre :"));
    genderPanel.add(new JRadioButton("Male"));
    genderPanel.add(new JRadioButton("Female"));
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add((AbstractButton) genderPanel.getComponent(1));
    genderGroup.add((AbstractButton) genderPanel.getComponent(2));
    p1.add(genderPanel);

    getContentPane().add(p1, BorderLayout.WEST);

    JPanel contentPanel = new JPanel();
    contentPanel.add(new JLabel("Contenu Informations Générales"));

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab("Formation et Expériences", new JPanel());
    getContentPane().add(tabbedPane, BorderLayout.CENTER);

    
}

	
	
	
  


public static void main(String[] args) {
    moncv f1 =new moncv("mon cv");
    f1.setVisible(true);
	
}
}