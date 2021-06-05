package com.abhio.springApp;

import java.util.List;

public class QuestionWithQuiz {

	public QuestionWithQuiz() {
		// TODO Auto-generated constructor stub
	}
	
	private String question;
	private Integer questionId;
	private List<String> options;
	
	
	public QuestionWithQuiz(QuestionObject questionObj) {
		this.options = questionObj.getOptions();
		this.questionId = questionObj.getQuestionId();
		this.question = questionObj.getQuestion();
	}
	
	public QuestionWithQuiz(String question, Integer questionId, List<String> options) {
		super();
		this.question = question;
		this.questionId = questionId;
		this.options = options;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	

}
