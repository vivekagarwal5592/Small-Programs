package Lab12;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveProbsTest {

	@Test
	public void testRecursiveContainsWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertFalse(r.recursiveContains('a', s));
	}
	
	@Test
	public void testRecursiveContainsWithNoOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveContains('z', s));
	}

	@Test
	public void testRecursiveContainsWithOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertTrue(r.recursiveContains('a', s));
	}


	@Test
	public void testAllSameWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertTrue(r. recursiveAllCharactersSame(s));
	}

	@Test
	public void testAllSameWithDifferingCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertFalse(r. recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveAllSameWithAllSameCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "aaaaaaa";
		assertTrue(r. recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveReverseEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertEquals(r.recursiveReverse(""),s);
	}

	@Test
	public void testReverseNonEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "abc";
		assertEquals(r.recursiveReverse(s),"cba");
	}
	
	@Test
	public void testnoofletterscount() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "abc";
		assertEquals(r.recursiveCount('a',s),1);
	}
	
	@Test
	public void testnoofletterscountemptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertEquals(r.recursiveCount('a',s),0);
	}
	
	@Test
	public void testnoofletterscountzeo() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "abc";
		assertEquals(r.recursiveCount('x',s),0);
	}


	@Test
	public void testnoofletterscountallsame() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "aaa";
		assertEquals(r.recursiveCount('a',s),3);
	}
}