package com.kohlisoft.travel.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class TravelService {

	List<Hotel> hotels = new ArrayList<Hotel>();
	
	@WebMethod()
	public void addHotel(Hotel hotel) {
		hotels.add(hotel);
	}
	
	public List<Hotel> getHotels(){
		return hotels;
	}
}
