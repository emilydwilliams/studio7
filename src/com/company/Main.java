package com.company;

public class Main {

    public static void main(String[] args) {

    Quiz funQuiz = new Quiz();

    funQuiz.addQuestion(new TrueFalse("True or False: Bunnies are cute?", true));
    funQuiz.runQuiz();

    }
}
