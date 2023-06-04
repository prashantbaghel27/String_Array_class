package string;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="PRASHANT";
String s2="baghel";
String s3="baghel";
String s4="my name is anuj";

System.out.println(s1.substring(3));
System.out.println(s1.subSequence(4,8 ));

System.out.println(s1.charAt(3));
System.out.println(s1+" "+s2);
System.out.println(s4.concat(s1));
 
System.out.println(s2.replace("baghel1","Singh"));

System.out.println(s1.length());

System.out.println(s1.isEmpty());

System.out.println(s1.toLowerCase());

System.out.println(s2.toUpperCase()); 

System.out.println(s2.equalsIgnoreCase(s3));

System.out.println(s4.contains("is"));
System.out.println(s4.contains("hjk"));

System.out.println(s4.startsWith("is"));
System.out.println(s4.startsWith("my"));

System.out.println(s4.endsWith("is"));
System.out.println(s4.endsWith("anuj"));
	
	System.out.println(s1.charAt(5));
	
	System.out.println(s1.indexOf("A"));
	
	}

}