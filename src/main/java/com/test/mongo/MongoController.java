package com.test.mongo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Asus55 on 2015/9/5.
 */

@Controller()
public class MongoController {
    private MongoDAO mongoDAO;

    public MongoDAO getMongoDAO() {
        return mongoDAO;
    }
    @Resource
    public void setMongoDAO(MongoDAO mongoDAO) {
        this.mongoDAO = mongoDAO;
    }

    @RequestMapping(value="/test",method= RequestMethod.POST)
    public void Test(){
        mongoDAO.test();
    }
}