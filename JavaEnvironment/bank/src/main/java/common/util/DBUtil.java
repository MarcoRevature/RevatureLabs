package common.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBUtil {
	
	private static final Logger logger = LogManager.getLogger(DBUtil.class);
	
	private static DBUtil _instance;
	private Connection conn = null;
	
	private DBUtil() {
		
	}
	
	public static DBUtil getInstance() {
		if(_instance == null) {
			_instance = new DBUtil();
		}
		return _instance;
	}
	
	public Connection getConnection() throws Exception {
		if(this.conn == null) {
			this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","XJ0EDB");
		}
		return this.conn;
	}

}
