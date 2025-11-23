
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    byte age ;
        short year ;
        int num ;
        
        long mil ;
        float temp;
        
        double price;
        
        char g;

        boolean jk;
        public static void main(String[] args){
            
           DefaultValues t=new DefaultValues();
           System.out.println(t.age);
           System.out.println(t.year);
           System.out.println(t.num);
           System.out.println(t.mil);
           System.out.println(t.temp);
           System.out.println(t.price);
           System.out.println(t.g);
           System.out.println(t.jk);
             // it cannot be performed in local variables as values are not initialized
            
        }
        
        

}