/*
@swasthiiiiii
*/
import java.rmi.*;
public class ServerSw 
 {
    public static void main(String[] args) {
        try{
        TimeDifImpl time=new TimeDifImpl();
        Naming.bind("TimeDif", time);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}