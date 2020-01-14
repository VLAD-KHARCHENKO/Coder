import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Зашифрувати");
    private JButton button1 = new JButton("Розшифрувати");
    private JTextField input = new JTextField("", 10);
    private JLabel label = new JLabel("Введіть текст:");

    public SimpleGUI() {
        super("CODER");
        this.setBounds(150, 100, 350, 170);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        button.addActionListener(new ButtonEventLisiner());
        container.add(button);
        button1.addActionListener(new ButtonEventLisiner1());
        container.add(button1);
    }

    class ButtonEventLisiner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            char[] words = s.toCharArray();
            char[] code = new char[words.length];
            for (int i = 0; i < words.length; i++) {
                code[i] = (char) (words[i] + i + 2);
            }

            String message = "";
            for (int i = 0; i < words.length; i++) {
                message += code[i];
            }
            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
        }

    }


    class ButtonEventLisiner1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = input.getText();
            char[] words = s.toCharArray();
            char[] code = new char[words.length];
            for (int i = 0; i < words.length; i++) {
                code[i] = (char) (words[i] - i - 2);
            }
            String message = "";
            for (int i = 0; i < words.length; i++) {
                message += code[i];
            }
            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
