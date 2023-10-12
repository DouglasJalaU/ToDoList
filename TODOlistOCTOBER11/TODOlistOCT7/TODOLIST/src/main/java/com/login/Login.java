package com.login;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Objects;
import javax.swing.*;


public class Login extends javax.swing.JFrame {

    private javax.swing.JLabel forgotPassTXT;
    private javax.swing.JPasswordField introPassLogin;
    private javax.swing.JLabel introPassTXT;
    private javax.swing.JTextField introUsername;
    private javax.swing.JLabel introUsernameTXT;
    public static String usernameLogin, passLogin;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        introUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                introUsernameTXT.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (introUsername.getText().isEmpty()) {
                    introUsernameTXT.setVisible(true);
                }
            }
        });
        introPassLogin.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                introPassTXT.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (introPassLogin.getText().isEmpty()) {
                    introPassTXT.setVisible(true);
                }
            }
        });
        forgotPassTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassMouseClicked();
            }
        });
    }

    private void initComponents() {
        JPanel backgroundWhite = new JPanel();
        javax.swing.JPanel backgroundLeftSkyBlue = new javax.swing.JPanel();
        javax.swing.JPanel extraSkyBlue = new javax.swing.JPanel();
        javax.swing.JPanel extraSkyBlue1 = new javax.swing.JPanel();
        javax.swing.JLabel listImg = new javax.swing.JLabel();
        javax.swing.JLabel welcomeTxt = new javax.swing.JLabel();
        javax.swing.JLabel nameFocusTask = new javax.swing.JLabel();
        javax.swing.JLabel logoLogin = new javax.swing.JLabel();
        javax.swing.JLabel welcomeDownTxt = new javax.swing.JLabel();
        introUsernameTXT = new javax.swing.JLabel();
        introPassTXT = new javax.swing.JLabel();
        javax.swing.JLabel loginTxr = new javax.swing.JLabel();
        javax.swing.JLabel iconPadlock = new javax.swing.JLabel();
        javax.swing.JLabel iconUser = new javax.swing.JLabel();
        introUsername = new javax.swing.JTextField();
        javax.swing.JButton buttonLogin = new javax.swing.JButton();
        javax.swing.JButton buttonNewAccount = new javax.swing.JButton();
        javax.swing.JLabel questionTxt = new javax.swing.JLabel();
        javax.swing.JCheckBox checkBoxRemember = new javax.swing.JCheckBox();
        introPassLogin = new javax.swing.JPasswordField();
        forgotPassTXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN - FOCUS TASK");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundWhite.setBackground(new java.awt.Color(255, 255, 255));
        backgroundWhite.setPreferredSize(new java.awt.Dimension(1250, 750));
        backgroundWhite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundLeftSkyBlue.setBackground(new java.awt.Color(0, 102, 255));
        backgroundLeftSkyBlue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extraSkyBlue.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout extraSkyBlueLayout = new javax.swing.GroupLayout(extraSkyBlue);
        extraSkyBlue.setLayout(extraSkyBlueLayout);
        extraSkyBlueLayout.setHorizontalGroup(
                extraSkyBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        extraSkyBlueLayout.setVerticalGroup(
                extraSkyBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 110, Short.MAX_VALUE)
        );

        backgroundLeftSkyBlue.add(extraSkyBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 200, 110));

        extraSkyBlue1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout extraSkyBlue1Layout = new javax.swing.GroupLayout(extraSkyBlue1);
        extraSkyBlue1.setLayout(extraSkyBlue1Layout);
        extraSkyBlue1Layout.setHorizontalGroup(
                extraSkyBlue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );
        extraSkyBlue1Layout.setVerticalGroup(
                extraSkyBlue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        backgroundLeftSkyBlue.add(extraSkyBlue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 50, 50));

        listImg.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/ToDoList.png"))));
        listImg.setText("jLabel1");
        backgroundLeftSkyBlue.add(listImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 570, 390));

        welcomeTxt.setFont(new java.awt.Font("Dialog", Font.PLAIN, 48));
        welcomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        welcomeTxt.setText("Welcome!");
        backgroundLeftSkyBlue.add(welcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 320, 40));

        nameFocusTask.setFont(new java.awt.Font("Bebas Neue", Font.BOLD, 36));
        nameFocusTask.setForeground(new java.awt.Color(255, 255, 255));
        nameFocusTask.setText("FOCUS Task");
        backgroundLeftSkyBlue.add(nameFocusTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, 60));

        logoLogin.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/focuslogo.png")))); // NOI18N
        backgroundLeftSkyBlue.add(logoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        welcomeDownTxt.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        welcomeDownTxt.setForeground(new java.awt.Color(255, 255, 255));
        welcomeDownTxt.setText("Where you organize tasks with precision and achieve your goals.");
        welcomeDownTxt.setPreferredSize(new java.awt.Dimension(460, 17));
        backgroundLeftSkyBlue.add(welcomeDownTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, 20));

        backgroundWhite.add(backgroundLeftSkyBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 750));

        introUsernameTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        introUsernameTXT.setForeground(new java.awt.Color(102, 102, 102));
        introUsernameTXT.setText("Introduce your username");
        backgroundWhite.add(introUsernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        introPassTXT.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        introPassTXT.setForeground(new java.awt.Color(102, 102, 102));
        introPassTXT.setText("Introduce your password");
        backgroundWhite.add(introPassTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        loginTxr.setFont(new java.awt.Font("Dialog", Font.PLAIN, 36));
        loginTxr.setForeground(new java.awt.Color(0, 102, 255));
        loginTxr.setText("Log In");
        backgroundWhite.add(loginTxr, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, -1, -1));

        iconPadlock.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/padlock.png"))));
        backgroundWhite.add(iconPadlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 40, 40));


        iconUser.setForeground(new java.awt.Color(102, 102, 102));
        iconUser.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/userlogo (1).png"))));
        backgroundWhite.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 240, 40, 40));

        introUsername.setBackground(new java.awt.Color(229, 229, 229));
        introUsername.setForeground(new java.awt.Color(0, 0, 0));
        introUsername.addActionListener(this::introUsernameActionPerformed);
        backgroundWhite.add(introUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 370, 60));

        buttonLogin.setBackground(new java.awt.Color(0, 102, 255));
        buttonLogin.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Log In");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addActionListener(evt -> buttonLoginActionPerformed());
        backgroundWhite.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 370, 60));

        buttonNewAccount.setBackground(new java.awt.Color(255, 153, 51));
        buttonNewAccount.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        buttonNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewAccount.setText("Create New Account");
        buttonNewAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNewAccount.addActionListener(evt -> buttonNewAccountActionPerformed());
        backgroundWhite.add(buttonNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 250, 60));

        questionTxt.setBackground(new java.awt.Color(102, 102, 102));
        questionTxt.setForeground(new java.awt.Color(102, 102, 102));
        questionTxt.setText("Don't have an account?");
        backgroundWhite.add(questionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, -1, -1));

        checkBoxRemember.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxRemember.setForeground(new java.awt.Color(102, 102, 102));
        checkBoxRemember.setText("Remember me!");
        backgroundWhite.add(checkBoxRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, -1, -1));

        introPassLogin.setBackground(new java.awt.Color(229, 229, 229));
        introPassLogin.setForeground(new java.awt.Color(0, 0, 0));
        backgroundWhite.add(introPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 370, 60));

        forgotPassTXT.setBackground(new java.awt.Color(102, 102, 102));
        forgotPassTXT.setForeground(new java.awt.Color(102, 102, 102));
        forgotPassTXT.setText("Forgot password?");
        forgotPassTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundWhite.add(forgotPassTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, -1, 20));

        getContentPane().add(backgroundWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        pack();
    }
    private void buttonNewAccountActionPerformed() {

        Register register = new Register();

        register.setVisible(true);

        this.dispose();
    }
    private void buttonLoginActionPerformed() {
        usernameLogin = introUsername.getText();
        passLogin = new String(introPassLogin.getPassword());

        if (usernameLogin.isEmpty() || passLogin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean userExists = ValidateUser.userExists(usernameLogin);

        if (userExists) {
            if (ValidateUser.validateUser(usernameLogin, passLogin)) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "User not registered", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getLoginInfo(){
        return usernameLogin;
    }
    private void introUsernameActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void forgotPassMouseClicked() {

        String usernameLogin = introUsername.getText();
        String passLogin = introPassLogin.getText();

        if (!usernameLogin.isEmpty() && !passLogin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "A recovery email has been sent to your email address.", "Success", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter your username and password first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
