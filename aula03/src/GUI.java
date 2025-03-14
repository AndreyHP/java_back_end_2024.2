import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GUI {
   public static void gui(){
       JFrame frame = new JFrame();
       Container container = new Container();
       JTextField textField = new JTextField();
       JTextField nameField = new JTextField();
       JTextField ageField = new JTextField();
       JButton send = new JButton("Procurar");
       JButton create = new JButton("Novo");

       JLabel nameLabel = new JLabel("Name");
       JLabel ageLabel = new JLabel("Age");
       JLabel criadoLabel = new JLabel("Usuario criado");

       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

       frame.setSize(600,400);
       frame.setBackground(Color.black);

       textField.setBounds(150,100,100,20);
       nameField.setBounds(400,100,100,20);
       ageField.setBounds(400,150,100,20);

       nameLabel.setBounds(400,70,100,20);
       ageLabel.setBounds(400,120,100,20);
       criadoLabel.setBounds(400,250,100,20);


       send.setBounds(150,150,100,20);
       create.setBounds(400,200,100,20);

       create.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int i = 0;
               int age = Integer.parseInt(ageField.getText());
               CreateUser.create(nameField.getText(),age,i);
               criadoLabel.setVisible(true);
           }
       });

       send.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               for (int i = 1; i < CreateUser.users.length; i++) {
                   if (Objects.equals(textField.getText(), CreateUser.users[i].name)){
                       ShowUser.show(i);
                       criadoLabel.setVisible(false);
                   }else{
                       System.out.println("Usuario não Encontrado");
                   }
               }

           }
       });


       criadoLabel.setVisible(false);

       container.setBounds(100,100,100,200);
       container.add(textField);
       container.add(nameField);
       container.add(ageField);
       container.add(nameLabel);
       container.add(ageLabel);
       container.add(criadoLabel);
       container.add(send);
       container.add(create);

       frame.add(container);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }
}
