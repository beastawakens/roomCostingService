package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.edsouthey.roomCostingService.Facility;
import org.junit.Test;

public class SuiteRoomTest {
	
	@Test
	public void shouldReturnNoCostForNoFacilities() throws Exception {
		Room suiteRoom = new SuiteRoom();
		
		assertThat(suiteRoom.getCost(), is(0));
	}
	
	@Test
	public void shouldReturnDifferentPricesForTheDifferentFacilities() throws Exception {
		Room suiteRoom = new SuiteRoom().with(Facility.BREAKFAST);
		assertThat(suiteRoom.getCost(), is(5));

		suiteRoom = new SuiteRoom().with(Facility.ENSUITE);
		assertThat(suiteRoom.getCost(), is(4));

		suiteRoom = new SuiteRoom().with(Facility.INTERNET);
		assertThat(suiteRoom.getCost(), is(2));
		
		suiteRoom = new SuiteRoom().with(Facility.LATE_CHECKOUT);
		assertThat(suiteRoom.getCost(), is(1));
		
		suiteRoom = new SuiteRoom().with(Facility.POOL);
		assertThat(suiteRoom.getCost(), is(1));
	}
	
	@Test
	public void shouldSumUpThePartsAppropriately() throws Exception {
		Room suiteRoom = new SuiteRoom().with(Facility.ENSUITE).and(Facility.BREAKFAST);
		
		assertThat(suiteRoom.getCost(), is(9));
	}

}
