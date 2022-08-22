package com.coreJava.assignments;

class StringOperations {

	String reverseString(String s) {

		String ans = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ans = ans + s.charAt(i);

		}
		return ans;
	}

	String reverseWithSamePosition(String s) {
		String ans = "";
		String a[] = s.split(" ");
		ans = ans + reverseString(a[0]) + " " + reverseString(a[1]);
		return ans;

	}

	String isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		int count = 0;
		String ans = "not a anagram";
		if (a1.length == b1.length) {
			for (char string : b1) {

				for (char string2 : a1) {
					if (string == string2)
						count += 1;

				}
			}
		}
		if (a1.length == count)
			ans = "it is a anagram";
		return ans;

	}

	String isPangram(String a) {
		char b[]=a.toCharArray();
		int index=0;
		String alphabets[] = { "false", "false", "false", "false", "false", "false", "false", "false", "false", "false",
				"false", "false", "false", "false", "false", "false", "false", "false", "false", "false", "false",
				"false", "false", "false", "false", "false" };
		for(int i=0;i<a.length();i++) {
			if('A'<= b[i] && b[i] <= 'Z') {
				index= b[i] - 'A';
			}
			else if('a'<= b[i] && b[i] <= 'z') {
				index= b[i] - 'a';
			}
			alphabets[index]="true";
		}
		
		for (String string : alphabets) {
			if(string == "false")
				return "Not a pangram";
			

			
		}
		return "It is a pangram";
	}

	StringBuilder isRepeated(String a) {
		a=a.toLowerCase();
		StringBuilder ans = new StringBuilder(26);
		int occurence[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char chars[]=a.toCharArray();
		int index =0;
		for (char c : chars) {
			if('a'<= c && c <= 'z') {
				index = c-'a';
				occurence[index]+=1;
			}
			
		}
		
		for (int i=0; i<occurence.length;i++) {
			if(occurence[i]>1) {
				char c= (char)(i+97);
				ans.append(c);
				ans.append(' ');
				
			}
			
		}
		
		return ans;
		
	}

	StringBuilder orderAlphabeticallly(String a) {
		StringBuilder sb = new StringBuilder(a.length());
		a=a.toLowerCase();
		char b[] = a.toCharArray();
		
		for(int i=0; i<b.length;i++) {
			for(int j =0; j< b.length;j++) {
				if(b[i]>b[j]) {
					char temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (char c : b) {
			
			sb.append(c);
		}
	
		return sb.reverse();
	}

	String noOfVowelsandConsonants(String a ) {
		a=a.toLowerCase();
		char b[] = a.toCharArray();
		char vowels[]= {'a','e','i','o','u'};
		int vowel=0;
		int consonents=0;
		for (char c : b) {
			for (char d : vowels) {
				if(c==d)
					vowel+=1;

			}
			
		}
		consonents=a.length()-vowel;
		return ("Vowels: " + vowel + " "+ "Consonents: " + consonents);
	}

	String noOfSpecialChars(String a) {
		a=a.toLowerCase();
		char b[]= a.toCharArray();
		int spl=0;

		
		for (char c : b) {
			if(!(c>='a'&& c<='z' || c>='0' && c<= '9'))
				spl+=1;
		}
		
		return ("Total no of special characters in given string : "+ spl);
	}
}

public class StringsAssignment {

	public static void main(String[] args) {

		StringOperations rs = new StringOperations();
		System.out.println(rs.reverseString("iNeuron"));
		System.out.println(rs.reverseWithSamePosition("Think Twice"));
		System.out.println(rs.isAnagram("Race", "Care"));
		System.out.println(rs.isPangram("abcdefghijklmnopqrstuwxyz"));
		System.out.println(rs.isRepeated("abccdeefjj"));
		System.out.println(rs.orderAlphabeticallly("zbacde"));
		System.out.println(rs.noOfVowelsandConsonants("aebcidofgu"));
		System.out.println(rs.noOfSpecialChars("aebc@$%^id#ofg_u;/"));
		
	}

}
