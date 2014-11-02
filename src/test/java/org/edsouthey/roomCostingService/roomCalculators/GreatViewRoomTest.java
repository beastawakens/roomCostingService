package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.edsouthey.roomCostingService.Facility;
import org.junit.Test;

public class GreatViewRoomTest {
	
	@Test
	public void shouldReturnNoCostForNoFacilities() throws Exception {
		Room greatViewRoom = new GreatViewRoom();
		
		assertThat(greatViewRoom.getCost(), is(0));
	}
	
	@Test
	public void shouldReturnDifferentPricesForTheDifferentFacilities() throws Exception {
		Room greatViewRoom = new GreatViewRoom().with(Facility.BREAKFAST);
		assertThat(greatViewRoom.getCost(), is(10));

		greatViewRoom = new GreatViewRoom().with(Facility.ENSUITE);
		assertThat(greatViewRoom.getCost(), is(8));

		greatViewRoom = new GreatViewRoom().with(Facility.INTERNET);
		assertThat(greatViewRoom.getCost(), is(4));
		
		greatViewRoom = new GreatViewRoom().with(Facility.LATE_CHECKOUT);
		assertThat(greatViewRoom.getCost(), is(2));
		
		greatViewRoom = new GreatViewRoom().with(Facility.POOL);
		assertThat(greatViewRoom.getCost(), is(2));
	}
	
	@Test
	public void shouldSumUpThePartsAppropriately() throws Exception {
		Room greatViewRoom = new GreatViewRoom().with(Facility.ENSUITE).and(Facility.BREAKFAST);
		
		assertThat(greatViewRoom.getCost(), is(18));
	}
}
