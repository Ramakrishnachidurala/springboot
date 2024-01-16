package com.rkconst.restdemo.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendodrPhonenumber;
    public CloudVendor() {
        
   }
   public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendodrPhonenumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendodrPhonenumber = vendodrPhonenumber;
    }


    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public String getVendodrPhonenumber() {
        return vendodrPhonenumber;
    }
    public void setVendodrPhonenumber(String vendodrPhonenumber) {
        this.vendodrPhonenumber = vendodrPhonenumber;
    }
}