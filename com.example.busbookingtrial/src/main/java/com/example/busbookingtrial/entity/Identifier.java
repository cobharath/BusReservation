package com.example.busbookingtrial.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Identifier {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
