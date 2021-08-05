package dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

import common.pojo.Account;
import common.pojo.Client;

public interface AccountDAO {
	
	public Connection connect() throws FileNotFoundException;
	
	public void addBalance(Client client, Account acc, double deposit ) throws SQLException, FileNotFoundException;
	
	public void removeBalance(Client client, Account acc, double withdraw ) throws SQLException;
	
}