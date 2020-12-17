package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions = new ArrayList<>();
    private int totalCorrect = 0;

    public void addQuestion(Question newQuestion) {
        questions.add(newQuestion);
    }

    public void runQuiz() {
        for (Question question : questions) {
            Scanner input = new Scanner(System.in);
            question.displayQuestion();
            if (question instanceof MultipleChoice) {
                ((MultipleChoice) question).displayChoices();
                Character answer = input.next().charAt(0);
                if (((MultipleChoice) question).isCorrect(answer)) {
                    totalCorrect += 1;
                }
            } else if (question instanceof Checkbox) {
                ((Checkbox) question).displayChoices();
                System.out.println("Press ENTER twice to finish answering");
                List<Character> answers = new ArrayList<>();
                // could be improved with a do-while loop later
                Character answer = input.next().charAt(0);
                answers.add(answer);
                while (!answer.equals("")) {
                    answer = input.next().charAt(0);
                    answers.add(answer);
                }
                if (((Checkbox) question).isCorrect(answers)) {
                    totalCorrect += 1;
                }
            } else if (question instanceof TrueFalse) {
                ((TrueFalse) question).displayChoices();
                boolean answer = input.nextBoolean();
                if (((TrueFalse) question).isCorrect(answer)) {
                    totalCorrect += 1;
                }
            }
        }
        gradeQuiz();
    }

    public void gradeQuiz() {
        System.out.println("You answered " + totalCorrect + " out of " + questions.size() + " questions correctly.");
    }
}
