
/**
 * Write a description of class Tut3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tut3
{
    int agr; // instance variable
    static int rtr; //static variable
    
    public static void main(String[] args){
        int age=18; //local variable
        System.out.println(age);
        
        //<className><variable>=new <className>();
        Tut3 t1=new Tut3();
        
        System.out.println(rtr);
        System.out.println(t1.agr);
        
        //Implict typecasting ,sano dekhi thulo datatype lanu
        
        double db=age;
        System.out.println(db);
        
        //explicit typecasting
        
        double dbr=10.90;
        int itr=(int)dbr;
        
        System.out.println(itr);
        
        //Exceptions
        short st=10;
        short str=11;
        short sum=(short)(st+str);
        
        //MAX,MIN,BIts,Bytes
        
        System.out.println(Byte.MAX_VALUE); //max value
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);     //bits
        System.out.println(Byte.BYTES);   //bytes
        
        //ESCAPE SEQ
        System.out.println("hello \nworld"); //new line
        System.out.println("hello\tnepal"); //for tabs
        System.out.println("she said \" hi \"");//double quotation
        
        //unicode esc seq
        System.out.println("\u2764");
        
    }
}