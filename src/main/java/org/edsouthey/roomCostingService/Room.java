package org.edsouthey.roomCostingService;

import java.util.EnumSet;
import java.util.Set;

public abstract class Room {
	
	private Set<Facility> facilities = EnumSet.noneOf(Facility.class);

	public Room with(Facility facility) {
		this.facilities.add(facility);
		return this;
	}
	
	public Room and(Facility facility) {
		return with(facility);
	}
	
	public Set<Facility> getFacilities() {
		return this.facilities;
	}
	
	public abstract Integer getCost();

}
