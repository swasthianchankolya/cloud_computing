import java.rmi.*;
import java.rmi.server.*;


public class add_impl extends UnicastRemoteObject implements add_int
{
    public add_impl() throws RemoteException
    {

    }
    public int add(int a,int b)
    {
        return(a+b);
    }
}