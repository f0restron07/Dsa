public class Binaryseach {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,62,99,100,1200,1234};
        int target=1200;
        int ans=binary(arr,target);
        System.out.println(ans);
    }

    //return the index'
    //return -1 if ele not present
    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find middle element
            int mid=start+(end-start) /2;//might be possibele that start+end thing we are doing exceeds the range of numbers range in java
            if(target< arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }return -1;
    }
}
