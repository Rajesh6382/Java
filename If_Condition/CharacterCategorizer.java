

class CharacterCategorizer {

    // Method to check if the character is a vowel
    public static boolean isVowel(char c) {
        char lowerChar = Character.toLowerCase(c);  // Convert to lowercase to handle both cases
        return lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u';
    }

    // Method to categorize the character
    public static void categorizeCharacter(char c) {
        // Check if the character is a letter
        if (Character.isLetter(c)) {
            if (isVowel(c)) {
                System.out.println(c + " is a vowel.");
            } else {
                System.out.println(c + " is a consonant.");
            }
        }
        // Check if the character is a digit
        else if (Character.isDigit(c)) {
            System.out.println(c + " is a digit.");
        }
        // If it's neither a letter nor a digit, it's a special character
        else {
            System.out.println(c + " is a special character.");
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);  // Read the first character of the input
        
        // Categorize the entered character
        categorizeCharacter(inputChar);

    }
}

