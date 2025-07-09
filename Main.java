import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Wlcome to my quiz Game");
        System.out.println("Enter your name");
        String username=sc.nextLine();
        QuizGame game=new QuizGame( username);
        game.startQuiz();
        sc.close();
    }
}
