/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author k1258579, k1009705
 */
package uk.ac.kingston.ci5100.petlikes_pair4.model;

public class PetStoreInformation {
    
    private String name;
//    private String[] address;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String postcode;
    private String addressLine6;
    private String phoneNumbers;
    private String website;
    private String openingtimes;

    /**
     * 
     * @return address as array of Strings
     */
    
    public String[] getAddress() {
        return address;
    }

    
    /**
     * sets address
     * @param address as String array
     */
    public void setAddress(String[] address) {
        this.address = address;
    }

    
    /**
     *
     * @return phoneNumbers as String
     */
    
    
    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    
    /**
     * 
     * @param phoneNumbers String containing phoneNumbers
     */
    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    
    /**
     * 
     * @return website as String
     */
    public String getWebsite() {
        return website;
    }
    
/**
 * 
 * @param website String containing website
 */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return openingtimes as String
     */
    public String getOpeningtimes() {
        return openingtimes;
    }
    /**
     * sets the openingtimes
     * @param openingtimes String containing openingtimes
     */
    public void setOpeningtimes(String openingtimes) {
        this.openingtimes = openingtimes;
    }
       
        
        /**
         * Convert an array of Strings into one String
         * @param a target array of Strings
         * @return single String comprised of all the array elements separated by spaces
         */
    
    
    String[] addr = address.split(":");
    (java.lang.String[]) [, a, b, c, d, e, f];

                 
    private String[] getStringAsArray(String s)
        {
            String[] result = s.split(":");
            return result;
        }

    
    
    /**
     * 
     * @return name as String
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * gets the addressLine1
     * @return addressLine1 as String
     */
    public String getAddressLine1() {
        return addressLine1;
    }
    /**
     * sets the addressLine1
     * @param addressLine1 a string containing AddressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * gets the addressLine2
     * @return addressLine2 as String
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * sets the addressLine2
     * @param addressLine2 a string containing AddressLine1
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * gets the addressLine3
     * @return addressLine3 as String
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * sets the addressLine1
     * @param addressLine1 a string containing AddressLine1
     */
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * gets the addressLine4
     * @return addressLine4 as String
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * sets the addressLine4
     * @param addressLine4 a string containing AddressLine1
     */
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

/**
     * gets the postcode
     * @return postcode as String
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * sets the postcode
     * @param postcode a string containing AddressLine1
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }   
     
/**
     * gets the addressLine6
     * @return addressLine6 as String
     */
    public String getAddressLine6() {
        return addressLine6;
    }
    
    /**
     * sets the addressLine6
     * @param addressLine6 a string containing AddressLine1
     */
    public void setAddressLine6(String addressLine6) {
        this.addressLine6 = addressLine6;
    }
}