package com.kohlisoft.travel.service;

public class TravelServiceProxy implements com.kohlisoft.travel.service.TravelService {
  private String _endpoint = null;
  private com.kohlisoft.travel.service.TravelService travelService = null;
  
  public TravelServiceProxy() {
    _initTravelServiceProxy();
  }
  
  public TravelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTravelServiceProxy();
  }
  
  private void _initTravelServiceProxy() {
    try {
      travelService = (new com.kohlisoft.travel.service.TravelServiceServiceLocator()).getTravelServicePort();
      if (travelService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)travelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)travelService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (travelService != null)
      ((javax.xml.rpc.Stub)travelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kohlisoft.travel.service.TravelService getTravelService() {
    if (travelService == null)
      _initTravelServiceProxy();
    return travelService;
  }
  
  public com.kohlisoft.travel.service.Hotel[] getHotels() throws java.rmi.RemoteException{
    if (travelService == null)
      _initTravelServiceProxy();
    return travelService.getHotels();
  }
  
  public void addHotel(com.kohlisoft.travel.service.Hotel arg0) throws java.rmi.RemoteException{
    if (travelService == null)
      _initTravelServiceProxy();
    travelService.addHotel(arg0);
  }
  
  
}