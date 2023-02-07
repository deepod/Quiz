import java.util.Scanner;
public class Question {

    private String question;
    private String ans1, ans2, ans3, ans4;
    private int correctAns;

    public static Question[] questions = new Question[10];


    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAns){
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correctAns = correctAns;
    }


    public static void populateQuestions(){
        Scanner sc = new Scanner(Main.class.getResourceAsStream("questions.txt"));
        sc.useDelimiter("/");

        String delims = "/";
        int count = 0;
        String[] tokens;
        while (sc.hasNextLine()){
          tokens = sc.nextLine().split(delims);
          questions[count] = new Question(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]));
          count = count + 1;
        }
        sc.close();
    }


    public String toString(){
        return(question + "\n[1] " + ans1 + "\n[2] " + ans2 + "\n[3] " + ans3 + "\n[4] " + ans4);
    }
}
