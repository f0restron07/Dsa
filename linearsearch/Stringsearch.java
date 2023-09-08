public class Stringsearch {
    public static void main(String[] args) {
        String name="Omkar";
        char target = 'O';
        boolean index = string(name, target);
        if (index != false) {
            System.out.println("The element is found  " + index);
        } else {
            System.out.println("The element is not found in the array.");
        }
    }

    static boolean string(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}


