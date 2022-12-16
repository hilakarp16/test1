package com.example.test1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        String correctAnswer;
        List<Question> questions = asList(
                new Question(
                        "how old is Milky?",
                        asList(
                                "9 years old",
                                "3 years old"
                        ),
                        "3 years old"
                ),
                new Question(
                        "does Bella eats all her food?",
                        asList(
                                "yes",
                                "no"
                        ),
                        "no"
                ),
                new Question(
                        "how old is Hila's iphone?",
                        asList(
                                "9 years old",
                                "3 years old",
                                "7 years old"
                        ),
                        "3 years old"
                ),
                new Question(
                        "how long does the karps live in shadmot?",
                        asList(
                                "11 years",
                                "3 years",
                                "15 years",
                                "8 years"
                        ),
                        "11 years"
                ), new Question(
                        "dose loli know Java now?",
                        asList(
                                "nope",
                                "absolutely not",
                                "IDK",
                                "maybe"
                        ),
                        "yessssss"
                )

          );


        int index = Math.abs(new Random().nextInt() % questions.size());
        Question selectedQuestion = questions.get(index);
        System.out.println(selectedQuestion.getQuestionText());
        List<String> answers = selectedQuestion.getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(i + 1 + ". " + answers.get(i));
        }
        Scanner in = new Scanner(System.in);
        int userAnswer = in.nextInt();
        String usersAnswerText = answers.get(userAnswer - 1);
        correctAnswer = selectedQuestion.getCorrectAnswer();
        if (usersAnswerText.equals(correctAnswer)) {
            System.out.println("Your answer is correct!!!");
        } else {
            System.out.println("Your answer is wrong, and you are a looser!!!");
            System.out.println("Just for your information, the correct answer was: " + correctAnswer);
        }
    }
}
