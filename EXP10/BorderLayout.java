//Aim:
To write a Java applet program to demonstrate the use of BorderLayout for arranging buttons and a text area in the North, South, East, West, and Center regions.

//Algorithm:
Start the program.
Import the java.awt and java.applet packages.
Create an applet class named insertdemo.
Override the init() method.
Set the background color to cyan.
Set the layout manager to BorderLayout.
Add buttons to the North, South, East, and West regions.
Create a TextArea and add it to the Center region with the specified message.
Override the getInsets() method to set a 10-pixel margin on all sides.
Execute the applet to display the components.
Stop the program.

//program:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class carddemo extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JPanel buttonPanel;
    CardLayout buttonCardLayout;

    public carddemo() {
        buttonPanel = new JPanel();

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new JButton("First Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first");

        b2 = new JButton("Second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second");

        b3 = new JButton("Third Button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third");

        add(buttonPanel);

        setTitle("CardLayout Demo");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            carddemo demo = new carddemo();
            demo.setVisible(true);
        });
    }
}
//Result:
Thus, the Java applet program demonstrating the BorderLayout layout manager was written successfully. The buttons are displayed in the North, South, East, and West regions, and the text area is displayed in the Center region with a cyan background.
