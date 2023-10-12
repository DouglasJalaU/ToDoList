package com.login;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.login.MongoDB.getDatabase;

public class Task {
    public static String expDate;
    public static String title;
    public static String description;
    public static String status;
    public static String userId;

    public Task(String expDate, String title, String description, String userId) {
        this.expDate = expDate;
        this.title = title;
        this.description = description;
        this.status = "False";
        this.userId = userId;
    }

    public Document toDocument() {
        return new Document("Date", expDate)
                .append("Title", title)
                .append("Description", description)
                .append("Status", status)
                .append("User_Id: " , userId);
    }
    public static void insertTask(Document taskDocument) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> tasksCollection = database.getCollection("Task");
        tasksCollection.insertOne(taskDocument);
    }
}