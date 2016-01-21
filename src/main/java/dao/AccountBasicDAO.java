package dao;


import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Component
public class AccountBasicDAO extends BasicDAO{

	@PostConstruct
	public void init(){
		util.setCollection("accountBasic");
		collection = util.getCollection();
	}
	
	public void insert(String accountName,String managerName,String secondLevelDomain,String verifyId,String isValid){
		DBObject object = new BasicDBObject();
		object.put("accountName", accountName);
		object.put("managerName", managerName);
		object.put("secondLevelDomain",secondLevelDomain);
		object.put("AccountRegTime",new Date().toString());
		object.put("verifyId", verifyId);
		object.put("isValid", isValid);
	}
	
	
	
	
	
	
}
