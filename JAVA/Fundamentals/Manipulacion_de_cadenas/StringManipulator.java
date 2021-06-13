import java.lang.String;
public class StringManipulator{
	public String trimAndConcat(String one, String two){
		one = one.trim();
		two = two.trim();
		String temp = one+two;
		return temp;
	}
	
	public int getIndexOrNull(String temp, char chr){
		return temp.indexOf(chr);
	}
	
	public int getIndexOrNull(String temp, String str){
		return temp.indexOf(str);
	}
	
	public String concatSubstring(String one, int two, int three, String four){
		if(checkcSValue(one, two, three) == true){
			String temp = one.substring(two,three);
			temp = temp.concat(four);
			return temp;
		}
		return null;
		
	}
	
	public boolean checkcSValue(String str, int one, int two){
		if(one >= 0){
			if(two < str.length()){
				return true;
			}
		} 
		return false;
	}
}