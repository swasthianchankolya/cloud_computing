import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.time.*;

public class DateDifImpl extends UnicastRemoteObject implements DateDifInt{
    String str;
    DateDifImpl() throws RemoteException
    {

    }
    public String dateDif(String a,String b) throws RemoteException
    {
        LocalDate s1;
        String[] s;
        LocalDate s2;
        try {
            s=a.toString().split("-");
            s1=LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            s=b.toString().split("-");
            s2=LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            
            str=""+Math.abs(s1.toEpochDay()-s2.toEpochDay());
        System.out.println(str);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;

    }

    
}