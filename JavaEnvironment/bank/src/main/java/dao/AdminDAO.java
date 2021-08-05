package dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.pojo.*;

public interface AdminDAO {
	
	Connection connect() throws FileNotFoundException;
	
	public Admin getAdmin(Admin admin) throws SQLException;
}
