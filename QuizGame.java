import java. util.*;
public class QuizGame {
    private List<Question> questions;
    private int score;
    private String username;

    public QuizGame(String username){
        this.username=username;
        questions=new ArrayList<>();
        score=0;
         loadquestions();
    }
     private void loadquestions(){
        questions.add(new QuizQuestion(1, "which keyword is used to inherit a class in java?",new String[]{"this","super","extends","implements"},"C"));
        questions.add(new QuizQuestion(
                2,
                "Which method is the entry point in Java?",
                new String[]{"start()", "main()", "run()", "init()"},
                "B"
        ));
        
        questions.add(new QuizQuestion(
                3,
                "Which of the following is not a Java primitive type?",
                new String[]{"int", "boolean", "String", "char"},
                "C"
        ));

        questions.add(new QuizQuestion(
                4,
                "What is the size of int in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"},
                "B"
        ));

        questions.add(new QuizQuestion(
                5,
                "What does OOP stand for?",
                new String[]{"Object Oriented Programming", "Object Operating Programming", "Only Object Programming", "Open Object Programming"},
                "A"
        ));
     }
    public void startQuiz(){
        Scanner sc=new Scanner(System.in);
        for(Question question: questions){
        question.displayQuestion();
        System.out.println("Your answer (A/B/C/D): ");
        String ans=sc.nextLine();
        if(question.checkanswer(ans)){
            System.out.println("correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
        }
        }
         showresult();
    }
    private void showresult(){
         System.out.println("\n===============================");
        System.out.println(" Quiz Finished!");
        System.out.println("User: " + username);
        System.out.println("Your Score: " + score + "/" + questions.size());
        System.out.println("===============================\n");
    }
}
