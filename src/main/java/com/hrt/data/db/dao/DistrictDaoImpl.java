/**
 * 
 */
package com.hrt.data.db.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hrt.data.db.beans.District;

/**
 * @author jdhatton
 *
 */
@Component
public class DistrictDaoImpl extends DAO implements DistrictDao {

 
	public DistrictDaoImpl() {
		 
	}

 
	public List<District> findAll() {
		Districts dao = DAO.getDBI().onDemand(Districts.class);
		return dao.findAll();
	}

 
	public District findById(long Id) {
		Districts dao = DAO.getDBI().onDemand(Districts.class);
		return dao.findById(Id);
	}

 
	public void addDistrict(District district) {
		Districts dao = DAO.getDBI().onDemand(Districts.class);
		dao.insert(district);
	}

 
	public void updateDistrict(District district) {
//		Districts dao = DAO.getDBI().onDemand(Districts.class);
	}
	
	public List<District> findByZip(String zip) {
		Districts dao = DAO.getDBI().onDemand(Districts.class);
		return dao.findByZip(zip);
	}



}
