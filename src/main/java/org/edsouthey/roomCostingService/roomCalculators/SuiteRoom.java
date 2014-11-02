package org.edsouthey.roomCostingService.roomCalculators;

import org.edsouthey.roomCostingService.Facility;

public class SuiteRoom extends Room {

	@Override
	public Integer getCost() {
		Integer runningTotal = 0;

		for (Facility facility: getFacilities()) {
			runningTotal += facility.getCost();
		}
		
		return runningTotal;
	}

}
