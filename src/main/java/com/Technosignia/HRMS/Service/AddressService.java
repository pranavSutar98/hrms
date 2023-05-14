package com.Technosignia.HRMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.HRMS.Entity.Address;
import com.Technosignia.HRMS.Repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		
		return addressRepository.save(address);
	}
	
	
	public Optional <Address> getAddressById(Long id) {
		
		return addressRepository.findById(id);
	}
	

	public Address editAddressById(Long id, Address address) {
		Optional<Address> op = addressRepository.findById(id);
		Address dbadd = op.get();
		
		if(address.getId()!=null)
			dbadd.setId(address.getId());
		
		if(address.getStreetName()!=null)
			dbadd.setStreetName(address.getStreetName());
		
		if(address.getPincode()!=null)
			dbadd.setPincode(address.getPincode());
		
		if(address.getCity()!=null)
			dbadd.setCity(address.getCity());
		
		if(address.getCountry()!=null)
			dbadd.setCountry(address.getCountry());
		
		if(address.getState()!=null)
			dbadd.setState(address.getState());
		
		return addressRepository.save(dbadd);
	}
	

	public String removeAddressById(Long id) {
		
		addressRepository.deleteById(id);
		return "One Address Wil Be Deleted";
	}

	

}
