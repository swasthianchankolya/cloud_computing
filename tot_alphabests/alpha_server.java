import java.rmi.*;

public class alpha_server
{
    public static void main(String[] args)
    {
        try
        {
        alpha_impl al_im=new alpha_impl();
        Naming.rebind("tot_alpha",al_im);
        System.out.println("server is ready");
        }
        catch(Exception e)
        {

        }
    }
}