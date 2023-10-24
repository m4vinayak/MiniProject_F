package com.miniproject.interfaces;

import java.sql.Connection;

public interface DatabaseConnectionInterface {  

	public abstract Connection getConnection();
}
