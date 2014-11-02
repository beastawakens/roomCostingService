package org.edsouthey.roomCostingService;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class CostingServiceTest {
	
	private CostingService costingService;

	@Before
	public void setUp() {
		costingService = new CostingService();
	}
	
	@Test
	public void shouldReturnCostForStandardRoomWithNoFacilities() throws Exception {
		Room standardRoomWithNoFacilities = new StandardRoom();
		
		Integer cost = costingService.calculateFor(standardRoomWithNoFacilities);
		
		assertThat(cost, is(0));
	}
	
	@Test
	public void shouldReturnCostForStandardRoomWithOneFacility() throws Exception {
		Room standardRoomWithOneFacility = new StandardRoom().with(Facility.POOL);
		
		Integer cost = costingService.calculateFor(standardRoomWithOneFacility);
		
		assertThat(cost, is(3));
	}

}
