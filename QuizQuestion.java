public class QuizQuestion extends Question {
    private String[] options;  
    private String correctAnswer;

 public QuizQuestion(int id, String question, String[] options, String correctAnswer) {
        super(id, question);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
     public void displayQuestion() {
    System.out.println("\nQ" + id + ". " + question);
    char optionChar = 'A';
    for (String option : options) {
        System.out.println(optionChar + ") " + option);
        optionChar++;
    }
}

    public boolean checkanswer(String answer){
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
