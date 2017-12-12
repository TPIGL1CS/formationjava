package juint;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testArith {
	private arith aTester=null;
	@Before
	public void setUp() throws Exception {
		aTester=new arith();
	}

	@After
	public void tearDown() throws Exception {
		aTester=null;
	}

	@Test
	public void testSomme() {
		int a=2, b=5;
		int resultatAttendu=7;
		assertTrue(aTester.somme(a, b)==resultatAttendu);
	}

	@Test
	public void testDifference() {
		int a=2, b=5;
		int resultatAttendu=3;
		assertTrue(aTester.difference(b,a)==resultatAttendu);
	}

	@Test
	public void testMultiplication() {
		int a=2, b=5;
		int resultatAttendu=10;
		assertTrue(aTester.multiplication(a, b)==resultatAttendu);
	}

	@Test
	public void testIncrementer() {
		int a=2;
		int resultatAttendu=3;
		assertTrue(aTester.incrementer(a)==resultatAttendu);
	}

	@Test
	public void testDecrementer() {
		int a=2;
		int resultatAttendu=1;
		assertTrue(aTester.decrementer(a)==resultatAttendu);
	}

	@Test
	public void testComparer() {
		int a=2, b=5;
		boolean resultatAttendu=false;
		assertTrue(aTester.comparer(a, b)==resultatAttendu);
	}

	@Test
	public void testPair() {
		int a=2;
		boolean resultatAttendu=true;
		assertTrue(aTester.pair(a)==resultatAttendu);
	}

}
