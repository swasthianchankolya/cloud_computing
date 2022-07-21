import java.rmi.*;

public class mat_server
{
    public static void main(String[] args)
    {
        try
        {
        mat_impl al_im=new mat_impl();
        Naming.rebind("mul_matrix",al_im);
        System.out.println("server is ready");
        }
        catch(Exception e)
        {

        }
    }
}