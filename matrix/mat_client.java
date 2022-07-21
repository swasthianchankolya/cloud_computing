import java.rmi.*;
import java.util.*;

public class mat_client
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];
        int newarr[][]=new int[3][3];
        int n;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                n=sc.nextInt();
                mat1[i][j]=n;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                n=sc.nextInt();
                mat2[i][j]=n;
            }
        }
        System.out.println("matix one");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(mat1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("matix two");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(mat2[i][j]+"\t");
            }
            System.out.println();
        }
        try
        {
        mat_int al_in=(mat_int)Naming.lookup("rmi://localhost/mul_matrix");
        newarr=al_in.mul_mat(mat1,mat2);
        System.out.println("matix result");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(newarr[i][j]+"\t");
            }
            System.out.println();
        }
        }
        catch(Exception d)
        {

        }
    }
}