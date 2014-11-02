package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class SuiteRoomTest {
	
	@Test
	public void shouldReturnNoCostForNoFacilities() throws Exception {
		Room suiteRoom = new SuiteRoom();
		
		assertThat(suiteRoom.getCost(), is(0));
		
	}

}
