package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkbox extends Question {

    private String question;
    private final HashMap<Character, String> possibleAnswers;
    private final List<Character> correctAnswers;

    public Checkbox(String question, HashMap<Character, String> possibleAnswers, List<Character> correctAnswers) {
        super(question);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    public void displayChoices() {
        for (Map.Entry<Character, String> answer : this.possibleAnswers.entrySet()) {
            System.out.println(answer.getKey() + ": " + answer.getValue());
        }
    }

    public boolean isCorrect(List<Character> answers) {
        for (Character answer : answers) {
            if (!this.correctAnswers.contains(answer)) {
                return false;
            }
        }
        return answers.size() == correctAnswers.size();
    }

}
