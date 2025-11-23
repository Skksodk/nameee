
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[] args){
        
        int a = 10;
        int b = 3;
        int x = 5;
        int y = 10;
        int p = 7;
        int q = 10;
        boolean b1 = true;
        int num = -5;

        System.out.println(" Arithmetic Operators");
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        System.out.println("\n Unary Operators ");
        int i = ++x;  
        int j = x++; 
        int preDec = --x;  
        int postDec = x--; 
        System.out.println("Pre-increment: " + i);
        System.out.println("Post-increment : " + j);
        System.out.println("Pre-decrement): " + preDec);
        System.out.println("Post-decrement : " + postDec);
        
        

        System.out.println("\n Assignment Operators");
        y += 5; 
        System.out.println("y+= " + y);
        y -= 3;  
        System.out.println("y-=3 " + y);
        y *= 2;  
        System.out.println("y*=2 " + y);

        System.out.println(" \n Relational Operators");
        
        System.out.println("a == b : " + (a == b)); //for equals to
        System.out.println("a != b : " + (a != b));  //for not equals to
        System.out.println("a > b  : " + (a > b));    //for greater than
        System.out.println("a < b  : " + (a < b));   //for smaller than
        System.out.println("a >= b : " + (a >= b));  //for greater or equal
        System.out.println("a <= b : " + (a <= b));   //for smaller or equal
         
           System.out.println("\n logical Operators");
        
        if (a > 0 && b > 0) //AND
        System.out.println("true"); 

         if (a >10 || b < 60 ) {//OR
            System.out.println("true.");
        } else {
            System.out.println("false.");
        }


        if(!(a > b)){
        System.out.println("b is greater than a");    
    }else{
        System.out.println("a is greater than b");
    }

        System.out.println("\n Ternary Operator");
        String result = (num > 0) ? "Positive" : "Negative or Zero";
        System.out.println("Ternary result: " + result);
 

        
    }
}