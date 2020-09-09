class Solution {
    public int[] plusOne(int[] digits) {
        //从最后一位开始,连续0个9
        int n = 0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
                n++;
            }else{
                digits[i]= digits[i]+1;
                break;
            }
        }
        if(n==digits.length){
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            for(int j=1;j<arr.length-1;j++){
                arr[j]=0;
            }
            return arr;
        }
        return digits;
    }
}