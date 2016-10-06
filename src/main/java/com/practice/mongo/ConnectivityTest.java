package com.practice.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Created by dmalli on 10/6/2016.
 */
public class ConnectivityTest {

    public static void main(String args[]){
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        MongoClient mongoClient = new MongoClient();
        DB db = mongoClient.getDB("mydb");
        DBCollection table = db.getCollection("user");
        System.out.print(table.toString());

    }
}
