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
    static String antwort03_5 = "[5] Die ACI Computerhandel GmbH kann die Bestellung widerrufen.";
    static String antworten03 = antwort03_1 + antwort03_2 + antwort03_3 + antwort03_4 + antwort03_5;
    static String antwort04_1 = "[1] Der Verkäufer muss den Drucker für 139,00 € verkaufen, weil das Angebot verbindlich war.\n";
    static String antwort04_2 = """
                                 [2] Der Verkäufer kann den Drucker zum Preis von 139,00 € verkaufen,
                                     weil das Angebot über 129,00 € nur galt, solange die Unterredung dauerte.
                                 """;
    //TODO have look above this fucking str because of /n thing
    static String antwort04_3 = """
                                 [3] Der Verkäufer muss den Drucker zum Preis von 139,00 € verkaufen,
                                     weil das Angebotüber 129,00 € nur galt, solange die Unterredung dauerte.
                                 """;
    static String antwort04_4 = "[4] Der Verkäufer muss den Drucker zum Preis von 139,00 € verkaufen, weil Verkäufer generell Preise nicht ändern dürfen.\n";
    static String antwort04_5 = "[5] Der Verkäufer muss den Drucker zum Preis von 129,00 € verkaufen, weil das Angebot verbindlich war.";
    static String antworten04 = antwort04_1 + antwort04_2 + antwort04_3 + antwort04_4 + antwort04_5;
    static String antwort05_1 = """
                                 [1] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme.
                                     Die ACI Computerhandel GmbH muss die Grußpostkarten bezahlen, wenn sie nichts unternimmt.
                                 """;
    static String antwort05_2 = """
                                 [2] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme. Die ACI Computerhandel
                                     GmbH muss die Grußpostkarten aufbewahren, wenn sie keine Verwendung für
                                     die Grußpostkarten hat.
                                 """;
    static String antwort05_3 = """
                                 [3] Stillschweigen der ACI Computerhandel GmbH gilt als Ablehnung. Die ACI Computerhandel GmbH
                                     muss die Grußpostkarten nicht aufbewahren und nicht zurücksenden.
                                 """;
    static String antwort05_4 = """
                                 [4] Stillschweigen der ACI Computerhandel GmbH gilt als Ablehnung. Die ACI Computerhandel
                                     GmbH muss die Grußpostkarten nicht bezahlen, aber aufbewahren.
                                 """;
    static String antwort05_5 = """
                                 [5] Die ACI Computerhandel GmbH muss die Grußpostkarten nicht aufbewahren und nicht
                                     zurückschicken, wenn sie keine Verwendung für die Grußpostkarten hat.
                                 """;
    static String antworten05 = antwort05_1 + antwort05_2 + antwort05_3 + antwort05_4 + antwort05_5;
    static String antwort06_1 = "[1] Da das Angebot unverbindlich war, muss die ACI Computerhandel GmbH nicht liefern.\n";
    static String antwort06_2 = "[2] Da Angebote immer verbindlich sind, muss die ACI Computerhandel GmbH liefern.\n";
    static String antwort06_3 = """
                                 [3] Da Josef Schmitz nicht gemäß dem Angebot bestellte, muss die ACI
                                     Computerhandel GmbH nicht liefern.
                                 """;
    static String antwort06_4 = """
                                 [4] Da durch die Freizeichnungsklausel nur die Bindung an den Preis eingeschränkt war,
                                     kann die ACI Computerhandel GmbH 50 Pakete Kopierpapier zum Preis von 5,00 € je
                                     Paket liefern, weil die Preise inzwischen erhöht wurden.
                                 """;
    static String antwort06_5 = """
                                 [5] Da das Angebot verbindlich war, muss die ACI Computerhandel GmbH 50 Pakete zum
                                     Preis von 3,99 € liefern.
                                 """;
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
    static String antwort09_1 = "[1] Das Angebot gilt solange, bis unter regelmäßigen Umständen eine Antwort erwartet werden kann.\n";
    static String antwort09_2 = "[2] Das Angebot gilt einen Monat.\n";
    static String antwort09_3 = "[3] Das Angebot gilt sieben Tage.\n";
    static String antwort09_4 = "[4] Das Angebot gilt unbefristet.\n";
    static String antwort09_5 = "[5] Angebote sind immer unverbindlich.";
    static String antworten09 = antwort09_1 + antwort09_2 + antwort09_3 + antwort09_4 + antwort09_5;
    static String antwort10_1 = """
                                 [1] Der Schreibwarenhändler Peter Kurz kauft vom Lebensmittelhändler Kurt Peters privat
                                     eine Digitalkamera für den nächsten Urlaub.
                                 """;
    static String antwort10_2 = """
                                 [2] Der Schreibwarenhändler Peter Kurz kauft von seinem Freund Josef Schmid
                                     ein Mountain Bike für den nächsten Urlaub.
                                 """;
    static String antwort10_3 = """
                                 [3] Der Schreibwarenhändler Peter Kurz kauft im Autohaus Pelzer GmbH einen PKW für
                                     private Zwecke.
                                 """;
    static String antwort10_4 = """
                                 [4] Der Schreibwarenhändler Peter Kurz kauft im Autohaus Pelzer GmbH
                                     einen Lieferwagen für sein Geschäft.
                                 """;
    static String antwort10_5 = """
                                 [5] Der Schreibwarenhändler Peter Kurz kauft von der Bürohandlung Peters OHG einen
                                     Drucker für private Zwecke.
                                     """;
    static String antworten10 = antwort10_1 + antwort10_2 + antwort10_3 + antwort10_4 + antwort10_5;
    static String antwort11_1 = """
                                 [1] In ihrem Hausbriefkasten liegt ein Werbeprospekt des Discounters Brutto
                                     mit den Sonderangeboten der Woche.
                                 """;
    static String antwort11_2 = """
                                 [2] Im Online-Shop eines Internet-Händlers finden Sie das Angebot eines Blu-Ray-Players
                                     zum Preis von 129,00 €.
                                 """;
    static String antwort11_3 = """
                                 [3] Im Werbeprospekt der Mars Elektronikmärkte, der ihrer Tageszeitung beiliegt, wird der
                                     gleiche Blu-Ray-Player zum Preis von 119,00 € angeboten.
                                 """;
    static String antwort11_4 = """
                                 [4] Auf eine Anfrage schickt die ACI Computerhandel GmbH der Sieber GmbH ein
                                     befristetes Angebot über 10 Festplatten.
                                 """;
    static String antwort11_5 = """
                                 [5] Im Schaufenster des Elektronikmarktes Elektronik 2000 GmbH sehen Sie den gleichen
                                     Blu-Ray-Player zum Preis von 125,00 €.
                                 """;
    static String antworten11 = antwort11_1 + antwort11_2 + antwort11_3 + antwort11_4 + antwort11_5;
    static String antwort12_1 = """
                                 [1] Dienstleistungsvertrag
                                 """;
    static String antwort12_2 = """
                                 [2] Werkvertrag
                                 """;
    static String antwort12_3 = """
                                 [3] Leihvertrag
                                 """;
    static String antwort12_4 = """
                                 [4] Pachtvertrag
                                 """;
    static String antwort12_5 = """
                                 [5] Dienstvertrag
                                 """;
    static String antworten12 = antwort12_1 + antwort12_2 + antwort12_3 + antwort12_4 + antwort12_5;
    static String antwort13_1 = "[1] Geldschulden sind weder Schick- noch Bringschulden.\t";
    static String antwort13_2 = "[2] Geldschulden sind Holschulden.\t";
    static String antwort13_3 = "[3] Warenschulden sind Holschulden und Schickschulden.\t";
    static String antwort13_4 = "[4] Warenschulden sind Holschulden.\t";
    static String antwort13_5 = "[5] Warenschulden sind Schickschulden.";
    static String antworten13 = antwort13_1 + antwort13_2 + antwort13_3 + antwort13_4 + antwort13_5;
    static String antwort14_1 = """
                                 [1] Erfüllungsgeschäft bezieht sich auf die Rechte des Verkäufers, Verpflichtungsgeschäft
                                     auf die Rechte des Käufers.
                                 """;
    static String antwort14_2 = """
                                 [2] Verpflichtungsgeschäft bezieht sich auf das Bewirken der Leistungen durch den
                                     Gläubiger.
                                 """;
    static String antwort14_3 = """
                                 [3] Erfüllungsgeschäft bezieht sich auf das Bewirken der Leistungen durch den
                                     Schuldner.
                                 """;
    static String antwort14_4 = """
                                 [4] Verpflichtungsgeschäft bezieht sich auf das Bewirken der Leistungen durch den
                                     Schuldner.
                                 """;
    static String antwort14_5 = """
                                 [5] Erfüllungsgeschäft bezieht sich auf die Pflichten des Verkäufers, Verpflichtungsgeschäft
                                     auf die Pflichten des Käufers.
                                 """;
    static String antworten14 = antwort14_1 + antwort14_2 + antwort14_3 + antwort14_4 + antwort14_5;
    static String antwort15_1 = """
                                 [1] Stillschweigen der ACI Computerhandel GmbH gilt als Ablehnung.
                                     Die ACI Computerhandel GmbH muss die Visitenkarten nicht aufbewahren und nicht zurücksenden.
                                 """;
    static String antwort15_2 = """
                                 [2] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme.
                                     Die ACI Computerhandel GmbH muss die Visitenkarten sofort zurückschicken, wenn sie die Visitenkarten
                                     nicht verwenden will.
                                 """;
    static String antwort15_3 = """
                                 [3] Die ACI Computerhandel GmbH muss die Visitenkarten nicht bezahlen, darf sie aber
                                     verwenden.
                                 """;
    static String antwort15_4 = """
                                 [4] Stillschweigen der ACI Computerhandel GmbH gilt als Annahme.
                                     Die ACI Computerhandel GmbH muss die Visitenkarten bezahlen,
                                     wenn sie weiter nichts unternimmt.
                                 """;
    static String antwort15_5 = """
                                 [5] Die ACI Computerhandel GmbH muss die Visitenkarten nur aufbewahren, wenn sie
                                     keine Verwendung für die Visitenkarten hat.
                                 """;
    static String antworten15 = antwort15_1 + antwort15_2 + antwort15_3 + antwort15_4 + antwort15_5;
    static String antwort16_1 = """
                                 [1] Der Käufer darf nur Skonto vom Rechnungsbetrag abziehen,
                                     wenn dies vertraglich vereinbart wurde und er innerhalb des Zahlungsziels zahlt.
                                 """;
    static String antwort16_2 = """
                                 [2] Der Käufer darf nur Skonto vom Rechnungsbetrag abziehen,
                                     wenn dies vertraglich vereinbart wurde und er innerhalb der Skontofrist zahlt.
                                 """;
    static String antwort16_3 = """
                                 [3] Der Käufer darf immer 3 % Skonto abziehen,
                                     wenn er innerhalb von 10 Tagen ab Rechnungsdatum zahlt.
                                 """;
    static String antwort16_4 = """
                                 [4] Ist vertraglich nichts vereinbart, darf der Käufer immer 3 % Skonto abziehen.
                                 """;
    static String antwort16_5 = """
                                 [5] Ist vertraglich nichts vereinbart, darf der Käufer immer 2 % Skonto abziehen.
                                 """;
    static String antworten16 = antwort16_1 + antwort16_2 + antwort16_3 + antwort16_4 + antwort16_5;
    static String antwort17_1 = "[1] Treuerabatt\t";
    static String antwort17_2 = "[2] Mengenrabatt\t";
    static String antwort17_3 = "[3] Wiederverkäuferrrabatt\t";
    static String antwort17_4 = "[4] Skonto\t";
    static String antwort17_5 = "[5] Bonus";
    static String antworten17 = antwort17_1 + antwort17_2 + antwort17_3 + antwort17_4 + antwort17_5;
    static String antwort18_1 = "[1] solange der Vorrat reicht\t";
    static String antwort18_2 = "[2] Angebot freibleibend\t";
    static String antwort18_3 = "[3] Preis freibleibend\t";
    static String antwort18_4 = "[4] Angebot unverbindlich\t";
    static String antwort18_5 = "[5] Angebot gilt bis zum 22. Juni 2022";
    static String antworten18 = antwort18_1 + antwort18_2 + antwort18_3 + antwort18_4 + antwort18_5;
    static String antwort19_1 = """
                                 [1] Bestimmte Anfragen beziehen sich auf das gesamte Sortiment eines Lieferers.
                                 """;
    static String antwort19_2 = """
                                 [2] Die bestimmte Anfrage gilt rechtlich als Antrag.
                                 """;
    static String antwort19_3 = """
                                 [3] Die bestimmte Anfrage gilt rechtlich als Annahme.
                                 """;
    static String antwort19_4 = """
                                 [4] Anfragen können nur unbestimmt (ungezielt) geschrieben werden.
                                 """;
    static String antwort19_5 = """
                                 [5] Bestimmte Anfragen dienen zur Einholung von Angeboten zu einem bestimten Artikel.
                                 """;
    static String antworten19 = antwort19_1 + antwort19_2 + antwort19_3 + antwort19_4 + antwort19_5;
    static String antwort20_1 = "[1] Bestimmungskauf\t";
    static String antwort20_2 = "[2] Kauf zur Probe\t";
    static String antwort20_3 = "[3] Kauf auf Probe\t";
    static String antwort20_4 = "[4] Kauf nach Probe\t";
    static String antwort20_5 = "[5] Kauf auf Abruf";
    static String antworten20 = antwort20_1 + antwort20_2 + antwort20_3 + antwort20_4 + antwort20_5;
    static String antwort21_1 = """
                                 [1] Die ACI Computerhandel GmbH muss nicht liefern, weil es sich um ein freibleibendes
                                     Angebot handelt.
                                 """;
    static String antwort21_2 = """
                                 [2] Die ACI Computerhandel GmbH muss liefern, weil die Systemtechnik GmbH
                                     rechtzeitig gemäß dem Angebot bestellte.
                                 """;
    static String antwort21_3 = """
                                 [3] Die ACI Computerhandel GmbH muss liefern, weil die Systemtechnik GmbH
                                     rechtzeitig gemäß dem Angebot bestellte.
                                 """;
    static String antwort21_4 = """
                                 [4] Ein Kaufvertrag kommt nur zustande, wenn die ACI Computerhandel die Bestellung telefonisch bestätigt.
                                 """;
    static String antwort21_5 = """
                                 [5] Die ACI Computerhandel GmbH muss nicht liefern, weil das Angebot unverbindlich ist.
                                 """;
    static String antworten21 = antwort21_1 + antwort21_2 + antwort21_3 + antwort21_4 + antwort21_5;
    static String antwort22_1 = "[1] Mietvertrag\t";
    static String antwort22_2 = "[2] Pachtvertrag\t";
    static String antwort22_3 = "[3] Werkvertrag\t";
    static String antwort22_4 = "[4] Kaufvertrag\t";
    static String antwort22_5 = "[5] Darlehensvertrag";
    static String antworten22 = antwort22_1 + antwort22_2 + antwort22_3 + antwort22_4 + antwort22_5;
    static String antwort23_1 = """
                                 [1] Der Kaufvertrag ist bereits zustande gekommen, weil der Katalog der ACI
                                     Computerhandel GmbH ein unbefristetes Angebot ist.
                                 """;
    static String antwort23_2 = """
                                 [2] Die ACI Computerhandel GmbH muss zwar keine schriftliche Auftragsbestätigung schicken,
                                     muss den Kaufvertrag aber telefonisch bestätigen.
                                 """;
    static String antwort23_3 = """
                                 [3] Die ACI Computerhandel GmbH muss eine schriftliche Auftragsbestätigung schicken,
                                     weil die Bestellung der Krüger GmbH der Antrag ist.
                                 """;
    static String antwort23_4 = """
                                 [4] Die ACI Computerhandel GmbH kann die 10 Tonerkartuschen an die Krüger
                                     GmbH liefern. Durch die Lieferung kommt der Kaufvertrag zustande.
                                 """;
    static String antwort23_5 = """
                                 [5] Kaufverträge müssen schriftlich abgeschlossen werden, deshalb muss die ACI 
                                     Computerhandel GmbH eine schriftliche Auftragsbestätigung schicken.
                                 """;
    static String antworten23 = antwort23_1 + antwort23_2 + antwort23_3 + antwort23_4 + antwort23_5;
    static String antwort24_1 = """
                                 [1] Eine Bestellungsannahme (Auftragsbestätigung) ist rechtlich nie erforderlich.
                                 """;
    static String antwort24_2 = """
                                 [2] Eine Bestellungsannahme (Auftragsbestätigung) ist rechtlich nicht erforderlich,
                                     wenn der Drucker an den Kunden geschickt wird (schlüssiges Handeln).
                                 """;
    static String antwort24_3 = """
                                 [3] Eine Bestellungsannahme (Auftragsbestätigung) ist rechtlich nicht erforderlich,
                                     wenn der Drucker an den Kunden geschickt wird (schlüssiges Handeln).
                                 """;
    static String antwort24_4 = """
                                 [4] Eine Bestellungsannahme (Auftragsbestätigung) ist rechtlich immer erforderlich.
                                 """;
    static String antwort24_5 = """
                                 [5] Eine Bestellungsannahme (Auftragsbestätigung) ist rechtlich nur erforderlich, wenn auf
                                     ein Angebot mündlich bestellt wurde.
                                 """;
    static String antworten24 = antwort24_1 + antwort24_2 + antwort24_3 + antwort24_4 + antwort24_5;
    static String antwort25_1 = "[1] Kauf auf Abruf\t";
    static String antwort25_2 = "[2] Kauf auf Probe\t";
    static String antwort25_3 = "[3] Fixkauf\t";
    static String antwort25_4 = "[4] Terminkauf\t";
    static String antwort25_5 = "[5] Bestimmungskauf";
    static String antworten25 = antwort25_1 + antwort25_2 + antwort25_3 + antwort25_4 + antwort25_5;
    static String antwort26_1 = """
                                 [1] solange der Vorrat reicht
                                 """;
    static String antwort26_2 = """
                                 [2] solange der Vorrat reicht
                                 """;
    static String antwort26_3 = """
                                 [3] Angebot freibleibend
                                 """;
    static String antwort26_4 = """
                                 [4] Liefermöglichkeit vorbehalten
                                 """;
    static String antwort26_5 = """
                                 [5] Angebot gilt bis zum 22. Juni 2021
                                 """;
    static String antworten26 = antwort26_1 + antwort26_2 + antwort26_3 + antwort26_4 + antwort26_5;
    static String antwort27_1 = """
                                 [1] Ein Angebot ist immer die Annahme.
                                 """;
    static String antwort27_2 = """
                                 [2] Eine Bestellung auf ein Angebot ist der Antrag.
                                 """;
    static String antwort27_3 = """
                                 [3] Eine Bestellung ist immer die Annahme.
                                 """;
    static String antwort27_4 = """
                                 [4] Eine Bestellung auf ein Angebot ist die Annahme.
                                 """;
    static String antwort27_5 = """
                                 [5] Eine Anfrage ist immer der Antrag.
                                 """;
    static String antworten27 = antwort27_1 + antwort27_2 + antwort27_3 + antwort27_4 + antwort27_5;
    static String antwort28_1 = """
                                 [1] Der Verkäufer schickt ein Angebot. Der Käufer ändert in seiner Bestellung das Angebot
                                     ab. Der Verkäufer reagiert nicht.
                                 """;
    static String antwort28_2 = """
                                 [2] Der Verkäufer befristet sein Angebot bis zum 8. Mai. Der Käufer bestellt am 12. Mai.
                                 """;
    static String antwort28_3 = """
                                 [3] Der Verkäufer schickt ein Angebot. Der Käufer ändert in seiner Bestellung das Angebot
                                     ab. Der Verkäufer will nur gemäß seinem Angebot liefern.
                                 """;
    static String antwort28_4 = """
                                 [4] Der Käufer bestellt ohne vorheriges Angebot. Der Verkäufer schickt die Waren.
                                 """;
    static String antwort28_5 = """
                                 [5] Der Verkäufer schickt ein unbefristetes Angebot. Der Käufer reagiert nicht.
                                 """;
    static String antworten28 = antwort28_1 + antwort28_2 + antwort28_3 + antwort28_4 + antwort28_5;
    static String antwort29_1 = """
                                 [1] Da der Erfüllungsort für die Warenlieferung Köln ist, muss die ACI Computer GmbH den
                                     Schaden tragen.
                                 """;
    static String antwort29_2 = """
                                 [2] Da der Erfüllungsort für die Warenlieferung Hamburg ist, muss die ACI Computer
                                     GmbH den Schaden tragen.
                                 """;
    static String antwort29_3 = """
                                 [3] Da der Erfüllungsort für die Warenlieferung Köln ist, muss die Systemtechnik GmbH
                                     den Schaden tragen.
                                 """;
    static String antwort29_4 = """
                                 [4] Da der Erfüllungsort für die Warenlieferung Hamburg ist,
                                     muss die Systemtechnik GmbH den Schaden tragen.
                                 """;
    static String antwort29_5 = """
                                 [5] Es haftet immer die Spedition für Schäden bis zur Übergabe der Waren, deshalb ist der
                                     Erfüllungsort für die Warenlieferung bedeutungslos.
                                 """;
    static String antworten29 = antwort29_1 + antwort29_2 + antwort29_3 + antwort29_4 + antwort29_5;
    static String antwort30_1 = """
                                 [1] Das Angebot wird durch die Freizeichnungsklausel verbindlich, deshalb muss die ACI
                                    Computerhandel GmbH liefern.
                                 """;
    static String antwort30_2 = """
                                 [2] Da ein Angebot stets verbindlich ist, muss die ACI Computerhandel GmbH liefern.
                                    
                                 """;
    static String antwort30_3 = """
                                 [3] Da die Freizeichnungsklausel im Angebot die Bindung an die Menge aufhebt,
                                     muss die ACI Computerhandel GmbH nicht liefern.
                                 """;
    static String antwort30_4 = """
                                 [4] Da die Freizeichnungsklausel im Angebot die Bindung an den Preis aufhebt, muss die
                                     ACI Computerhandel GmbH liefern.
                                 """;
    static String antwort30_5 = """
                                 [5] Da die Freizeichnungsklausel im Angebot die Bindung an die Menge aufhebt, muss die
                                     ACI Computerhandel GmbH liefern.
                                 """;
    static String antworten30 = antwort30_1 + antwort30_2 + antwort30_3 + antwort30_4 + antwort30_5;

    static String[] antworten = { antworten01, antworten02, antworten03, antworten04, antworten05, antworten06, antworten07, antworten08, antworten09, antworten10,
            antworten11, antworten12, antworten13, antworten14, antworten15, antworten16, antworten17, antworten18, antworten19, antworten20,
            antworten21, antworten22, antworten23, antworten24, antworten25, antworten26, antworten27, antworten28, antworten29, antworten30 };

    public static String getAntworten(int index)
    {
        return antworten[index];
    }
}