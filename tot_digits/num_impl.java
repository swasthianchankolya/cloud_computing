import java.rmi.*;
import java.rmi.server.*;

public class num_impl extends UnicastRemoteObject implements num_int
{
    String numbers="0123456789";
    int tot=0;
    public num_impl()throws RemoteException
    {

    }
    public int tot_num(String str)
    {
       //here 48 to 57 is the ascii values of digits
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
           {
                tot++;
           } 
        }
        return tot;
    }
       
}