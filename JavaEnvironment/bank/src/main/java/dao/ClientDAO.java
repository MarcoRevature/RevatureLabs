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
			
			String query = "SELECT * FROM client";
			if(isTitlePresent(title)) {
				query += "where title = ?";
			}
			PreparedStatement pstmt = conn.prepareStatement(query);

			if (isTitlePresent(title)) {
				pstmt.setString(1, title);
			}
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Client c = new Client(rs.getString(1), rs.getString(2));
				clients.add(c);
			}
			
		}catch (SQLException ex) {
			throw ex;
		}

		return clients;
	}
	
}
