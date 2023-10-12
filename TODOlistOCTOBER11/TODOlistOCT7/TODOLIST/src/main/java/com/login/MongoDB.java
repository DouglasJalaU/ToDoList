package com.login;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDB {

    private static final String CONNECTION_STRING = "mongodb+srv://abigailmelisasuarez:army2314@cluster0abby.122jzgu.mongodb.net/?retryWrites=true&w=majority";
    private static final String DATABASE_NAME = "ToDoList";

    private static MongoDatabase database;

    public static void connectToDatabase() {
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            FileHandler fileHandler = new FileHandler("mongodb.log");
            mongoLogger.addHandler(fileHandler);
            mongoLogger.setUseParentHandlers(false);
            fileHandler.setLevel(Level.INFO);
            MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
            database = mongoClient.getDatabase(DATABASE_NAME);
            System.out.println("Connected to database: " + DATABASE_NAME);
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }
    public static MongoDatabase getDatabase() {
        return database;
    }

}
