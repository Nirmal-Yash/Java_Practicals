import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestionText());

            List<String> options = question.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();

            if (userChoice == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding questions to the quiz
        List<String> options1 = new ArrayList<>();
        options1.add("A. Java");
        options1.add("B. Python");
        options1.add("C. C++");
        options1.add("D. Ruby");
        Question question1 = new Question("Which programming language is used for Android development?", options1, 1);
        quiz.addQuestion(question1);

        List<String> options2 = new ArrayList<>();
        options2.add("A. HTML");
        options2.add("B. CSS");
        options2.add("C. JavaScript");
        options2.add("D. Java");
        Question question2 = new Question("Which programming language is used for web development?", options2, 3);
        quiz.addQuestion(question2);

        List<String> options3 = new ArrayList<>();
        options3.add("A. OpenAI");
        options3.add("B. IBM");
        options3.add("C. Microsoft");
        options3.add("D. Google");
        Question question3 = new Question("Which company developed the ChatGPT language model?", options3, 4);
        quiz.addQuestion(question3);

        // Starting the quiz
        quiz.startQuiz();
    }
}