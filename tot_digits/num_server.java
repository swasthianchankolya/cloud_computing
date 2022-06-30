import java.rmi.*;

public class num_server
{
    public static void main(String[] args)
    {
        try
        {
        num_impl n_i=new num_impl();
        Naming.rebind("total_digits",n_i);
        }
        catch(Exception e)
        {

        }
    }
}