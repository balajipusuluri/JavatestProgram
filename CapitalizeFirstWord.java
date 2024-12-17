package programmingjava;

public class CapitalizeFirstWord {
	public static void main(String[] args) {
	String s="This is balaji";
	s+=" ";
	String word="",s1="";
	int end=0,position=0;
	while(s.indexOf(' ',position)>0) {
		end=s.indexOf(' ', position);
		word=s.substring(position, end);
		s1=s1+Character.toUpperCase(word.charAt(0));
		s1=s1+word.substring(1)+" ";
		position=end+1;

}
	System.out.println(s1.trim());
	}
}
