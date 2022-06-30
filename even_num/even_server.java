import java.rmi.*;

public class even_server
{
    public static void main(String[] args)
    {
        try
        {
        even_impl n_i=new even_impl();
        Naming.rebind("total_digits",n_i);
        }
        catch(Exception e)
        {

        }
    }
}