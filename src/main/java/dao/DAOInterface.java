package dao;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public interface DAOInterface {
	public DBObject findByKey(String key,String value);
	
	public DBObject findOne(DBObject object);
	
	public DBCursor find(DBObject object);
	
	public void deleteByKey(String key,String value);
	
	public void updateByKey(String key,String value,DBObject update);
}
