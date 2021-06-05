package com.abhio.springApp.rest;

import java.util.List;

import com.abhio.springApp.QuestionObject;

public class QuizRequest {

	public QuizRequest() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer quizId;
	private String quizName;
	private List<Integer> questionIds; 
	
	public Integer getQuizId() {
		return quizId;
	}
	public void setQuizId(Integer quizId) {
		this.quizId = quizId;
	}

	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	public List<Integer> getQuestionIds() {
		return questionIds;
	}
	public void setQuestionIds(List<Integer> questionIds) {
		this.questionIds = questionIds;
	}

}
