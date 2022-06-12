import java.rmi.*;

public interface DateDifInt extends Remote
{
    public String dateDif(String a,String b) throws RemoteException;
} 