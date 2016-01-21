package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Component
public class CollectionUtil {
	@Autowired
	private MongoTemplate mt;
	
	private DBCollection collection;
	
	public DBCollection getCollection() {
		return collection;
	}

	public void setCollection(String collectionName) {
		this.collection = mt.getCollection(collectionName);
	}
	
	
}
