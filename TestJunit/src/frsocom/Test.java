package frsocom;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {
    
	//@org.junit.Test
	
	@org.junit.Test(timeout = 1000)
	public  void testNBCours() {
			assertEquals(5, Cours.NbCours(5)); // TODO
	}
		

	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Avant la classe");; // TODO
	}
	
	@Before
	public  void testBefore() {
		System.out.println("Avant .....");; // TODO
	}
	
	
	@After
	public  void testAfter() {
		System.out.println("Après .....");; // TODO
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("Après Classe .....");; // TODO
	}



}
