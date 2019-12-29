package com.singtel.assignment;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.utils.CommonBehaviours;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/*
 * Question A
 */
@RunWith(MockitoJUnitRunner.class)
public class BirdTest {
	@Mock
	CommonBehaviours bird;
	
	@Before
	public void setupMock()
	{
		MockitoAnnotations.initMocks(this);
		when(bird.canSing(true, "First Sound")).thenReturn(true);
	}
	
	@Test
	public void test() {
		System.out.println("The bird is singing "+ bird.canSing(true, "First Sound"));
		assertEquals(bird.canSing(true, "First Sound"), true );
		//verify(bird).canFly(false);
	}

}
