package com.login;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.login.MongoDB.getDatabase;

public class User {
    public static String name;
    public static String lastName;
    public static String username;
    public static String email;
    public static String password;

    public User(String name, String lastName, String username, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Document toDocument() {
        return new Document("Name", name)
                .append("LastName", lastName)
                .append("Username", username)
                .append("Email", email)
                .append("Password", password);
    }
    public static void insertUser(Document userDocument) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> usersCollection = database.getCollection("User");
        usersCollection.insertOne(userDocument);
    }
}
