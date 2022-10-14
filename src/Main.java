import com.sun.jdi.Value;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static boolean schleife = true;
    static int score = 0;

    public static void main(String[] args)
    {
        Gui.gui();
        Main.startAuswahl();
    }
    private static void startAuswahl()
    {
        while (schleife)
        {
            System.out.println(StringList.strBlockStart);
            String startInput = sc.next();
            switch (startInput)
            {
                case "1" -> Main.kapitelAuswahl();
                case "2" ->
                {
                    System.out.println(StringList.strVerabschiedung);
                    System.exit(0);
                }
                default -> System.out.println(StringList.strWhooops);
            }
        }
    }
    private static void kapitelAuswahl()
    {
        while (schleife)
        {
            System.out.println(StringList.strBlockKapitel);
            String startInput = sc.next();
            switch (startInput)
            {
                case "1" -> kapitelEins();
                case "2" -> kapitelZwei();
                case "3" -> kapitelDrei();
                case "4" -> kapitelVier();
                case "5" -> Main.startAuswahl();
                default -> System.out.println(StringList.strWhooops);
            }
        }
    }
    private static void kapitelEins()
    {
        while (schleife)
        {
            System.out.println(StringList.strBlockKapitelEins);
            String startInput = sc.next();
            switch (startInput)
            {
                case "2" -> Main.kapitelAuswahl();
                default -> System.out.println(StringList.strWhooops);
            }
        }
    }
    private static void kapitelZwei()
    {
        while (schleife)
        {
            System.out.println(StringList.strBlockKapitelZwei);
            String startInput = sc.next();
            switch (startInput)
            {
                case "2" -> Main.kapitelAuswahl();
                default -> System.out.println(StringList.strWhooops);
            }
        }
    }
    public static void kapitelDrei()
    {
        while (schleife)
        {
// ============================== QuizStart =============================

            System.out.println(StringList.strHeadline);

            //int randomIndex = (int) (Math.random() * 29);

/*TODO  ~ Finish StringAnswers and StringQuestions till we collapse
        ~ ArrayList of Doom -> to parse and check the chosen randomIndexes
        ~ 30 cases Horror done
        ~ and at least a fucking score*/

// ------------------------- ProgramiererTools^^ ---------------------------
            System.out.println("------------------------- ProgrammiererToolStart^^ ------------------------");
            System.out.println("index eingeben!!! 30 Fragen vorhanden [index 0-29]");
            int randomIndex = sc.nextInt();
            System.out.println("------------------------- ProgrammiererToolEnde^^ ------------------------\n");
// ------------------------- ProgramiererTools^^ ---------------------------

            switch (randomIndex)
            {
                case 0 -> Main.kapDreiIndex00(randomIndex, score);
                case 1 -> Main.kapDreiIndex01(randomIndex, score);
                case 2 -> Main.kapDreiIndex02(randomIndex, score);
                case 3 -> Main.kapDreiIndex03(randomIndex, score);
                case 4 -> Main.kapDreiIndex04(randomIndex, score);
                case 5 -> Main.kapDreiIndex05(randomIndex, score);
                case 6 -> Main.kapDreiIndex06(randomIndex, score);
                case 7 -> Main.kapDreiIndex07(randomIndex, score);
                case 8 -> Main.kapDreiIndex08(randomIndex, score);
                case 9 -> Main.kapDreiIndex09(randomIndex, score);
                case 10 -> Main.kapDreiIndex10(randomIndex, score);
                case 11 -> Main.kapDreiIndex11(randomIndex, score);
                case 12 -> Main.kapDreiIndex12(randomIndex, score);
                case 13 -> Main.kapDreiIndex13(randomIndex, score);
                case 14 -> Main.kapDreiIndex14(randomIndex, score);
                case 15 -> Main.kapDreiIndex15(randomIndex, score);
                case 16 -> Main.kapDreiIndex16(randomIndex, score);
                case 17 -> Main.kapDreiIndex17(randomIndex, score);
                case 18 -> Main.kapDreiIndex18(randomIndex, score);
                case 19 -> Main.kapDreiIndex19(randomIndex, score);
                case 20 -> Main.kapDreiIndex20(randomIndex, score);
                case 21 -> Main.kapDreiIndex21(randomIndex, score);
                case 22 -> Main.kapDreiIndex22(randomIndex, score);
                case 23 -> Main.kapDreiIndex23(randomIndex, score);
                case 24 -> Main.kapDreiIndex24(randomIndex, score);
                case 25 -> Main.kapDreiIndex25(randomIndex, score);
                case 26 -> Main.kapDreiIndex26(randomIndex, score);
                case 27 -> Main.kapDreiIndex27(randomIndex, score);
                case 28 -> Main.kapDreiIndex28(randomIndex, score);
                case 29 -> Main.kapDreiIndex29(randomIndex, score);
            }
        }
    }
    private static void kapDreiIndex00(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "1", "2", "3", "5" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort01_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort01_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);

        }
    }
    private static void kapDreiIndex01(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {

            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "1", "2", "3", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort02_5);
            }
            case "5" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort02_5);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex02(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "2", "3", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort03_1);
            }
            case "1" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort03_1);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex03(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for ( int i = 0; i <= randomIndex; i++ )
        {

            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "1", "5", "3", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort04_2);
            }
            case "2" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort04_2);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex04(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "2", "3", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort05_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort05_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex05(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "2", "3", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort06_1);
            }
            case "1" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort06_1);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex06(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "1", "3", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort07_2);
            }
            case "2" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort07_2);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex07(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "1", "2", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort08_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort08_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex08(int randomIndex, int tscore)
    {
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort09_1);
            }
            case "1" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort09_1);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex09(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort10_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort10_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    //=========================================================================
    private static void kapDreiIndex10(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort11_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort11_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex11(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "4", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort12_5);
            }
            case "5" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort12_5);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex12(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort13_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort13_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex13(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort14_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort14_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex14(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort15_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort15_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex15(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "4", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort16_2);
            }
            case "2" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort16_2);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex16(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "4", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort17_5);
            }
            case "5" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort17_5);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex17(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort18_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort18_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex18(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "4", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort19_5);
            }
            case "5" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort19_5);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex19(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort20_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort20_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex20(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "4", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort21_2);
            }
            case "2" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort21_2);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex21(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "4" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort22_1);
            }
            case "1" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort22_1);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex22(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort23_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort23_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex23(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "4", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort24_2);
            }
            case "2" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort24_2);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex24(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort25_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort25_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex25(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort26_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort26_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex26(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort27_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort27_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex27(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort28_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort28_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex28(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "3", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort29_4);
            }
            case "4" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort29_4);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }
    private static void kapDreiIndex29(int randomIndex, int tscore){
        // züfällige Auswahl aus FragenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(FragenArray.getFragen(randomIndex));
            break;
        }
        // zugehörige Auswahl aus AntwortenArray
        for (int i = 0; i <= randomIndex; i++)
        {
            System.out.println(AntwortArray.getAntworten(randomIndex));
            break;
        }
        System.out.println(StringList.strScore + score);
        System.out.println(StringList.strFootLine);
        String startInput = sc.next();  //TODO Variable + true/false für Zusammenfassung übergeben
        switch (startInput)
        {
            case "5", "4", "2", "1" ->
            {
                System.out.println(StringList.strFalsch);
                System.out.println(AntwortArray.antwort30_3);
            }
            case "3" ->
            {
                System.out.println(StringList.strRichtig);
                System.out.println(AntwortArray.antwort30_3);
                score = score + 3;
            }
            case "6" -> Main.kapitelAuswahl();
            default -> System.out.println(StringList.strWhooops);
        }
    }

    private static int kapitelVier()
    {
        while (schleife)
        {
            System.out.println(StringList.strBlockKapitelVier);
            String startInput = sc.next();
            switch (startInput)
            {
                case "2" -> Main.kapitelAuswahl();
                default -> System.out.println(StringList.strWhooops);
            }
        }
        return score;
    }

}