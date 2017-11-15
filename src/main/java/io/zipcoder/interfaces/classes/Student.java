package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.interfaces.Learner;

public class Student extends Person implements Learner {


    private double totalStudyTime;


    public Student(long id) {
        super(id);
    }

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
