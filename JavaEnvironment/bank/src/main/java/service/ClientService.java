package service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import common.pojo.*;
import dao.ClientDAO;

public class ClientService {
	
	private static final Logger logger = LogManager.getLogger(ClientService.class);
	
	private ClientDAO dao = new ClientDAO();
	
	public List<Client> findAcc() throws Exception{
		return dao.findAcc();
	}
	
	public List<Client> findAcc(String title) throws Exception{
		if(title == null|| title.isEmpty()) {
			throw new IllegalArgumentException("Enter Valid Title");
		}
		return dao.findAcc(title);
	}
}
