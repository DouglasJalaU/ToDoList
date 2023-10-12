package com.login;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.login.MongoDB.getDatabase;
public class Category {
    public static String nameCategory;
    public static String idTask;

    public Category(String nameCategory, String idTask) {
        this.nameCategory = nameCategory;
        this.idTask = idTask;
    }

    public Document toDocument() {
        return new Document("NameCategory", nameCategory)
                .append("Id_Task: ", idTask);
    }
    public static void insertCategory(Document categoryDocument) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> categoryCollection = database.getCollection("Category");
        categoryCollection.insertOne(categoryDocument);
    }
}