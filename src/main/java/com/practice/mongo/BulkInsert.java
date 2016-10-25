package com.practice.mongo;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class BulkInsert {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");

    }
}
