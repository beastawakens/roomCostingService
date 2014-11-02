package org.edsouthey.roomCostingService;

public enum Facility {
	POOL(1), ENSUITE(4), BREAKFAST(5), INTERNET(2), LATE_CHECKOUT(1);

	private Integer facilityCost;

	Facility(Integer facilityCost) {
		this.facilityCost = facilityCost;
	}
	
	public Integer getCost() {
		return facilityCost;
	}
}
