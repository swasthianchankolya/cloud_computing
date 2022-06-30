import java.rmi.*;
import java.util.*;

public class alpha_client
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        str=sc.next();
        try
        {
        alpha_int al_in=(alpha_int)Naming.lookup("rmi://localhost/tot_alpha");
        System.out.println(al_in.tot_alpha(str));
        }
        catch(Exception d)
        {

        }
    }
}

/*
for (int i = 0; i < input.length(); i++) {
                        // check if the given character
                        // is a special character
                        if (isSpecialChar(input.charAt(i)))
                        
         {
                                counter++;
                        }
                }
*/