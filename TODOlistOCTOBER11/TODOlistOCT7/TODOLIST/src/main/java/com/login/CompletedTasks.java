package com.login;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CompletedTasks extends javax.swing.JFrame {

    public CompletedTasks() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    private void initComponents() {

        javax.swing.JLabel logo = new javax.swing.JLabel();
        javax.swing.JPanel bgSkyBlue = new javax.swing.JPanel();
        com.toedter.calendar.JCalendar calendarMenu = new com.toedter.calendar.JCalendar();
        javax.swing.JButton completedTasks1 = new javax.swing.JButton();
        javax.swing.JLabel focustaskTXT = new javax.swing.JLabel();
        javax.swing.JButton buttonX = new javax.swing.JButton();
        javax.swing.JScrollPane scrollPanel = new javax.swing.JScrollPane();
        javax.swing.JTable tableTaskDescription = new javax.swing.JTable();
        javax.swing.JPanel whitePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPLETED TASKS - FOCUS TASK");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/focuslogo.png"))));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bgSkyBlue.setBackground(new java.awt.Color(0, 102, 255));
        bgSkyBlue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendarMenu.setBackground(new java.awt.Color(0, 153, 204));
        calendarMenu.setBorder(new javax.swing.border.MatteBorder(null));
        calendarMenu.setForeground(new java.awt.Color(0, 102, 255));
        calendarMenu.setDecorationBackgroundColor(new java.awt.Color(204, 204, 204));
        calendarMenu.setWeekdayForeground(new java.awt.Color(0, 153, 0));
        bgSkyBlue.add(calendarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 420, 360));

        completedTasks1.setBackground(new java.awt.Color(0, 102, 255));
        completedTasks1.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        completedTasks1.setForeground(new java.awt.Color(255, 255, 255));
        completedTasks1.setText("COMPLETED TASKS");
        bgSkyBlue.add(completedTasks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 420, 130));

        getContentPane().add(bgSkyBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 750));

        focustaskTXT.setFont(new java.awt.Font("Bebas Neue", Font.BOLD, 36));
        focustaskTXT.setForeground(new java.awt.Color(0, 102, 255));
        focustaskTXT.setText("COMPLETED TASKS");
        getContentPane().add(focustaskTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 230, 60));


        buttonX.setBackground(new java.awt.Color(0, 102, 255));
        buttonX.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        buttonX.setForeground(new java.awt.Color(255, 255, 255));
        buttonX.setText("X");
        buttonX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonX.addActionListener(this::buttonXActionPerformed);
        getContentPane().add(buttonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 50, 30));

        tableTaskDescription.setBackground(new java.awt.Color(102, 153, 255));
        tableTaskDescription.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        tableTaskDescription.setForeground(new java.awt.Color(51, 51, 51));
        tableTaskDescription.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Task", "Description", "Expiration Date", "Category"
                }
        ));
        scrollPanel.setViewportView(tableTaskDescription);

        getContentPane().add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 710, 660));

        whitePanel.setBackground(new java.awt.Color(255, 255, 255));
        whitePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(whitePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 830, 750));

        pack();
    }
    private void tableTaskDescription(java.awt.event.ActionEvent evt) {
    }

    private void buttonXActionPerformed(java.awt.event.ActionEvent evt) {
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }
}
