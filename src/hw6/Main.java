package hw6;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Asus", "White", "Windows 11");
        Laptop lap2 = new Laptop("Asus", "Black", "Windows 11");
        Laptop lap3 = new Laptop("Dell", "Red", "Windows 7");
        Laptop lap4 = new Laptop("Huawei", "Grey", "Windows 10");
        Laptop lap5 = new Laptop("MSI", "Black", "Windows 10");

        Set<Laptop> laptops = new HashSet<>(List.of(lap1, lap2, lap3, lap4, lap5));

        Map<String, String> sell = selectCriterion();
        sort(sell, laptops);
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriterion() {
        Map<String, String> resultSelect = new HashMap<>();
        while (true) {
            System.out.println("Do you want to select a criterion? If yes enter 'y', if no enter 'n'");
            String question = scanner();
            if (question.equals("n")) {
                break;
            } else {
                System.out.println("Choose a criterion: \n 1 - brand, \n 2 - color, \n 3 - OS");
                String num = scanner();
                System.out.println("Enter values for the selected criterion: ");
                String value = scanner();

                resultSelect.put(num, value);
            }
        }
        System.out.println(resultSelect);
        return resultSelect;
    }

    public static void sort(Map<String, String> criterion, Set<Laptop> laptops) {
        Set<Laptop> temp = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {
            for (Object pair : criterion.keySet()) {
                if (pair.equals("1") && !laptop.getBrand().equals(criterion.get(pair))) {
                    temp.remove(laptop);
                }
                for (Object pair1 : criterion.keySet()) {
                    if (pair.equals("2") && !laptop.getColor().equals(criterion.get(pair1))) {
                        temp.remove(laptop);
                    }
                    for (Object pair2 : criterion.keySet()) {
                        if (pair.equals("3") && !laptop.getOs().equals(criterion.get(pair2))) {
                            temp.remove(laptop);
                        }
                    }
                }
            }
        }
        if(temp.isEmpty()){
            System.out.println("No results were found matching the criteria you entered!");
        }else {
            System.out.println("Here's what we have to offer: " + temp.toString());
        }
    }
}