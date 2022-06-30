import java.rmi.*;
import java.rmi.server.*;

public class even_impl extends UnicastRemoteObject implements even_int
{
    int tot=0;
    public even_impl()throws RemoteException
    {

    }
    public int tot_num(Integer[] arr)
    {
       //here 48 to 57 is the ascii values of digits
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2==0)
           {
                tot++;
           } 
        }
        return tot;
    }
       
}