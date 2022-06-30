import java.rmi.*;

public class even_client
{
    public static void main(String[] args)
    {
        Integer[] arr={1,2,3,4,5,6,7,8,9,12,15};
        try
        {
       even_int nu_in=(even_int)Naming.lookup("rmi://localhost/total_digits");
       System.out.println(nu_in.tot_num(arr));
        }
        catch(Exception d)
        {

        }
    }
}