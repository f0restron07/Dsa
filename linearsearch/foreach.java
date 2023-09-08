public class foreach {
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
        for (char hey:name.toCharArray()) {//it simply does ['O','m','k','a','r']
            if (hey == target) {
                return true;
            }
        }
        return false;
    }
}
