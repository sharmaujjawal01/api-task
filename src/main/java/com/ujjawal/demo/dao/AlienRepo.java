package com.ujjawal.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
			
		//paging&sorting ke liye crud se jparepo pe aye


import com.ujjawal.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	
	
}
