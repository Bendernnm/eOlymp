package nnm.bender.kurs.lastOOPquest;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    public NegativeTextAnalyzer() {
    }


    @Override
    protected String[] getKeywords() {
        String[] strings = {":(", "=(", ":|"};
        return strings;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
