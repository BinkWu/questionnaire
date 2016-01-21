package dao;

import javax.annotation.PostConstruct;

public class QuestionnaireBasicDAO extends BasicDAO{
	
	@PostConstruct
	public void init(){
		util.setCollection("questionnaireBasic");
		collection = util.getCollection();
	}
	
	public void insert(String qnaireTitle,String userBasicId,String accountId,
			String postId){
		
	}
}
