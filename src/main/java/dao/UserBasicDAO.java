package dao;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class UserBasicDAO extends BasicDAO{
	
	@PostConstruct
	public void init(){
		util.setCollection("userBasic");
		collection = util.getCollection();
	}

	public void insert(String userName,String userPassword,String userMail,String userType,String accountId,
			String isValid,Map userDetail){
			DBObject object = new BasicDBObject();
			
			object.put("userName", userName);
			object.put("userPassword", userPassword);
			object.put("userMail", userMail);
			object.put("userType", userType);
			object.put("userRegTime", new Date());
			object.put("accountId", accountId);
			object.put("isValid", isValid);
			
			Set<String> keySet = userDetail.keySet();
			for(String key: keySet){
				object.put(key, userDetail.get(key));
			}
			
			collection.insert(object);
	}

}
