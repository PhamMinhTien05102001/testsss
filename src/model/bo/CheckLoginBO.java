package model.bo;

import java.util.ArrayList;

import model.bean.Wife;
import model.dao.CheckLoginDAO;

public class CheckLoginBO {
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
	
	public boolean isValidUser(String user, String pass)
	{
		return checkLoginDAO.isValidUser(user, pass);
	}
	
	public ArrayList<Wife> GetListWife(String username){
		return checkLoginDAO.GetListWife(username);
	}
}
