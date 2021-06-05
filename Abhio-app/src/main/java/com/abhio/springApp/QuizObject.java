package com.abhio.springApp;

import java.util.ArrayList;
import java.util.List;

import com.abhio.springApp.rest.QuizRequest;

public class QuizObject {

	public QuizObject() {
		// TODO Auto-generated constructor stub
	}




	public QuizObject(List<QuestionObject> questionList, Integer quizId2, String quizName) {
		List<QuestionWithQuiz> listQuestionWithQuiz = new ArrayList<>();
		for(QuestionObject queOjb : questionList) {
			listQuestionWithQuiz.add(new QuestionWithQuiz(queOjb));
		}
		this.questions = listQuestionWithQuiz;
		this.quizeName = quizName;
		this.quizId = quizId2;
	}



	private Integer quizId;
	private List<QuestionWithQuiz> questions;
	private String quizeName;
	
	public Integer getQuizId() {
		return quizId;
	}
	public void setQuizId(Integer quizId) {
		this.quizId = quizId;
	}
	public List<QuestionWithQuiz> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionWithQuiz> questions) {
		this.questions = questions;
	}



	public String getQuizeName() {
		return quizeName;
	}



	public void setQuizeName(String quizeName) {
		this.quizeName = quizeName;
	}
	
	

}
