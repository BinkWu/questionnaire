package dao;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public abstract class BasicDAO implements DAOInterface{
	@Autowired
	protected CollectionUtil util;
	
	protected DBCollection collection;
	
	public DBObject findByKey(String key,String value){
		DBObject object = new BasicDBObject();
		object.put(key, value);
		
		return collection.findOne(object);
	}
	
	
	
	public DBObject findOne(DBObject object){
		return collection.findOne(object);
	}
	
	public DBCursor find(DBObject object){
		return collection.find(object);
	}
	
	
	
	public void deleteByKey(String key,String value){
		DBObject o = new BasicDBObject();
		o.put(key, value);
		collection.remove(o);
	}
	
	public void updateByKey(String key,String value,DBObject update){
		DBObject o = new BasicDBObject();
		o.put(key, value);
		collection.update(o, update);
	}
}
