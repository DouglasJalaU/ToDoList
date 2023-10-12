package com.login;

import com.mongodb.client.MongoDatabase;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.bson.Document;
import org.bson.types.ObjectId;
import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoCollection;

import static com.login.MongoDB.getDatabase;


public class Menu extends javax.swing.JFrame {
    public String expDTask, descTask, titTask, sttsTask, catTask, userId, taskId;
    public JDateChooser dateChooser;
    public static Login login;
    public static Task task;
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void initComponents() {
        dateChooser = new JDateChooser();
        expDateTask = new JTextField();
        expDateTaskTXT = new JLabel();
        titleTask = new JTextField();
        titleTaskTXT = new JLabel();
        descriptionTask = new JTextField();
        descriptionTaskTXT = new JLabel();
        statusTask = new JTextField();
        statusTaskTXT = new JLabel();
        categoryTask = new JTextField();
        categoryTXT = new JLabel();

        javax.swing.JPanel backgroundWhite = new javax.swing.JPanel();
        javax.swing.JButton buttonBackMenu = new javax.swing.JButton();
        javax.swing.JLabel logo = new javax.swing.JLabel();
        javax.swing.JButton buttonAdd = new javax.swing.JButton();
        javax.swing.JButton buttonCompleted = new javax.swing.JButton();
        javax.swing.JPanel bgSkyBlue = new javax.swing.JPanel();
        com.toedter.calendar.JCalendar calendarMenu = new com.toedter.calendar.JCalendar();
        javax.swing.JButton completedTasks = new javax.swing.JButton();
        javax.swing.JButton buttonDelete = new javax.swing.JButton();
        javax.swing.JScrollPane scrollPanel = new javax.swing.JScrollPane();
        javax.swing.JTable tableTaskDescription = new javax.swing.JTable();
        javax.swing.JButton buttonEdit = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU - FOCUS TASK");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundWhite.setBackground(new java.awt.Color(255, 255, 255));
        backgroundWhite.setForeground(new java.awt.Color(153, 153, 153));
        backgroundWhite.setPreferredSize(new java.awt.Dimension(1250, 750));
        backgroundWhite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonBackMenu.setBackground(new java.awt.Color(255, 255, 255));
        buttonBackMenu.setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
        buttonBackMenu.setForeground(new java.awt.Color(0, 102, 255));
        buttonBackMenu.setText("Sign Off");
        buttonBackMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBackMenu.addActionListener(this::buttonBackMenuActionPerformed);
        backgroundWhite.add(buttonBackMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 100, 30));

        logo.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/focuslogo.png"))));
        backgroundWhite.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        descriptionTask.setBackground(new java.awt.Color(229, 229, 229));
        descriptionTask.setForeground(new java.awt.Color(0, 0, 0));
        descriptionTask.addActionListener(this::descriptionTaskActionPerformed);
        backgroundWhite.add(descriptionTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 580, 40));

        buttonAdd.setBackground(new java.awt.Color(0, 153, 102));
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setText("Add");
        buttonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        backgroundWhite.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 90, 100, 40));

        buttonCompleted.setBackground(new java.awt.Color(0, 102, 255));
        buttonCompleted.setForeground(new java.awt.Color(255, 255, 255));
        buttonCompleted.setText("Completed!");
        buttonCompleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCompleted.addActionListener(this::buttonCompletedActionPerformed);
        backgroundWhite.add(buttonCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 700, 100, 40));

        bgSkyBlue.setBackground(new java.awt.Color(0, 102, 255));
        bgSkyBlue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendarMenu.setBackground(new java.awt.Color(0, 153, 204));
        calendarMenu.setBorder(new javax.swing.border.MatteBorder(null));
        calendarMenu.setForeground(new java.awt.Color(0, 102, 255));
        calendarMenu.setDecorationBackgroundColor(new java.awt.Color(204, 204, 204));
        calendarMenu.setWeekdayForeground(new java.awt.Color(0, 153, 0));
        bgSkyBlue.add(calendarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 420, 360));

        completedTasks.setBackground(new java.awt.Color(0, 102, 255));
        completedTasks.setFont(new java.awt.Font("Dialog", Font.BOLD, 18));
        completedTasks.setForeground(new java.awt.Color(255, 255, 255));
        completedTasks.setText("COMPLETED TASKS");
        completedTasks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        completedTasks.addActionListener(this::completedTasksActionPerformed);
        bgSkyBlue.add(completedTasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 420, 130));

        backgroundWhite.add(bgSkyBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 750));

        descriptionTaskTXT.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        descriptionTaskTXT.setForeground(new java.awt.Color(0, 0, 0));
        descriptionTaskTXT.setText("DESCRIPTION");
        backgroundWhite.add(descriptionTaskTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        titleTask.setBackground(new java.awt.Color(229, 229, 229));
        titleTask.setForeground(new java.awt.Color(0, 0, 0));
        titleTask.addActionListener(this::taskActionPerformed);
        backgroundWhite.add(titleTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 580, 40));

        expDateTaskTXT.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        expDateTaskTXT.setForeground(new java.awt.Color(0, 0, 0));
        expDateTaskTXT.setText("EXPIRATION DATE");
        backgroundWhite.add(expDateTaskTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        categoryTask = new JTextField();
        categoryTask.setBackground(new java.awt.Color(229, 229, 229));
        categoryTask.setForeground(new java.awt.Color(0, 0, 0));
        backgroundWhite.add(categoryTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 190, 40));


        titleTaskTXT.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        titleTaskTXT.setForeground(new java.awt.Color(0, 0, 0));
        titleTaskTXT.setText("TASK");
        backgroundWhite.add(titleTaskTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Delete");
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.addActionListener(this::buttonDeleteActionPerformed);
        backgroundWhite.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, 100, 40));

        tableTaskDescription.setBackground(new java.awt.Color(102, 153, 255));
        tableTaskDescription.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        tableTaskDescription.setForeground(new java.awt.Color(51, 51, 51));
        tableTaskDescription.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                         "Task", "Description","Expiration Date","Category"
                }
        ));
        tableTaskDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTaskDescription(evt);
            }
        });
        scrollPanel.setViewportView(tableTaskDescription);

        backgroundWhite.add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 710, 510));

        buttonEdit.setBackground(new java.awt.Color(51, 153, 255));
        buttonEdit.setForeground(new java.awt.Color(255, 255, 255));
        buttonEdit.setText("Edit");
        buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEdit.addActionListener(this::buttonEditActionPerformed);
        backgroundWhite.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 290, 100, 40));

        dateChooser.setBackground(new java.awt.Color(229, 229, 229));
        backgroundWhite.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 190, 40));

        categoryTXT.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        categoryTXT.setForeground(new java.awt.Color(0, 0, 0));
        categoryTXT.setText("CATEGORY");
        backgroundWhite.add(categoryTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));


        getContentPane().add(backgroundWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }
    private void tableTaskDescription(java.awt.event.MouseEvent evt) {

    }
    private void buttonBackMenuActionPerformed(java.awt.event.ActionEvent evt) {
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }


    private void buttonCompletedActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void descriptionTaskActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void taskActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void completedTasksActionPerformed(java.awt.event.ActionEvent evt) {
        CompletedTasks completedTasks = new CompletedTasks();
        completedTasks.setVisible(true);
        this.dispose();
    }
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {
        MongoDatabase database = getDatabase();

        Date selectedDate = dateChooser.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        expirationDate = dateFormat.format(selectedDate);

        MongoCollection<Document> taskCollection = database.getCollection("User");
        Document myUser = taskCollection.find(Filters.and(
                Filters.eq("Username", login.usernameLogin),
                Filters.eq("Password", login.passLogin)
        )).first();

        ObjectId user = myUser.getObjectId("_id");

        expDTask = expirationDate;
        catTask = categoryTask.getText();
        descTask = descriptionTask.getText();
        titTask = titleTask.getText();
        sttsTask = statusTask.getText();
        userId = user.toString();

        Task newTask = new Task(expDTask, titTask, descTask, userId);
        Task.insertTask(newTask.toDocument());

        {
            MongoCollection<Document> categoryCollection = database.getCollection("Task");
            Document myTask = categoryCollection.find(Filters.and(
                    Filters.eq("Title", task.title),
                    Filters.eq("Description", task.description)
            )).first();
            assert myTask != null;
            ObjectId task = myTask.getObjectId("_id");
            taskId = task.toString();
            if (catTask.isEmpty()) {
                catTask = "Otros";
            }
            Category newCategory = new Category(catTask, taskId);
            Category.insertCategory(newCategory.toDocument());
        }
    }
    private JTextField expDateTask;
    private javax.swing.JLabel expDateTaskTXT;
    private JTextField descriptionTask;
    private javax.swing.JLabel descriptionTaskTXT;
    private JTextField titleTask;
    private javax.swing.JLabel titleTaskTXT;
    private JTextField statusTask;
    private javax.swing.JLabel statusTaskTXT;
    private String expirationDate;
    private JTextField categoryTask;
    private javax.swing.JLabel categoryTXT;
}