package com.company;

public abstract class Question {

    private final String question;

    public Question(String question) {
        this.question = question;
    }

    public void displayQuestion() {
        System.out.println(this.question);
    }

}
