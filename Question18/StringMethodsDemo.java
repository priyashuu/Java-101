import java.util.*;

public class StringMethodsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Count Vowels and Consonants");
            System.out.println("2. Count Duplicate Words");
            System.out.println("3. Count Words");
            System.out.println("4. Count Substring Occurrences");
            System.out.println("5. Remove Duplicate Words");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    countVowelsAndConsonants(sc);
                    break;
                case 2:
                    countDuplicateWords(sc);
                    break;
                case 3:
                    countWords(sc);
                    break;
                case 4:
                    countSubstringOccurrences(sc);
                    break;
                case 5:
                    removeDuplicateWords(sc);
                    break;
                case 6:
                    System.out.println("Exiting. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    // 1. Count Vowels and Consonants
    public static void countVowelsAndConsonants(Scanner sc) {
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // 2. Count Duplicate Words
    public static void countDuplicateWords(Scanner scanner) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) duplicates.add(word);
        }

        System.out.println("Duplicate words: " + duplicates.size());
    }

    // 3. Count Words
    public static void countWords(Scanner scanner) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // 4. Count Substring Occurrences
    public static void countSubstringOccurrences(Scanner scanner) {
        System.out.print("Enter the main string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        int count = 0, index = 0;
        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.println("Occurrences of substring: " + count);
    }

    // 5. Remove Duplicate Words
    public static void removeDuplicateWords(Scanner scanner) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        System.out.println("String without duplicate words: " + String.join(" ", uniqueWords));
    }
}
