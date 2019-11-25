package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        ArrayList<String> instructorZan = new ArrayList<String>();
        instructorZan.add(0,"ZANN");
        instructorZan.add(1,"is Annoying");

        for (int i = 0; i < instructorZan.size(); i++) {
            super.add(new Instructor(i,instructorZan.get(i)));
        }
    }

    public Instructor[] toArray() {
        return new Instructor[0];
    }

    public static Instructors getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        else{
            return INSTANCE;
        }
    }

}
