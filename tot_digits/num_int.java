import java.rmi.*;
public interface num_int extends Remote
{
    public int tot_num(String str)throws RemoteException;
}