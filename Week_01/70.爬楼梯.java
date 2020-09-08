class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        //n为奇数
        //分为3条大路线，以9为例：4+1+4；4+5；5+4
        if(n%2==1){
            int m = (n+1)/2 ;
            return climbStairs(m-1)*(climbStairs(m-1)+2*(climbStairs(m)-climbStairs(m-1)));
        }
        //n为偶数
        //递归计算
        else{
            return climbStairs(n-2)+climbStairs(n-1);
        }

    }
}