import javax.swing.*;

public class Gui
{
    static JFrame mainFraim = new JFrame("WiSo - Quiz");
    JLabel mFHeadline;
    JButton quizStart;
    JButton quizBeenden;

    static void gui()
    {

        mainFraim.setSize(800, 500);
        mainFraim.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFraim.setLocationRelativeTo(null);
        mainFraim.setResizable(false);

        mainFraim.setVisible(true);
    }
}
