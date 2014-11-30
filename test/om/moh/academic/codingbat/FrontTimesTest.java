package om.moh.academic.codingbat;

public class FrontTimesTest {

	FrontTimes targetFrontTimes;
	private int errors = 0;
	private int count = 0;
	
	public static void main(String[] args) {
		FrontTimesTest obj = new FrontTimesTest();

	}
	
	public FrontTimesTest() {
		targetFrontTimes = new FrontTimes();
		frontTimesTestCases();
	}
	
	public void frontTimes(String str, int n, String expected) {
		String actual = "";
		try {
			actual = targetFrontTimes.frontTimes(str, n);
			System.out.println("actual :"+actual+" expected :"+expected);
		} catch (Exception e) {
			System.out.println("Error :"+e+ " ,str :"+str+ ",n :"+n+ ",expected :"+expected);
			e.printStackTrace();
		}
		if(!actual.equals(expected)) {
			errors++;
		} else {
			//System.out.println("No Errors");
		}
		count++;
	}
	
	public void frontTimesTestCases() {
		frontTimes("Mujeeb" , 3, "MujMujMuj");
		frontTimes("Muj" , 3, "MujMujMuj");
		frontTimes("M" , 3, "MMM");
		frontTimes("" , 3, "");
		frontTimes("1" , 4, "1111");
		//frontTimes(" " , 3, "");
		frontTimes("google" , 0, "");
		System.out.println("Called : Error "+errors+", count "+count);
	}

}
