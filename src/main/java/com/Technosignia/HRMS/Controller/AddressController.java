package com.Technosignia.HRMS.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.HRMS.Entity.Address;
import com.Technosignia.HRMS.Service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address address)
	{
		return addressService.createAddress(address);
	}
	
	
	@GetMapping("/address")
	public Optional<Address> findAddressById(@RequestParam Long id)
	{
		return addressService.getAddressById(id);
	}
	
	
	@PutMapping("/address")
	public Address updateAddressById(@RequestParam Long id ,@RequestBody Address address)
	{
		return addressService.editAddressById(id ,address);
	}
	
	@GetMapping("/kjhgfdkj,hgfgdsajkhgfdsjhgfdsjhgff")
	public String deleteAddress(@RequestParam Long id)
	{
		return addressService.removeAddressById(id);
	}

}
 