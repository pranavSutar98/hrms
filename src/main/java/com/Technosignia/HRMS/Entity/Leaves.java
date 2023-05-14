package com.Technosignia.HRMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leaves {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    public  Long id;
     
       public Long totalLeaves;
     
   public  Long appliedLeaves;
     
    public Long remainingLeaves;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppliedLeaves() {
		return appliedLeaves;
	}

	public void setAppliedLeaves(Long appliedLeaves) {
		this.appliedLeaves = appliedLeaves;
	}

	public Long getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(Long totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public Long getRemainingLeaves() {
		return remainingLeaves;
	}

	public void setRemainingLeaves(Long remainingLeaves) {
		this.remainingLeaves = remainingLeaves;
	}
     
	
	
}
