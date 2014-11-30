package om.moh.academic.codingbat;

public class FrontTimes {
	
	/**
	 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front; 
		frontTimes("Chocolate", 2) → "ChoCho"
		frontTimes("Chocolate", 3) → "ChoChoCho"
		frontTimes("Abc", 3) → "AbcAbcAbc"
	 * @param str
	 * @param n
	 * @return
	 */
	public String frontTimes(String str, int n) {
		StringBuilder sb = new StringBuilder();
	    String sub = null;	
		if(str.length() <=3 ){
			sub = str;
		} else {
			sub = str.substring(0, 3);
		}
		for(int i=1; i<=n; i++) {
			sb =sb.append(sub);
		}
		return sb.toString();
	}
}
