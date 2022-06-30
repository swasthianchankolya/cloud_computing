//97
//122
import java.rmi.*;
import java.rmi.server.*;

public class alpha_impl extends UnicastRemoteObject implements alpha_int
{
    int tot=0;

    public alpha_impl()throws RemoteException
    {

    }
    public int tot_alpha(String str)
    {
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>=97 && str.charAt(i)<=122)
          {
            tot=tot+1;
          }  
        }
        return tot;
    }
}