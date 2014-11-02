package org.edsouthey.roomCostingService;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

import java.util.Random;

import org.edsouthey.roomCostingService.roomCalculators.Room;
import org.edsouthey.roomCostingService.roomCalculators.StandardRoom;
import org.junit.Before;
import org.junit.Test;

public class CostingServiceTest {
	
	private CostingService costingService;

	@Before
	public void setUp() {
		costingService = new CostingService();
	}
	
	@Test
	public void shouldDelegateToRoom() throws Exception {
		Integer result = new Random().nextInt();
		
		Room mockRoom = mock(Room.class);
		when(mockRoom.getCost()).thenReturn(result);
		
		Integer calculatedCost = costingService.calculateFor(mockRoom);
		
		assertThat(calculatedCost, is(result));
	}

}
