package dao;

import javax.annotation.PostConstruct;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class QuestionnaireMissonDAO extends BasicDAO{
	@PostConstruct
	public void init(){
		util.setCollection("questionnireMission");
		collection = util.getCollection();
	}
	
	public void insert(String createId,String designId,String verifyId,
			String testId,String publishId,String analyzeId,String qnaireId){
		DBObject object = new BasicDBObject();
		object.put("createId", createId);
		object.put("designId", designId);
		object.put("verifyId", verifyId);
		object.put("testId", testId);
		object.put("publishId", publishId);
		object.put("analyzeId", analyzeId);
		object.put("qnaireId", qnaireId);
		
		collection.insert(object);
		
		
	}

}
