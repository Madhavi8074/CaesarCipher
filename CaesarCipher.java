package projects;

import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + shift) % 26 + base);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter shift value (1-25): ");
        int shift = scanner.nextInt();

        // Encrypt text using Caesar Cipher
        String encryptedText = encrypt(text, shift);

        // Display the encrypted text
        System.out.println("Encrypted Text: " + encryptedText);

        scanner.close();
    }
}

