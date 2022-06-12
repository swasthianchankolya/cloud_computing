import java.rmi.*;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
public class ClientApp extends JFrame{
    ClientApp()
    {
        JTextField d1=new JTextField("yyyy-mm-dd",20);
        JTextField d2=new JTextField("yyyy-mm-dd",20);
        JButton b=new JButton("Submit");
        JLabel l1=new JLabel("");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try{
                    DateDifInt f=(DateDifInt) Naming.lookup("rmi://localhost/dateDif");
                    String j=f.dateDif(d1.getText().toString(),d2.getText().toString());
                    l1.setText(""+j);

                }catch(Exception f){
                    System.out.println(f);
                }
            }

        });
        getContentPane().add(d1);
        getContentPane().add(d2);
        getContentPane().add(l1);
        getContentPane().add(b);
        setLayout(new GridLayout(3,1));
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new ClientApp();
        
    }
    
}