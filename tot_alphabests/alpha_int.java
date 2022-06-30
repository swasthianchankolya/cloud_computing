import java.rmi.*;

public interface alpha_int extends Remote
{
    public int tot_alpha(String str)throws RemoteException;
}