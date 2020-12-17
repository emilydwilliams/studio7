package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class TrueFalse extends Question {

    private String question;
    private final boolean correctAnswer;

    public TrueFalse(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public void displayChoices() {
        System.out.println("True");
        System.out.println("False");
    }

    public boolean isCorrect(boolean answer) {
        return correctAnswer == answer;
    }


}
