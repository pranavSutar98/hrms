package com.Technosignia.HRMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.HRMS.Entity.Leaves;
import com.Technosignia.HRMS.Service.LeaveService;

@RestController
public class LeaveController {
      
	@Autowired
	LeaveService leaveService;
	
	@PostMapping("/Leave")
	public Leaves ApplyLeaveById(@RequestBody Leaves leave)
	{
		return leaveService.TakeLeaveById(leave);
	}
}
