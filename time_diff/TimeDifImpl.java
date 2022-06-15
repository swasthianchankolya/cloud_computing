/*
@swasthiiiiii
*/
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.time.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeDifImpl extends UnicastRemoteObject implements TimeDifInt{
    String str1,str2,str3,str_ans="";
    TimeDifImpl() throws RemoteException
    {

    }
    public String TimeDif(String time_1,String time_2) throws RemoteException
    {
        LocalTime time1;
        LocalTime time2;
        String[] time1_arr;
        String[] time2_arr;
        
        try 
        {
        time1_arr=time_1.toString().split(":");
        time2_arr=time_2.toString().split(":");
        int time1_hour=Integer.parseInt(time1_arr[0]);
        int time1_min=Integer.parseInt(time1_arr[1]);
        int time1_sec=Integer.parseInt(time1_arr[2]);

        int time2_hour=Integer.parseInt(time2_arr[0]);
        int time2_min=Integer.parseInt(time2_arr[1]);
        int time2_sec=Integer.parseInt(time2_arr[2]);

         LocalTime time1_new = LocalTime.of(time1_hour, time1_min, time1_sec);
         LocalTime time2_new = LocalTime.of(time2_hour, time2_min, time2_sec);
        
         // Calculating the difference in Hours
        long hours = ChronoUnit.HOURS.between(time1_new, time2_new);
  
        // Calculating the difference in Minutes
        long minutes = ChronoUnit.MINUTES.between(time1_new, time2_new) % 60;
  
        // Calculating the difference in Seconds
        long seconds = ChronoUnit.SECONDS.between(time1_new, time2_new) % 60;
  
         str1 = Long.toString(hours);
         str2 = Long.toString(minutes);
         str3 = Long.toString(seconds);

         str_ans=str1;
         str_ans=str_ans+":";
         str_ans=str_ans+str2;
         str_ans=str_ans+":";
         str_ans=str_ans+str3;
        } 
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str_ans;
    }

    
}