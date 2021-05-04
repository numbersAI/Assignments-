package assaignments;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class AlphaNumberic5000 
{    
        public static void main(String[] args) 
        {
            int len = 6;    //ensuring only 6 chars                             //1
            rand obj = new rand();                                              //2
                do 
                {
                    obj.randomString(len);                                      //3           
                }while(obj.count <= 5000); //only 5000 unique value print                                  
        }                                       
}

class rand
{
    Set<Object> set = new HashSet<Object>();
    
    final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    SecureRandom rnd = new SecureRandom();
    String s;
    int count = 1;

    void randomString(int len)                                                  //4
        {
            StringBuilder sb = new StringBuilder(len);                
                    for(int i = 0; i < len; i++)
                    {                        
                        sb.append(AB.charAt(rnd.nextInt(AB.length()))); 
                        
                    }                    
                    
            s = sb.toString();
            //conditions checking ====
            if(!(s.contains("L") || s.contains("I") || s.contains("O") || s.contains("0"))) //Restricting chars L, I, O and 0(zero)
            {
                //checking 2,3 and 5 char is num or not
               if(Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2)) && Character.isDigit(s.charAt(4)))
               { 
                   if((Character.isLetter(s.charAt(0)) )) //no number at 1
                   {
                       if(Character.isLetter(s.charAt(3))) // no number at 4
                       {  
                           if(Character.isLetter(s.charAt(5) )) //no number at 6
                           {
                                if(!(set.contains(s))) //using set ensuring the unique value
                                {
                                    set.add(s);
                                    System.out.println(s+"  "+(count++));       
                                }
                           }
                        }

                   }
               }
            }
            
        }


}



        







    
    
