package com.practice.mongo;

import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class FindInBulk {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");

        Cursor cursor = table.find();

        while (cursor.hasNext())
            System.out.println(cursor.next());


    }
}
