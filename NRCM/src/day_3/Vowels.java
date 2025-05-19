//package day_3;
//
//public class Vowels {
//	public static void main(String[] args) {
//		String str="helloworld";
//		int vowels=0,consonants=0;
//		for (int i=0;i<str.length();i++){
//				char ch=str.charAt(i);
//				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//					vowels+=1;
//				}
//				else if(ch>='a'&& ch<='z')
//				consonants+=1;
//				}
//				System.out.println("Vowels:" + vowels +",Consonants:"+ consonants);
//	}
//
//}

//one more method to print char
package day_3;

public class Vowels {
	public static void main(String[] args) {
		String str="helloworld";
		String vowels="";
		String consonants="";
		int cnt=0;
		for (int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels+=ch;
			}
			else if(ch>='a'&& ch<='z') {
				if(ch=='l') {
					cnt+=1;
				}
			consonants+=ch;
			}
		}
		System.out.println("Vowels:" + vowels +",Consonants:"+ consonants);
		System.out.println(cnt);
}

}
		


