package com.login;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Objects;
import javax.swing.*;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        setupFocusListeners(nameUser, nameTXT);
        setupFocusListeners(lastNameUser, lastNameTXT);
        setupFocusListeners(username, usernameTXT);
        setupFocusListeners(email, emailTXT);
        setupFocusListeners(pass, passTXT);
        setupFocusListeners(confirmPass, confirmPassTXT);
        checkBoxShowPassword.addItemListener(this::jCheckBox1ItemStateChanged);
    }
    private void initComponents() {
        JPanel panelRegister = new JPanel();
        JPanel panelSkyBlue = new JPanel();
        JPanel extraskyblue = new JPanel();
        JPanel extraskyblue1 = new JPanel();
        JLabel image = new JLabel();
        JLabel getStartedTXT = new JLabel();
        JLabel focustaskTXT = new JLabel();
        JLabel logo = new JLabel();
        JLabel messageTXT = new JLabel();
        JLabel registerTXT = new JLabel();
        confirmPassTXT = new javax.swing.JLabel();
        JButton buttonSignUp = new JButton();
        JButton buttonX = new JButton();
        nameTXT = new javax.swing.JLabel();
        lastNameTXT = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JLabel();
        emailTXT = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        lastNameUser = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        passTXT = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        checkBoxShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER - FOCUS TASK");
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelRegister.setPreferredSize(new java.awt.Dimension(1250, 750));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSkyBlue.setBackground(new java.awt.Color(0, 102, 255));
        panelSkyBlue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extraskyblue.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout extraskyblueLayout = new javax.swing.GroupLayout(extraskyblue);
        extraskyblue.setLayout(extraskyblueLayout);
        extraskyblueLayout.setHorizontalGroup(
                extraskyblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        extraskyblueLayout.setVerticalGroup(
                extraskyblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 110, Short.MAX_VALUE)
        );

        panelSkyBlue.add(extraskyblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 200, 110));

        extraskyblue1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout extraskyblue1Layout = new javax.swing.GroupLayout(extraskyblue1);
        extraskyblue1.setLayout(extraskyblue1Layout);
        extraskyblue1Layout.setHorizontalGroup(
                extraskyblue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );
        extraskyblue1Layout.setVerticalGroup(
                extraskyblue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        panelSkyBlue.add(extraskyblue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 50, 50));

        image.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/ToDoList.png"))));
        image.setText("jLabel1");
        panelSkyBlue.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 570, 390));

        getStartedTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 48));
        getStartedTXT.setForeground(new java.awt.Color(255, 255, 255));
        getStartedTXT.setText("Get Started!");
        panelSkyBlue.add(getStartedTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 320, 40));

        focustaskTXT.setFont(new java.awt.Font("Bebas Neue", Font.BOLD, 36));
        focustaskTXT.setForeground(new java.awt.Color(255, 255, 255));
        focustaskTXT.setText("FOCUS Task");
        panelSkyBlue.add(focustaskTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, 60));

        logo.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/focuslogo.png"))));
        panelSkyBlue.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        messageTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        messageTXT.setForeground(new java.awt.Color(255, 255, 255));
        messageTXT.setText("Register and Unlock Productivity");
        messageTXT.setPreferredSize(new java.awt.Dimension(460, 17));
        panelSkyBlue.add(messageTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, 20));

        panelRegister.add(panelSkyBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 750));

        registerTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 36));
        registerTXT.setForeground(new java.awt.Color(0, 102, 255));
        registerTXT.setText("Register");
        panelRegister.add(registerTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));

        confirmPassTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        confirmPassTXT.setForeground(new java.awt.Color(102, 102, 102));
        confirmPassTXT.setText("Confirm Password");
        panelRegister.add(confirmPassTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, -1, -1));

        buttonSignUp.setBackground(new java.awt.Color(255, 153, 51));
        buttonSignUp.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        buttonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignUp.setText("Sign Up!");
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.addActionListener(this::buttonSignUpActionPerformed);
        panelRegister.add(buttonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 250, 60));

        buttonX.setBackground(new java.awt.Color(0, 102, 255));
        buttonX.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        buttonX.setForeground(new java.awt.Color(255, 255, 255));
        buttonX.setText("X");
        buttonX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonX.addActionListener(this::buttonXActionPerformed);
        panelRegister.add(buttonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 50, 30));

        nameTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        nameTXT.setForeground(new java.awt.Color(102, 102, 102));
        nameTXT.setText("First Name");
        panelRegister.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        lastNameTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        lastNameTXT.setForeground(new java.awt.Color(102, 102, 102));
        lastNameTXT.setText("Last Name");
        panelRegister.add(lastNameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        usernameTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        usernameTXT.setForeground(new java.awt.Color(102, 102, 102));
        usernameTXT.setText("Username");
        panelRegister.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        emailTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        emailTXT.setForeground(new java.awt.Color(102, 102, 102));
        emailTXT.setText("Email");
        panelRegister.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        nameUser.setBackground(new java.awt.Color(229, 229, 229));
        nameUser.setForeground(new java.awt.Color(0, 0, 0));
        nameUser.addActionListener(this::nameUserActionPerformed);
        panelRegister.add(nameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 370, 60));

        lastNameUser.setBackground(new java.awt.Color(229, 229, 229));
        lastNameUser.setForeground(new java.awt.Color(0, 0, 0));
        lastNameUser.addActionListener(this::lastNameUserActionPerformed);
        panelRegister.add(lastNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 370, 60));

        username.setBackground(new java.awt.Color(229, 229, 229));
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.addActionListener(this::usernameActionPerformed);
        panelRegister.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 370, 60));

        email.setBackground(new java.awt.Color(229, 229, 229));
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.addActionListener(this::emailActionPerformed);
        panelRegister.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 370, 60));

        passTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        passTXT.setForeground(new java.awt.Color(102, 102, 102));
        passTXT.setText("Password");
        panelRegister.add(passTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, -1, -1));

        pass.setBackground(new java.awt.Color(229, 229, 229));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        panelRegister.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 370, 60));

        confirmPass.setBackground(new java.awt.Color(229, 229, 229));
        confirmPass.setForeground(new java.awt.Color(0, 0, 0));
        panelRegister.add(confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 370, 60));

        checkBoxShowPassword.setBackground(new java.awt.Color(204, 204, 204));
        checkBoxShowPassword.setForeground(new java.awt.Color(51, 51, 51));
        checkBoxShowPassword.setText("Show password");
        panelRegister.add(checkBoxShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, -1, -1));

        getContentPane().add(panelRegister, "card2");

        pack();
    }

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        if (checkBoxShowPassword.isSelected()) {
            pass.setEchoChar((char) 0);
            confirmPass.setEchoChar((char) 0);
        } else {
            pass.setEchoChar('*');
            confirmPass.setEchoChar('*');
        }
    }

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName = nameUser.getText();
        String lastName = lastNameUser.getText();
        String usernameUser = username.getText();
        String emailUser = email.getText();
        String passUser = pass.getText();
        String confirmPassUser = confirmPass.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || usernameUser.isEmpty() || passUser.isEmpty() || emailUser.isEmpty() || confirmPassUser.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (ValidatorRegister.isValidDate(firstName) ||
                ValidatorRegister.isValidDate(lastName) ||
                ValidatorRegister.isValidDate(usernameUser)) {
            JOptionPane.showMessageDialog(this, "It must be between 2 and 30 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!ValidatorRegister.isValidEmail(emailUser)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ValidatorRegister.isValidPassword(passUser)) {
            JOptionPane.showMessageDialog(this, "The password must be at least 6 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!ValidatorRegister.arePasswordsEqual(passUser, confirmPassUser)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (ValidateUser.userExists(usernameUser) || ValidateUser.emailExists(emailUser)) {
            JOptionPane.showMessageDialog(this, "User already exists. Please choose a different username or email.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        User newUser = new User(firstName, lastName, usernameUser, emailUser, passUser);

        User.insertUser(newUser.toDocument());

        JOptionPane.showMessageDialog(this, "Successfully registered!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }

    private void setupFocusListeners(JTextField textField, JLabel label) {
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                label.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    label.setVisible(true);
                }
            }
        });
    }
    private void buttonXActionPerformed(java.awt.event.ActionEvent evt) {
        Login login = new Login();

        login.setVisible(true);

        this.dispose();
    }

    private void nameUserActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void lastNameUserActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JCheckBox checkBoxShowPassword;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JLabel confirmPassTXT;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailTXT;
    private javax.swing.JLabel lastNameTXT;
    private javax.swing.JTextField lastNameUser;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JTextField nameUser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passTXT;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameTXT;
}
