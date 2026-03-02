import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Displaying {

    //-----------------------------------------------------------------
    public static void displayQuestion(String[] question, int questionNumber) {
        System.out.println("\n====================");
        System.out.println("Question " + questionNumber + ": " + question[0]);
        System.out.println(question[1]);
        System.out.println(question[2]);
        System.out.println(question[3]);
        System.out.println(question[4]);
    }
    
    public static void playQuiz() {
        System.out.println("Welcome to Java Quiz!");
        ArrayList<String[]> questions = getJavaQuestions();
        Collections.shuffle(questions);
        

        int question_number = 1;

        for (String[] question : questions) {
            displayQuestion(question, question_number);
            question_number++;
        }

    }
    //-----------------------------------------------------------------
    
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
        questions.add(createQuestion(
                "Which of these is a valid way to create an object in Java?",
                "A) MyClass obj = new MyClass();", "B) obj = new MyClass();", 
                "C) class obj = MyClass();", "D) new MyClass obj();", "A"
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

    public static void countdownTimer() {
        System.out.println("\nYou have 10 seconds to think...");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.print("\rTime left: " + i + " seconds ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        playQuiz();
    }
}
}
