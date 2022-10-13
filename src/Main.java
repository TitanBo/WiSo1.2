import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static boolean schleife = true;

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
            int score = 0;
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
    private static void kapDreiIndex00(int randomIndex, int score)
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
    private static void kapDreiIndex01(int randomIndex, int score){}
    private static void kapDreiIndex02(int randomIndex, int score){}
    private static void kapDreiIndex03(int randomIndex, int score){}
    private static void kapDreiIndex04(int randomIndex, int score){}
    private static void kapDreiIndex05(int randomIndex, int score){}
    private static void kapDreiIndex06(int randomIndex, int score){}
    private static void kapDreiIndex07(int randomIndex, int score){}
    private static void kapDreiIndex08(int randomIndex, int score){}
    private static void kapDreiIndex09(int randomIndex, int score){}
    private static void kapDreiIndex10(int randomIndex, int score){}
    private static void kapDreiIndex11(int randomIndex, int score){}
    private static void kapDreiIndex12(int randomIndex, int score){}
    private static void kapDreiIndex13(int randomIndex, int score){}
    private static void kapDreiIndex14(int randomIndex, int score){}
    private static void kapDreiIndex15(int randomIndex, int score){}
    private static void kapDreiIndex16(int randomIndex, int score){}
    private static void kapDreiIndex17(int randomIndex, int score){}
    private static void kapDreiIndex18(int randomIndex, int score){}
    private static void kapDreiIndex19(int randomIndex, int score){}
    private static void kapDreiIndex20(int randomIndex, int score){}
    private static void kapDreiIndex21(int randomIndex, int score){}
    private static void kapDreiIndex22(int randomIndex, int score){}
    private static void kapDreiIndex23(int randomIndex, int score){}
    private static void kapDreiIndex24(int randomIndex, int score){}
    private static void kapDreiIndex25(int randomIndex, int score){}
    private static void kapDreiIndex26(int randomIndex, int score){}
    private static void kapDreiIndex27(int randomIndex, int score){}
    private static void kapDreiIndex28(int randomIndex, int score){}
    private static void kapDreiIndex29(int randomIndex, int score){}

    private static void kapitelVier()
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
    }
}