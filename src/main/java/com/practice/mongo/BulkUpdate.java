package com.practice.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class BulkUpdate {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");


        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", "Graphx");

        BasicDBObject searchQuery = new BasicDBObject().append("name", "MongoDB");

        table.update(searchQuery, newDocument);
    }

}
