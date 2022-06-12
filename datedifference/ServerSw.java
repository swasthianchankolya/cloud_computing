import java.rmi.*;
public class ServerSw  {
    public static void main(String[] args) {
        try{
        DateDifImpl dat=new DateDifImpl();
        Naming.bind("dateDif", dat);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}