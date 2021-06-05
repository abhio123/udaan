package com.abhio.springApp.rest;

import java.util.List;

import com.abhio.springApp.QuestionObject;

public class QuestionRequest {

	public QuestionRequest() {
		// TODO Auto-generated constructor stub
	}
	private String question;
	private Integer questionId;
	private List<String> options;
	private String correctOption;
	
	

	public QuestionRequest(String question, Integer questionId, List<String> options, String correctOption) {
		super();
		this.question = question;
		this.questionId = questionId;
		this.options = options;
		this.correctOption = correctOption;
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

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

}
