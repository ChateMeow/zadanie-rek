package com.example.githubapiconsumer.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GitHubApiConsumerGUI extends JFrame {

    private JLabel repositoryLabel;
    private JTextField repositoryTextField;
    private JButton fetchButton;
    private JTextArea resultTextArea;

    public GitHubApiConsumerGUI() {
        initializeComponents();
        setupLayout();
        setupListeners();

        setTitle("GitHub API Consumer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        repositoryLabel = new JLabel("Repository:");
        repositoryTextField = new JTextField(20);
        fetchButton = new JButton("Fetch");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
    }

    private void setupLayout() {
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 5, 5);
        add(repositoryLabel, constraints);

        constraints.gridx = 1;
        add(repositoryTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(5, 10, 10, 10);
        add(fetchButton, constraints);

        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0, 10, 10, 10);
        add(new JScrollPane(resultTextArea), constraints);
    }

    private void setupListeners() {
        fetchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String repository = repositoryTextField.getText();

                // Call the GitHub API service and update the resultTextArea with the retrieved information
                // Replace the following line with the actual implementation
                resultTextArea.setText("Fetching repository: " + repository);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GitHubApiConsumerGUI();
            }
        });
    }
}
