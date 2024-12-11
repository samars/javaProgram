package ownProgram;

public class CountVowelAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
		int vowel =0, consonants =0;
		for(char c:str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowel++;
			} else {
				consonants++;
			}
		}
		
	System.out.println("Vowels "+vowel+" consonents "+consonants);
	}

}
