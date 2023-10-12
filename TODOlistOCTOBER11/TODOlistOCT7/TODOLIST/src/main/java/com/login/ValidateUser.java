package com.login;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import static com.login.MongoDB.getDatabase;

public class ValidateUser {
    public static boolean userExists(String username) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> usersCollection = database.getCollection("User");

        Document existingUser = usersCollection.find(Filters.eq("Username", username)).first();

        return existingUser != null;
    }
    public static boolean validateUser(String username, String password) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> usersCollection = database.getCollection("User");

        Document existingUser = usersCollection.find(Filters.eq("Username", username)).first();

        return existingUser != null && existingUser.getString("Password").equals(password);
    }
    public static boolean emailExists(String email) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> usersCollection = database.getCollection("User");

        Document existingUser = usersCollection.find(Filters.eq("Email", email)).first();

        return existingUser != null;
    }
}
