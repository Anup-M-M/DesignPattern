package org.anup.structural.adapter.school;

public class School {

    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("i am tired to write assignment");


    }
}
