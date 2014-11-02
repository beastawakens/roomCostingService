package org.edsouthey.roomCostingService.roomCalculators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.edsouthey.roomCostingService.Facility;
import org.edsouthey.roomCostingService.roomCalculators.Room;
import org.edsouthey.roomCostingService.roomCalculators.StandardRoom;
import org.junit.Test;

public class RoomTest {
	
	@Test
	public void canChainFacilitiesOnConstruction() throws Exception {
		Room room = new StandardRoom();
		assertThat(room.getFacilities().size(), is(0));
		
		room = new StandardRoom().with(Facility.ENSUITE);
		assertThat(room.getFacilities().size(), is(1));
		assertTrue(room.getFacilities().contains(Facility.ENSUITE));

		room = new StandardRoom().with(Facility.ENSUITE).and(Facility.POOL);
		assertThat(room.getFacilities().size(), is(2));
		assertTrue(room.getFacilities().contains(Facility.ENSUITE));
		assertTrue(room.getFacilities().contains(Facility.POOL));
	}

	@Test
	public void willNotAllowDoubleBookingOfFacilities() throws Exception {
		Room room = new StandardRoom().with(Facility.ENSUITE).and(Facility.POOL).and(Facility.POOL);
		assertThat(room.getFacilities().size(), is(2));

	}
	
}
