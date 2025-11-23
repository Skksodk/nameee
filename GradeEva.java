import java.util.Scanner;

/**
 * Write a description of class GradeEva here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEva
{
    public static void main (String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your grade");
        int grade=sc.nextInt();
        String pf=(grade>=40)?"pass":"fail";
        System.out.println(pf);
        
        
    }
}