package org.edsouthey.roomCostingService.roomCalculators;

import org.edsouthey.roomCostingService.Facility;

public class GreatViewRoom extends Room {
	private static final Integer  GREAT_VIEW_PREMIUM = 2;

	@Override
	public Integer getCost() {
		Integer runningTotal = 0;

		for (Facility facility: getFacilities()) {
			runningTotal += facility.getCost() * GREAT_VIEW_PREMIUM;
		}
		
		return runningTotal;
	}

}
