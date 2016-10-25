package com.amen.solid.o_2.bad;

import com.amen.solid.o_2.CustomerSurveyor;

public class HealthClaimService {
	public void processHealthClaim (CustomerSurveyor customer) {
        if(customer.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing health claim for approval....");
        }
    }
 
    public void processVehicleClaim (CustomerSurveyor surveyor) {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing vehicle claim for approval....");
        }
    }
}
