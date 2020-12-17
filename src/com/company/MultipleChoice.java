package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleChoice extends Question {

    private String question;
    private final HashMap<Character, String> possibleAnswers;
    private final Character correctAnswer;

    public MultipleChoice(String question, HashMap<Character, String> possibleAnswers, Character correctAnswer) {
        super(question);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public void displayChoices() {
        for (Map.Entry<Character, String> answer : this.possibleAnswers.entrySet()) {
            System.out.println(answer.getKey() + ": " + answer.getValue());
        }
    }

    public boolean isCorrect(Character answer) {
        return this.correctAnswer == answer;
    }

}
