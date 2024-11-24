import java.util.HashSet;

class ArrayStringClass {

    public static void main(String[] args) {
        // Array syntax
        // datatype [] variableName = new datatype[size];
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = { 1, 2, 3, 4 };

        //declaration of array, ros is getting defined in the stack
        int[] ros; 
        ros = new int[5]; // initialisatio: actually here object is being created in memory
    }

    


    // is Unique: Implement an algorithm to determine if a string has all unique charaters.
    // What if you cannot use additional data structures?
    public static boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }
    // let's use data structure (HASHSET)
    public static boolean isUnique2(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c: s.toCharArray()){
            if (!set.add(c)){
                return false;
            }
        }
        return true;
    }

    


    // utils
    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int r = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}