import java.rmi.*;

public class num_client
{
    public static void main(String[] args)
    {
        String str="hello1234howare45";
        try
        {
       num_int nu_in=(num_int)Naming.lookup("rmi://localhost/total_digits");
       System.out.println(nu_in.tot_num(str));
        }
        catch(Exception d)
        {

        }
    }
}