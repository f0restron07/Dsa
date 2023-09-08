public class Minandmax {
    public static void main(String[] args) {
        int[] arr = {10, 9, 39, 40, 50, 60};
        System.out.println("min of number="+min(arr));
        System.out.println("Max of number="+max(arr));
    }

    static int min(int[] arr) {
        int minimum=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];

            }

        } return minimum;
    }
    static int max(int[] arr) {
        int maximum=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];

            }

        }
        return maximum;
    }
}
