package nnm.bender.testIO;

import java.io.IOException;
import java.io.OutputStream;

public class doubleOutMyAdapter extends OutputStream {
    private final double[] mDoubles;

    public doubleOutMyAdapter(double[] doubles) {
        mDoubles = doubles;
    }


    @Override
    public void write(int b) throws IOException {

    }
}
