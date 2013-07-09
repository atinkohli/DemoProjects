/**
 * TravelServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kohlisoft.travel.service;

public class TravelServiceServiceLocator extends org.apache.axis.client.Service implements com.kohlisoft.travel.service.TravelServiceService {

    public TravelServiceServiceLocator() {
    }


    public TravelServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TravelServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TravelServicePort
    private java.lang.String TravelServicePort_address = "http://localhost:8080/SOAPTravelService/TravelService";

    public java.lang.String getTravelServicePortAddress() {
        return TravelServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TravelServicePortWSDDServiceName = "TravelServicePort";

    public java.lang.String getTravelServicePortWSDDServiceName() {
        return TravelServicePortWSDDServiceName;
    }

    public void setTravelServicePortWSDDServiceName(java.lang.String name) {
        TravelServicePortWSDDServiceName = name;
    }

    public com.kohlisoft.travel.service.TravelService getTravelServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TravelServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTravelServicePort(endpoint);
    }

    public com.kohlisoft.travel.service.TravelService getTravelServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kohlisoft.travel.service.TravelServiceServiceSoapBindingStub _stub = new com.kohlisoft.travel.service.TravelServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTravelServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTravelServicePortEndpointAddress(java.lang.String address) {
        TravelServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kohlisoft.travel.service.TravelService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kohlisoft.travel.service.TravelServiceServiceSoapBindingStub _stub = new com.kohlisoft.travel.service.TravelServiceServiceSoapBindingStub(new java.net.URL(TravelServicePort_address), this);
                _stub.setPortName(getTravelServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TravelServicePort".equals(inputPortName)) {
            return getTravelServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.travel.kohlisoft.com/", "TravelServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.travel.kohlisoft.com/", "TravelServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TravelServicePort".equals(portName)) {
            setTravelServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
