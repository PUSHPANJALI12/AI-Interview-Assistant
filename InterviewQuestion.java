import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your skill:");

        String skill = sc.nextLine();

        if(skill.equalsIgnoreCase("java")){
            System.out.println("Question: What is JVM?");
        } 
        else if(skill.equalsIgnoreCase("python")){
            System.out.println("Question: What is list comprehension?");
        }
        else{
            System.out.println("Skill not found");
        }

        sc.close();
    }
}
