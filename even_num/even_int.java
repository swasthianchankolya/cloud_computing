import java.rmi.*;
public interface even_int extends Remote
{
    public int tot_num(Integer[] arr)throws RemoteException;
}