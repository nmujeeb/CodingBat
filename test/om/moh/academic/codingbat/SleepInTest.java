package om.moh.academic.codingbat;

public class SleepInTest {

	private SleepIn targetSleepIn;
	private int errors = 0;
	private int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SleepInTest app = new SleepInTest();

	}

	public SleepInTest() {
		targetSleepIn = new SleepIn();
		sleepInTestCases();

	}

	public void sleepInTest(boolean weekday, boolean vacation, boolean expected) {
		boolean actual = false;
		try {
			actual = targetSleepIn.sleepIn(weekday, vacation);
			System.out.println("actual :"+actual);
		} catch (Exception e) {
			System.out.println("Error "+e+ " ,weekday "+weekday+ ",vacation "+vacation+ ",expected "+expected);
			e.printStackTrace();
		}
		if (actual != expected) {
			System.out.println("For Expected "+expected+" ,weekday "+weekday+ ",vacation "+vacation);
			errors++;
		}
		count++;
	}

	public void sleepInTestCases() {
		sleepInTest(false, false, true);
		sleepInTest(true, false, false);
		sleepInTest(false, true, true);
		sleepInTest(true, true, true);
		System.out.println("Called : Error "+errors+", count "+count);

	}

}
