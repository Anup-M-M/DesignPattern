package org.anup.structural.adapter.school;

public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
      pp.mark(str);
    }
}
