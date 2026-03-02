import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codechef {

    public static ArrayList<String[]> getJavaQuestions() {
        ArrayList<String[]> questions = new ArrayList<>();

        questions.add(createQuestion(
                "Which keyword is used to create a subclass in Java?",
                "A) implements", "B) extends", "C) inherits", "D) override", "B"
        ));
        questions.add(createQuestion(
                "What is the output of: System.out.println(10 + 20 + \"Java\")?",
                "A) 30Java", "B) Java1020", "C) Java30", "D) 1020Java", "A"
        ));
        return questions;
    }

    public static String[] createQuestion(String text, String optA, String optB, String optC, String optD, String correctAns) {
        String[] question = new String[6];
        question[0] = text;   
        question[1] = optA; 
        question[2] = optB;
        question[3] = optC;   
        question[4] = optD;   
        question[5] = correctAns;
        return question;
    }

    public static void playQuiz() {
        ArrayList<String[]> questions = getJavaQuestions();

        Collections.shuffle(questions);
    }

    public static void main(String[] args) {
        playQuiz();
    }
}