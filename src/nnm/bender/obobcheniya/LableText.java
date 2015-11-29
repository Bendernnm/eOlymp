package nnm.bender.obobcheniya;

public class LableText {
    private String mLable;

    public LableText(String lable) {
        mLable = lable;
    }

    public String getLable() {
        return mLable;
    }

    public void setLable(String lable) {
        mLable = lable;
    }

    @Override
    public String toString() {
        return "lableText{" +
                "mLable='" + mLable + '\'' +
                '}';
    }
}
