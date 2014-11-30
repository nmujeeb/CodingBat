package om.moh.academic.codingbat;

public class MonkeyTroubleTest {

	MonkeyTrouble targetMonkeyTrouble;
	private int errors = 0;
	private int count = 0;
	
	public static void main(String[] args) {
		MonkeyTroubleTest app = new MonkeyTroubleTest();	
	}
	
	public MonkeyTroubleTest(){
		targetMonkeyTrouble = new MonkeyTrouble();
		monkeyTroubleTestCases();
	}
	
	public void monkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
		boolean actual = false;
		try {
			actual = targetMonkeyTrouble.monkeyTrouble(aSmile, bSmile);
			System.out.println("actual :"+actual);
		} catch (Exception e) {
			System.out.println("Error "+e+ " ,aSmile "+aSmile+ ",bSmile "+bSmile+ ",expected "+expected);
			e.printStackTrace();
		}
		if (actual != expected) {
			System.out.println("For Expected "+expected+" ,aSmile "+aSmile+ ",bSmile "+bSmile);
			errors++;
		}
		count++;
	}
	
	public void monkeyTroubleTestCases() {
		monkeyTrouble(true,true,true);
		monkeyTrouble(true,false,false);
		monkeyTrouble(false,false,true);
		monkeyTrouble(false,true,false);
		System.out.println("Called : Error "+errors+", count "+count);
	}

}
