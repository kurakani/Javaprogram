import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String Question = "What's the name of the capital city of China?";
       String Choice1 = "a) Shanghai";
       String Choice2 = "b) Beijing";
       String Choice3 = "c) Guangzhou";

       String CorrectAnswer = "beijing";
       boolean loop = true;


       Scanner input = new Scanner(System.in);

      while (loop){
       System.out.println(Question);
       System.out.println("Below are the Choices:\n"+Choice1+ "\n"+Choice2+"\n"+Choice3+"\nYour answer:");
       String UserAnswer = input.next();

       if (!UserAnswer.equals(CorrectAnswer)){
           UserAnswer = UserAnswer.toUpperCase();
           System.out.println("Your answer is "+UserAnswer+" Which is incorrect. Let's try again");
           System.out.println("Do you want to stop Playing? 'yes' or 'no'");
           String choice = input.next();

           if (choice.equals("yes")) {
               loop = false;
           }

       }
       else {
           UserAnswer = UserAnswer.toUpperCase();
           System.out.println("Your answer is "+UserAnswer+" Which is correct. Congratulations.");
           loop = false;

       }
    }

}
}
