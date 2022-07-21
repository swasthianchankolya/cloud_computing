import java.rmi.*;

public interface mat_int extends Remote
{
    public int[][] mul_mat(int[][]mat1,int[][]mat2)throws RemoteException;
}