// A Caesar Cipher is a s.charAt(i)mple cipher that works by shifting each letter in 
// the given message by a certain number. For example, if we shift the message 
// "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
// Write the function applyCaesarCipher(message, shift) which shifts the given 
// message by shift letters. You are guaranteed that message is a string, and 
// that shift is an integer between -25 and 25. Capital letters should stay capital 
// and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
// Note that "Z" wraps around to "A". So, for example:
// assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
// assert(applyCaesarCipher("zodiac", -2) == "xmbgya")

public class CeaserCipher {
	public String fun_applycaesarcipher(String message, int offset){
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
			if (character != ' ') {
				int originalAlphabetPosition = character - 'a';
				int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
				char newCharacter = (char) ('a' + newAlphabetPosition);
				result.append(newCharacter);
			} else {
				result.append(character);
			}
		}
return result.toString();
	}
	
}