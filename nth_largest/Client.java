import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.rmi.Naming;

public class Client extends JFrame {
        JTextField t1,t2;
        JLabel l1,l2,res;
        JButton sub;
    Client()
    {
        super("Find n'th greatest number");
        t1=new JTextField(20);
        t2=new JTextField(20);
        l1=new JLabel("Enter the array element");
        l2=new JLabel("Enter the n's value");
        sub=new JButton("Submit");
        res=new JLabel("");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(sub);
        add(res);

        pack();
        setVisible(true);

        sub.addActionListener(new ActionListener(){
            @Override			
            public void actionPerformed(ActionEvent e)
            {
                try {
                    String[] str=t1.getText().toString().split(",");
                    Integer[] arr=new Integer[str.length];
                    for(int i=0;i<str.length;i++)
                    {
                        
                        arr[i]=Integer.parseInt(str[i]);
                    }
                    
                    int b=Integer.parseInt(t2.getText());
                    Large_num ln=(Large_num)Naming.lookup("rmi://localhost/Large");
                    int val=ln.great(arr, b);
                    if(val==-1)
                    {
                        res.setText("less unique elements are present");
                    }
                    else
                    {
                        res.setText(""+val);
                    }

                    
                } catch (Exception s) {
                    //TODO: handle exception
                    System.out.println(s);
                }

            }
        });
        

    }

    public static void main(String[] args) {
        try {
            new Client();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}