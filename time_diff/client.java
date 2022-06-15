import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.time.LocalDate;

public class client extends JFrame implements ActionListener {
    JTextField d1,d2,ans;
    JLabel l1,l2;
    JButton Answer;

    public client()
    {
        super("Defferance between the two Dates");

        l1 = new JLabel("First date (HH-MM-SS");
        l2 = new JLabel("Second date (HH-MM-SS");

        d1 = new JTextField(20);
        d2 = new JTextField(20);

        ans = new JTextField(20);

        Answer = new JButton(" Results ");

        Answer.addActionListener(this);

        getContentPane().setLayout(new GridLayout(4,5));

        getContentPane().add(l1);
        getContentPane().add(d1);

        getContentPane().add(l2);
        getContentPane().add(d2);

        getContentPane().add(Answer);
        getContentPane().add(ans);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try{ 
            TimeDifInt f=(TimeDifInt) Naming.lookup("rmi://localhost/TimeDif");
            String j=f.TimeDif(d1.getText().toString(),d2.getText().toString());
            ans.setText(""+j);
            }catch (Exception e1)
            {
            System.out.println(e1);
            }
    }
    public static void main(String[] args) {
        try {
            client Client = new client();
            Client.setVisible(true);
            Client.pack();
           } 
           catch (Exception ex) 
           {
            System.out.println(ex);
          }
    }
}