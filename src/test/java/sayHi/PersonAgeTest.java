package sayHi;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonAgeTest
{
	
	PersonAge R;
	PersonAge J;
	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new PersonAge("Romeo", "Mon", 15);
		J = new PersonAge("Juliet", "Cap", 13);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Mon, 15",R.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	void testPerson()
	{
		PersonAge child = R.makePerson(J);
		
		assertEquals(R.getFname(), child.getFname());
		assertEquals(J.getLname(), child.getLname());
		assertEquals(0, child.getAge());
		
	}

}



