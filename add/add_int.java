import java.rmi.*;
public interface add_int extends Remote
{
    public int add(int a,int b)throws RemoteException;
}