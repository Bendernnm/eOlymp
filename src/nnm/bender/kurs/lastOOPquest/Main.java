package nnm.bender.kurs.lastOOPquest;

public class Main {
    public static void main(String[] args) {
        String text = "asdfdsf=(d";
        System.out.println(text.contains("=("));
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[3];
        String[] strings = {"f"};
        textAnalyzers[2] = new SpamAnalyzer(strings);
        textAnalyzers[0] = new NegativeTextAnalyzer();
        textAnalyzers[1] = new TooLongTextAnalyzer(5);
        System.out.println(checkLabels(textAnalyzers,text));

    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }
}
