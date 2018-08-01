package com.company;

public class Student extends Human implements IPlayable, ILearning, Comparable {
    String fieldOfStudy;

    @Override
    public void goCamping() {
        System.out.println("I am going camping");

    }
    @Override
    public void learningEnglish() {
        System.out.println("I am learning English");
    }
    @Override
    public  int compareTo(Object 0){
        Student student = (student) 0;
        return this.getName()compareTo(student.getName())
    }
    @Override

}
