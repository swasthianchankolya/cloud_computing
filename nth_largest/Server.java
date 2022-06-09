import java.rmi.*;
public class Server
{
    public static void main(String[] args) {
        try {
            LargeImpl a=new LargeImpl();
            Naming.rebind("Large",a);
            } 
		catch (Exception e) 
		{
            //TODO: handle exception
            System.out.println(e);
        }
    }
}