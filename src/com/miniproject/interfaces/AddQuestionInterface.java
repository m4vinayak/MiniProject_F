package com.miniproject.interfaces;

import java.sql.SQLException;

public interface AddQuestionInterface {
	
	public abstract void addQuestion(String question, String option_1, String option_2, String option_3, String option_4, String answers) throws SQLException;

}
