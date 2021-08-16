package dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import common.pojo.Client;
import common.util.DBUtil;

public class ClientDAO {
	
	static final Logger logger = LogManager.getLogger(ClientDAO.class);
	
	public List<Client> findAcc() throws Exception{
		return findAcc(null);
	}
	
	private boolean isTitlePresent(String title) {
		return title != null && !title.isEmpty();
	}
	
	public List<Client> findAcc(String title) throws Exception{
		List<Client> clients = new ArrayList<Client>();
		
		try {
			Connection conn = DBUtil.getInstance().getConnection();
			
			String query = "SELECT * FROM employee";
			if(isTitlePresent(title)) {
				query += " WHERE title = ?";
			}
			
			PreparedStatement psmt = conn.prepareStatement(query);
			
			if(isTitlePresent(title)) {
				psmt.setString(1,title);
			}
			
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Client p = new Client(rs.getString(2), rs.getString(3));
				clients.add(p);
			}
			
		}catch(SQLException ex) {
			throw ex;
		}
		return clients;
	}
	
	public int save(Client c) throws Exception{
		Connection conn = DBUtil.getInstance().getConnection();
		
		PreparedStatement psmt = conn.prepareStatement("Insert into employee (name, pass) values (?,?)");
		
		psmt.setInt(1, c.getId());
		psmt.setString(2, c.getname());
		psmt.setString(3, c.getpass());
		
		int inserted = psmt.executeUpdate();
		
		return inserted;
	}
	
}
