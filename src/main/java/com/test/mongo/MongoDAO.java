package com.test.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.awt.peer.CanvasPeer;
import java.util.Map;


/**
 * Created by Asus55 on 2015/9/5.
 */
@Repository("mongoDAO")
public class MongoDAO {
    /*    private final MongoDbFactory mongo;
        private final DB db;
        @Autowired
        public MongoDAO(MongoDbFactory mongo) {
            this.mongo = mongo;
            this.db = mongo.getDb();
        }*/
    private MongoTemplate mongoTemplate;

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }
    @Resource
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
   /* private MongoTemplate mongoTemplate;

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }
    @Resource
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }*/

    public String test(){
        DBObject obj = new BasicDBObject();
        obj.put("id","88888888 ");
        obj.put("name","q99999q");
        //DBCollection coll = db.getCollection("lms_test");
        //coll.insert(obj);
        mongoTemplate.insert(obj,"lms_test");
        return null;
    }
}