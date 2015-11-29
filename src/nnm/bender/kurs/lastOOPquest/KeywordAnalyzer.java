package nnm.bender.kurs.lastOOPquest;

abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();

    @Override
    public Label processText(String text) {
        String[] strings = getKeywords();
        for (int i = 0; i < strings.length; i++) {
            if (text.contains(strings[i])){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
