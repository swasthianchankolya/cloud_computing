import java.rmi.*;

public class add_client
{
    public static void main(String[] args)
    {
        try
        {
         add_int addobj=(add_int)Naming.lookup("rmi://localhost/adding");
         System.out.println(addobj.add(20,30));
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
}
