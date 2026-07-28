package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<String, String>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Russia", "New Zealand");
        countryMap.put("Ukraine", "New York");
        countryMap.put("Uganda", "New York");
        countryMap.put("Ukraine", "New York");
        countryMap.put("Pakistan", "Islamabad");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter country name: ");
        String countryName = input.nextLine();
        if (countryMap.containsKey(countryName)) {
            System.out.printf("Capital of %s is %s. ", countryName, countryMap.get(countryName));
        } else {
            System.out.printf("Country %s does not exist.");
        }
    }
}
