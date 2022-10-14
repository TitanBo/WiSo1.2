import javax.swing.*;
import java.awt.*;

public class Gui
{
    static JMenuBar menuBar;
    // JMenu
    static JMenu menu01;
    static JMenu menu02;
    // Menu items
    static JMenuItem m1_1, m1_2, m1_3;
    static JMenuItem m2_1, m2_2;

    // create a frame
    static JFrame mainFrame;
    static JPanel panelTop;
    static JPanel panelBottom;

    public static void gui()
    {

        // create a frame
        mainFrame = new JFrame(StringList.strWiSoQuiz);
        // create a menubar
        menuBar = new JMenuBar();
        // create a menu
        menu01 = new JMenu(StringList.strDatei);
        menu02 = new JMenu(StringList.strZubehoer);
        // create menuitems
        m1_1 = new JMenuItem(StringList.strLaden);
        m1_2 = new JMenuItem(StringList.strSpeichern);
        m1_3 = new JMenuItem(StringList.strDrucken);
        m2_1 = new JMenuItem(StringList.strCalkulator);
        m2_2 = new JMenuItem(StringList.strNotiz);
        // add menu items to menu
        menu01.add(m1_1);
        menu01.add(m1_2);
        menu01.add(m1_3);
        menu02.add(m2_1);
        menu02.add(m2_2);
        // add menu to menu bar
        menuBar.add(menu01);
        menuBar.add(menu02);
        // add menubar to frame
        mainFrame.setJMenuBar(menuBar);
        // set the size of the frame
        mainFrame.setSize(800, 500);
        mainFrame.setLocationRelativeTo(null);

        panelTop = new JPanel();
        panelTop.setBounds(50,50, 50, 50);
        panelTop.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelTop.setVisible(true);

        panelBottom = new JPanel();
        panelBottom.setBounds(50,50, 50, 50);
        panelBottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelBottom.setVisible(true);

        mainFrame.add(panelTop);
        mainFrame.add(panelTop);
        mainFrame.setVisible(true);
    }
}
