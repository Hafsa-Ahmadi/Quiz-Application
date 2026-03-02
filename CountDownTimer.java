import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountDownTimer{

    //----------------------------------------------------------------
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
    //----------------------------------------------------------------

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
        questions.add(createQuestion(
            "What is the output of: System.out.println(10 > 5 ? 'Yes' : 'No');",
            "A) Yes", "B) No", "C) true", "D) false", "A"
        ));
        questions.add(createQuestion(
                "What will be the output of: System.out.println(\"Java\".charAt(2));",
                "A) a", "B) v", "C) J", "D) Exception", "B"
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

        countdownTimer();
    }

    public static void main(String[] args) {
        playQuiz();
    }
}
