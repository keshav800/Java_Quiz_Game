public abstract class Question{
    protected int id;
    protected String question;
   public Question(int id, String question) {
    this.id = id;
    this.question = question; 
}

    public abstract void displayQuestion();
   public abstract boolean checkanswer(String answer);
    
}