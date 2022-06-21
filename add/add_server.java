import java.rmi.*;

public class add_server
{
    public static void main(String[] args)
    {
        try
        {
        //new add_server();
        add_impl a_impl=new add_impl();
        Naming.rebind("adding",a_impl);
        }
        catch(Exception e)
        {

        }
    }
}