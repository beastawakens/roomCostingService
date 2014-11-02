package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GreatViewRoomTest {
	
	@Test
	public void shouldReturnNoCostForNoFacilities() throws Exception {
		Room greatViewRoom = new GreatViewRoom();
		
		assertThat(greatViewRoom.getCost(), is(0));
	}
}
