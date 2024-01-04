import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApplication {
    private List<QuizQuestion> quizQuestions;

    public QuizApplication() {
        initializeQuestions();
    }

    private void initializeQuestions() {
        quizQuestions = new ArrayList<>();
        
       
        quizQuestions.add(new QuizQuestion("What is the capital of France?", new String[]{"Paris", "Berlin", "Madrid", "Rome"}, 0));
        quizQuestions.add(new QuizQuestion("Which planet is known as the Red Planet?", new String[]{"Mars", "Venus", "Jupiter", "Saturn"}, 0));
        quizQuestions.add(new QuizQuestion("Which Countruy is the largest country in the world ?", new String[]{"Russia", "India", "USA", "Canada"}, 0));
        quizQuestions.add(new QuizQuestion("Which Countruy is the smallest country in the world ?", new String[]{"Russia", "India", "Vatican City", "Israel"}, 2));
        quizQuestions.add(new QuizQuestion("The First Indian to go into space ?", new String[]{"Yuri Garain", "Rakesh Sharma ", "Kalpana Chawla", "Buzz Aldrin "}, 1));
        quizQuestions.add(new QuizQuestion("What is the currency of India  ?", new String[]{"Yen", "Indian Rupee", "Dollar ", "Dhiram"}, 1));
        quizQuestions.add(new QuizQuestion("The Highest Mountain Peak in the world ?", new String[]{"Kilmanjaro", "Andes", "Alps", "Mount Everest "}, 3));
        quizQuestions.add(new QuizQuestion("Deepest Point on earth ?", new String[]{"The Trench", "Marina Trench ", "Ural", "Great Barrier Reef "}, 1));
  
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int userScore = 0;

        for (QuizQuestion question : quizQuestions) {
            displayQuestion(question);

            System.out.print("Enter your choice (1-" + question.getOptions().length + "): ");
            int userChoice = scanner.nextInt();

            if (userChoice - 1 == question.getCorrectOption()) {
                System.out.println("Correct!\n");
                userScore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getOptions()[question.getCorrectOption()] + "\n");
            }
        }

        System.out.println("Quiz completed! Your score: " + userScore + " out of " + quizQuestions.size());
    }

    private void displayQuestion(QuizQuestion question) {
        System.out.println(question.getQuestion());
        String[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public static void main(String[] args) {
        QuizApplication quizApp = new QuizApplication();
        quizApp.startQuiz();
    }
}
