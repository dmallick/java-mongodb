package com.practice.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class DeleteOperation {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");

        DBObject dbObject = table.findOne();
        table.remove(dbObject);
        System.out.println(dbObject);
    }

}
