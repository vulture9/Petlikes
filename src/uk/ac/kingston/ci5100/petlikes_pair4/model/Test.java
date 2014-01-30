/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.kingston.ci5100.petlikes_pair4.model;

/**
 *
 * @author Charlotte
 */
public class Test {
    
    
    
 /**
     * @param args the command line arguments 
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("test");
        
        // String test="Jill's Pet Store,3-5 Stadhampton Rd: Drayton St Leonard: Drayton Saint Leonard: Oxfordshire :OX10 7: UK,(0111) 305-9083,www.jills-pet-store.co.uk,8am-6pm";
        
        PetStoreInformation ps = new PetStoreInformation();
        
		// This method should be moved to the back end, only a methods from other backend classes of this project should be used here.
        ps.setName("Jill's Pet Store");
        ps.setAddress("3-5 Stadhampton Rd: Drayton St Leonard: Drayton Saint Leonard: Oxfordshire :OX10 7: UK");
        ps.setWebsite("www.jills-pet-store.co.uk");
        // These methods
    }
}

