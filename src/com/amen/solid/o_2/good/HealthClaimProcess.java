package com.amen.solid.o_2.good;

import com.amen.solid.o_2.CustomerSurveyor;

public class HealthClaimProcess implements ICustomerClaimProcess{
	@Override
	public void processClaim(CustomerSurveyor surveyor) {
		if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing health claim for approval....");
		}
	}
}
