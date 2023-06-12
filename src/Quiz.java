import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz extends JFrame implements ActionListener , KeyListener {
    private JTextArea myTextArea;
    private JPanel mainPanel;

    private JTextField myField;
    private JButton enterButton;

    private String an;

    public Quiz(){
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("My Gui!");
        setSize(800,400);
        setLocation(250,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myField.addKeyListener(this);
        enterButton.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        if (text.equals("Enter")) {
            update(myField.getText());
            an = myField.getText();
            myField.setText("");

            }
        }


    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyPressed(KeyEvent e){}

    @Override
    public void keyReleased(KeyEvent e){}

    public void update(String text){

        myTextArea.append(text + "\n");
    }

public boolean  real (String help){
        if (an.equals(help)){
            update("correct");
            myField.setText("");
            return true;
        }
        return false;
}




}
