package com.kohlisoft.travel.client;

import com.kohlisoft.travel.service.Hotel;
import com.kohlisoft.travel.service.TravelServiceProxy;

public class TravelClient {

	public static void main(String[] args) throws Exception {
		
		TravelServiceProxy proxy = new TravelServiceProxy();
		Hotel hotel = new Hotel();
		hotel.setCity("Athlone");
		hotel.setName("Radisson");
		hotel.setStars(4);
		
		Hotel hotel2 = new Hotel();
		hotel2.setCity("Athlone");
		hotel2.setName("Shareton");
		hotel2.setStars(4);
		
		proxy.addHotel(hotel);
		proxy.addHotel(hotel2);
		
		Hotel[] l = proxy.getHotels();
		
		for(Hotel h: l) {
			System.out.println("Name = " + h.getName());	
		}
		
	}
}
