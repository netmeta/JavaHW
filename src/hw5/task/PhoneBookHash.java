package hw5.task;

import java.util.*;

public class PhoneBookHash {
    public static Map<String, String> phoneBook = new HashMap<>();

    public static void run() {

        addPhone("+7911-100-22-33", "John Wick");
        addPhone("+7911-100-22-44", "mr.President");
        addPhone("+7911-100-22-55", "Ivanov Ivan");
        addPhone("+7911-100-00-00", "John Wick");
        addPhone("+7911-100-00-88", "Ivanov John");
        addPhone("+7911-100-67-88", "John Wick");
        addPhone("+7911-100-11-11", "Adam Baeyer");

        System.out.println("\n List Contact");
        phoneBook.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).forEach((i -> {
            System.out.printf("Phone: %s | Name: %s\n", i.getKey(), i.getValue());
        }));

        Scanner scan = new Scanner(System.in);
        System.out.print("Find phone by name : ");
        String num = scan.nextLine();

        System.out.println("PhoneNumber : " + getKeyFromValue(phoneBook, num));
        scan.close();
    }

    private static <K, V> K getKeyFromValue(Map<K, V> map, Object value) {

        Set<K> keys = map.keySet();
        for (K key : keys) {

            if (map.get(key).equals(value)) {
                return key;
            }
        }
        return null;
    }

    public static void addPhone(String phone, String name) {
        phoneBook.put(phone, name);
    }
}
