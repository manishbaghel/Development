package com.learn.mongod;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

/**
 * Created by manish on 5/23/17.
 */
public class FirstMongoConn {

    static MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    static MongoDatabase database = mongoClient.getDatabase("mydb");
    static MongoCollection<Document> collection = database.getCollection("test");

    public static void main(String[] args){
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
//                .append("info", new Document("x", 203).append("y", 102));
//
//        collection.insertOne(doc);

        System.out.println(collection.count());

/*        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }*/

        FindIterable<Document> x = collection.find(new Document("name", "MongoDB"));
        System.out.println(x.first());



    }


}
