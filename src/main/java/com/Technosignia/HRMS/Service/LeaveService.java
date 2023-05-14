package com.Technosignia.HRMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.HRMS.Entity.Leaves;
import com.Technosignia.HRMS.Repository.LeaveRepository;

@Service
public class LeaveService {
       @Autowired
	LeaveRepository leaveRepository;

	public Leaves TakeLeaveById(Leaves leave) {
		
		return leaveRepository.save(leave) ;
	}
}
