package dao;

import javax.annotation.PostConstruct;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class PostBasicDAO extends BasicDAO{
	
	@PostConstruct
	public void init(){
		util.setCollection("postBasic");
		collection = util.getCollection();
	}
	
	public void insert(String postName,String userId,String character,String accountId){
		DBObject object = new BasicDBObject();
		object.put("postName", postName);
		object.put("userId", userId);
		object.put("character", character);
		object.put("accountId", accountId);
		
		collection.insert(object);
	}

}
