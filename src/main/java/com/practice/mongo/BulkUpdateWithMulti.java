package com.practice.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class BulkUpdateWithMulti {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mydb");
        DBCollection collection = db.getCollection("user");

        BasicDBObject searchQuery = new BasicDBObject().append("name", "MongoDB");
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.append("multi", new BasicDBObject().append("count", 20));
        collection.update(searchQuery, newDocument);

        //System.out.println(collection.find(new BasicDBObject().append("name", "MongoDB")));
    }

}
