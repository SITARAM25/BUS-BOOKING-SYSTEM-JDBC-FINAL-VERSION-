package com.bbs.dao;

import java.util.HashMap;

import com.bbs.beans.Bus;

public interface AdminDaoBBS {

	//bus manipulations
	public Boolean createBus(Bus bus);
	public Boolean updateBus(Bus bus);
	public Bus searchBus(int busId);
	public Boolean deletebus(int busId);
	public HashMap<Integer,Bus> busBetween(String source,String destination);

	//admin
	public Boolean adminLogin(Integer adminId, String password);

}
