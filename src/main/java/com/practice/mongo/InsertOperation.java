package com.practice.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class InsertOperation {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");

        BasicDBObject doc = new BasicDBObject("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("info", new BasicDBObject("x", 203).append("y", 101));

        table.insert(doc);

        System.out.println(table.findOne());
    }
}
