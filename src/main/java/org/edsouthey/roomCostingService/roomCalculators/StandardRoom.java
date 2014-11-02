package org.edsouthey.roomCostingService.roomCalculators;

public class StandardRoom extends Room {

	private static final int BASE_PRICE = 3;

	@Override
	public Integer getCost() {
		return getFacilities().size() * BASE_PRICE;
	}



}
