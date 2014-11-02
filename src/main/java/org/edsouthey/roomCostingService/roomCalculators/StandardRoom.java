package org.edsouthey.roomCostingService.roomCalculators;

public class StandardRoom extends Room {

	private static final int BASE_PRICE = 3;
	private static final int EXTENDED_PRICE = 6;
	private static final int NUMBER_OF_BASE_FACILITIES = 3;

	@Override
	public Integer getCost() {
		if (getFacilities().size() > NUMBER_OF_BASE_FACILITIES) {
			int baseFacilityCost = NUMBER_OF_BASE_FACILITIES * BASE_PRICE;
			int numberOfExtendedFacilities = getFacilities().size() - NUMBER_OF_BASE_FACILITIES;
			int extendedFacilityCost = numberOfExtendedFacilities * EXTENDED_PRICE;
			
			return baseFacilityCost + extendedFacilityCost;
		} else {
			return getFacilities().size() * BASE_PRICE;
		}
	}



}
