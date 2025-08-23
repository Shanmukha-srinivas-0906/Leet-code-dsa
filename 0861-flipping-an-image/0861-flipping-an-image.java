class Solution {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end]^1;
            arr[end] = temp^1;
            start++;
            end--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        // int[][] res  = new int[image.length][image[0].length];
        for(int i = 0;i<image.length;i++){
            reverse(image[i]);
        }
        return image;

    }
}