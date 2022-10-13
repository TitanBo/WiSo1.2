public class AntwortArray
{
    static String antwort01_1 = "[1] Leihvertrag\t   ";
    static String antwort01_2 = "[2] Werkvertrag\t   ";
    static String antwort01_3 = "[3] Dienstvertrag\t   ";
    static String antwort01_4 = "[4] Pachtvertrag\t   ";
    static String antwort01_5 = "[5] Mietvertrag";
    static String antworten01 = antwort01_1 + antwort01_2 + antwort01_3 + antwort01_4 + antwort01_5;
    static String antwort02_1 = "[1] frei Haus\t    ";
    static String antwort02_2 = "[2] frachtfrei\t    ";
    static String antwort02_3 = "[3] unfrei\t    ";
    static String antwort02_4 = "[4] frei dort\t     ";
    static String antwort02_5 = "[5] ab Werk";
    static String antworten02 = antwort02_1 + antwort02_2 + antwort02_3 + antwort02_4 + antwort02_5;
    static String antwort03_1 = "[1] Die ACI Computerhandel GmbH muss den Kaufvertrag wegen Irrtums in der Erklärung anfechten.\n";
    static String antwort03_2 = "[2] Die ACI Computerhandel GmbH muss den Kaufvertrag wegen Irrtums in der Übertragung anfechten.\n";
    static String antwort03_3 = "[3] Die ACI Computerhandel GmbH muss den Kaufvertrag wegen Irrtums über wesentliche Eigenschaften der Sache anfechten.\n";
    static String antwort03_4 = "[4] Durch den Irrtum in der Erklärung ist der Kaufvertrag nichtig.\n";
    static String antwort03_5 = "[5] Die ACI Computerhandel GmbH kann die Bestellung widerrufen.]";
    static String antworten03 = antwort03_1 + antwort03_2 + antwort03_3 + antwort03_4 + antwort03_5;
    static String antwort04_1 = "[1] Der Verkäufer muss den Drucker für 139,00 € verkaufen, weil das Angebot verbindlich war.\n";
    static String antwort04_2 = """
                                 [2] Der Verkäufer kann den Drucker zum Preis von 139,00 € verkaufen,
                                 weil das Angebot über 129,00 € nur galt, solange die Unterredung dauerte.""";
    //TODO have look above this fucking str because of /n thing
    static String antwort04_3 = """
                                 [3] Der Verkäufer muss den Drucker zum Preis von 139,00 € verkaufen,
                                     weil das Angebotüber 129,00 € nur galt, solange die Unterredung dauerte.""";
    static String antwort04_4 = "[4] Der Verkäufer muss den Drucker zum Preis von 139,00 € verkaufen, weil Verkäufer generell Preise nicht ändern dürfen.\n";
    static String antwort04_5 = "[5] Der Verkäufer muss den Drucker zum Preis von 129,00 € verkaufen, weil das Angebot verbindlich war.";
    static String antworten04 = antwort04_1 + antwort04_2 + antwort04_3 + antwort04_4 + antwort04_5;
    static String antwort05_1 = """
                                 [1] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme.
                                     Die ACI Computerhandel GmbH muss die Grußpostkarten bezahlen, wenn sie nichts unternimmt.""";
    static String antwort05_2 = """
                                 [2] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme. Die ACI Computerhandel
                                     GmbH muss die Grußpostkarten aufbewahren, wenn sie keine Verwendung für
                                     die Grußpostkarten hat.""";
    static String antwort05_3 = """
                                 [3] Stillschweigen der ACI Computerhandel GmbH gilt als Ablehnung. Die ACI Computerhandel GmbH
                                     muss die Grußpostkarten nicht aufbewahren und nicht zurücksenden.""";
    static String antwort05_4 = """
                                 [4] Stillschweigen der ACI Computerhandel GmbH gilt als Ablehnung. Die ACI Computerhandel
                                     GmbH muss die Grußpostkarten nicht bezahlen, aber aufbewahren.""";
    static String antwort05_5 = """
                                 [5] Die ACI Computerhandel GmbH muss die Grußpostkarten nicht aufbewahren und nicht
                                     zurückschicken, wenn sie keine Verwendung für die Grußpostkarten hat.""";
    static String antworten05 = antwort05_1 + antwort05_2 + antwort05_3 + antwort05_4 + antwort05_5;
    static String antwort06_1 = "[1] Da das Angebot unverbindlich war, muss die ACI Computerhandel GmbH nicht liefern.\n";
    static String antwort06_2 = "[2] a Angebote immer verbindlich sind, muss die ACI Computerhandel GmbH liefern.\n";
    static String antwort06_3 = """
                                 [3] Da Josef Schmitz nicht gemäß dem Angebot bestellte, muss die ACI
                                 Computerhandel GmbH nicht liefern.""";
    static String antwort06_4 = """
                                 [4] Da durch die Freizeichnungsklausel nur die Bindung an den Preis eingeschränkt war,
                                     kann die ACI Computerhandel GmbH 50 Pakete Kopierpapier zum Preis von 5,00 € je
                                     Paket liefern, weil die Preise inzwischen erhöht wurden.""";
    static String antwort06_5 = """
                                 [5] Da das Angebot verbindlich war, muss die ACI Computerhandel GmbH 50 Pakete zum
                                 Preis von 3,99 € liefern.""";
    static String antworten06 = antwort06_1 + antwort06_2 + antwort06_3 + antwort06_4 + antwort06_5;
    static String antwort07_1 = "[1] Preis freibleibend\t   ";
    static String antwort07_2 = "[2] Liefermöglichkeit vorbehalten\t    ";
    static String antwort07_3 = "[3] Angebot freibleibend\t     ";
    static String antwort07_4 = "[4] Angebot unverbindlich\t    ";
    static String antwort07_5 = "[5] Angebot gilt bis zum 15. Juni 2022";
    static String antworten07 = antwort07_1 + antwort07_2 + antwort07_3 + antwort07_4 + antwort07_5;
    static String antwort08_1 = "[1] Erfüllungsort für Lieferung und Zahlung ist Hamburg.\n";
    static String antwort08_2 = "[2] Erfüllungsort für Lieferung und Zahlung ist Köln\n";
    static String antwort08_3 = "[3] Erfüllungsort für die Zahlung ist Köln.\n";
    static String antwort08_4 = "[4] Erfüllungsort für die Zahlung ist Hamburg.\n";
    static String antwort08_5 = "[5] Erfüllungsort für die Zahlung ist die Niederlassung der Bank.";
    static String antworten08 = antwort08_1 + antwort08_2 + antwort08_3 + antwort08_4 + antwort08_5;
    static String antwort09_1 = "[1]";
    static String antwort09_2 = "[2]";
    static String antwort09_3 = "[3]";
    static String antwort09_4 = "[4]";
    static String antwort09_5 = "[5]";
    static String antworten09 = antwort09_1 + antwort09_2 + antwort09_3 + antwort09_4 + antwort09_5;
    static String antworten10 = "9";
    static String antworten11 = "10";
    static String antworten12 = "11";
    static String antworten13 = "12";
    static String antworten14 = "13";
    static String antworten15 = "14";
    static String antworten16 = "15";
    static String antworten17 = "16";
    static String antworten18 = "17";
    static String antworten19 = "18";
    static String antworten20 = "19";
    static String antworten21 = "20";
    static String antworten22 = "21";
    static String antworten23 = "22";
    static String antworten24 = "23";
    static String antworten25 = "24";
    static String antworten26 = "25";
    static String antworten27 = "26";
    static String antworten28 = "27";
    static String antworten29 = "28";
    static String antworten30 = "29";

    static String[] antworten = { antworten01, antworten02, antworten03, antworten04, antworten05, antworten06, antworten07, antworten08, antworten09, antworten10,
            antworten11, antworten12, antworten13, antworten14, antworten15, antworten16, antworten17, antworten18, antworten19, antworten20,
            antworten21, antworten22, antworten23, antworten24, antworten25, antworten26, antworten27, antworten28, antworten29, antworten30 };

    public static String getAntworten(int index)
    {
        return antworten[index];
    }
}