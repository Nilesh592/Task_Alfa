import java.util.HashMap;

class HashmapMethods {
    public static void main(String[] args) {

        // create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add mappings to HashMap
        languages.put(1, "Python");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages: " + languages);

        // remove the mapping with key 2
        languages.remove(2); // return C

        System.out.println("Updated Languages after removing key 2: " + languages);

        // editing mapping for key 1
        String value = languages.replace(1, "Html");

        System.out.println("Updated Languages after editing key 1: " + languages);

        // get the value with key 1
        String getvalue = languages.get(1);

        System.out.println("Your Language: " + getvalue);

    }
}