import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    private static int score = 0;
    private static int currentQuestionIndex = 0;
    private static final String[][] quizData = {
            {"What is the capital of France?", "A. Berlin", "B. Madrid", "C. Paris","C"},
            {"Which planet is known as the Red Planet?", "A. Venus", "B. Mars", "C. Jupiter", "B"},
            {"Who discovered electricity?", "A.  Isaac Newton", "B. Nikola Tesla", "C. Benjamin Franklin", "C"},
            {"What is the world's largest ocean?", "A. Atlantic Ocean", "B. Pacific Ocean", "C. Indian Ocean", "B"},
            {"What is the national bird of the United States?","A. Eagle","B. Pigeon","C. Condor","A"}
            // Add more questions and answers as needed
    };

    public static void main(String[] args) {
        startQuiz();
    }

    private static void startQuiz() {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        for (String[] questionData : quizData) {
            String question = questionData[0];
            String optionA = questionData[1];
            String optionB = questionData[2];
            String optionC = questionData[3];
            String correctAnswer = questionData[4];

            System.out.println(question);
            System.out.println(optionA);
            System.out.println(optionB);
            System.out.println(optionC);

            // Set up timer for 15 seconds per question
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    nextQuestion();
                }
            }, 15000);

            String userAnswer = scanner.nextLine().toUpperCase();

            // Cancel the timer since the user has submitted an answer
            timer.cancel();
            timer = new Timer();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer + "\n");
            }

            nextQuestion();
        }

        // Display final score and summary
        System.out.println("Quiz completed!\nYour final score: " + score + "/" + quizData.length);
        scanner.close();
    }

    private static void nextQuestion() {
        currentQuestionIndex++;

        if (currentQuestionIndex < quizData.length) {
            System.out.println("Next Question:\n");
        }
    }
}