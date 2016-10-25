package com.amen.solid.o_2.good;

import com.amen.solid.o_2.CustomerSurveyor;

/**
 * Objects or entities should be open for extension, but closed for modification.
 * 
 * @author AmeN
 */
public class VehicleClaimProcess implements ICustomerClaimProcess{
	@Override
	public void processClaim(CustomerSurveyor surveyor) {
		if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing vehicle claim for approval....");
		}
	}
}
