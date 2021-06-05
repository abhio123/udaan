package com.abhio.springApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhio.springApp.rest.QuestionRequest;
import com.abhio.springApp.rest.QuizRequest;

@RestController
public class Welcome {

	public Welcome() {
		// TODO Auto-generated constructor stub
	}
	
//	@GetMapping("/hello/{var}")
//	public ReturnObject hello(@PathVariable String var) {
//		return new ReturnObject(var, 90);
//	}
//	
//	@PostMapping("/post")
//	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
//	public @ResponseBody ReturnObject post(@RequestBody ReturnObject body) {
//		return new ReturnObject("dfds", 90);
//	}
	
	public Map<Integer,QuestionObject> questionObjVsQuestionIdMap = new HashMap<Integer,QuestionObject>();
	public Map<Integer,QuizObject> quizObjVsquizIdMap = new HashMap<Integer,QuizObject>();
	
	//@PostMapping("/createQuestion")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", value = "/createQuestion")
	public @ResponseBody QuestionObject createQuestion(@RequestBody QuestionRequest question) {

		QuestionObject questionQbj = new QuestionObject(question);
		questionObjVsQuestionIdMap.put(questionQbj.getQuestionId(), questionQbj);
		
		return questionQbj;
	}
	
	//@PostMapping("/createQuiz")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", value = "/createQuize")
	public @ResponseBody QuizObject createQuiz(@RequestBody QuizRequest quizObj) {
		List<QuestionObject> questionList = new ArrayList<QuestionObject>();
 		for(Integer queId : quizObj.getQuestionIds()) {
 			questionList.add(questionObjVsQuestionIdMap.get(queId));
		}
		QuizObject quizObject = new QuizObject(questionList,quizObj.getQuizId(),quizObj.getQuizName());
		quizObjVsquizIdMap.put(quizObject.getQuizId(), quizObject);
		
		return quizObject;
	}
	
	@GetMapping("/getQuiz/{quizId}")
	public  @ResponseBody QuizObject getQuiz(@PathVariable Integer quizId) {
		if(quizObjVsquizIdMap.containsKey(quizId)) {
			return quizObjVsquizIdMap.get(quizId);
		}
		return null;
	}
	

}
