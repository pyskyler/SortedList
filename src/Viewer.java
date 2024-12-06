import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Viewer extends JFrame {

    private JTextArea resultArea = new JTextArea();
    private JTextField inputField = new JTextField();
    private JTextField searchField = new JTextField();

    private JButton addButton;
    private JButton searchButton;


    public Viewer() {
        setTitle("Sorted List");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputField.setPreferredSize(new Dimension(400, 30));
        inputPanel.add(new JLabel("Input:"));
        inputPanel.add(inputField);
        addButton = new JButton("Add");
        inputPanel.add(addButton);

        panel.add(inputPanel);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchField.setPreferredSize(new Dimension(400, 30));
        searchPanel.add(new JLabel("Search:"));
        searchPanel.add(searchField);
        searchButton = new JButton("Search");
        searchPanel.add(searchButton);

        panel.add(searchPanel);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout(20,20));
        resultArea.setEditable(false);
        resultPanel.add(resultArea);
        panel.add(resultPanel);

        add(panel);

        setVisible(true);
    }

    public void addResult(String s) {
        String result = resultArea.getText();
        resultArea.setText(result + "\n" + s);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void clearInput() {
        inputField.setText("");
    }

    public String getSearch() {
        return searchField.getText();
    }

    public void setInputButton(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setSearchButton(ActionListener listener) {
        searchButton.addActionListener(listener);
    }

    public void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
