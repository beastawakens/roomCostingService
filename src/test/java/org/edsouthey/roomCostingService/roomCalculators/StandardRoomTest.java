package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.edsouthey.roomCostingService.Facility;
import org.junit.Test;

public class StandardRoomTest {
	
	@Test
	public void shouldReturnNoCostForNoFacilities() throws Exception {
		Room standardRoom = new StandardRoom();
		assertThat(standardRoom.getCost(), is(0));
	}
	
	@Test
	public void shouldReturnBasePriceForFirst3Facilities() throws Exception {
		Room standardRoom = new StandardRoom().with(Facility.ENSUITE);
		assertThat(standardRoom.getCost(), is(3));
		
		standardRoom = new StandardRoom().with(Facility.POOL).and(Facility.ENSUITE);
		assertThat(standardRoom.getCost(), is(6));
		
		standardRoom = new StandardRoom().with(Facility.BREAKFAST).and(Facility.ENSUITE).and(Facility.POOL);
		assertThat(standardRoom.getCost(), is(9));
	}

}
