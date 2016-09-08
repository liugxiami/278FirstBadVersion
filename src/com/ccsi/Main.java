package com.ccsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
//You are a product manager and currently leading a team to develop a new product.
//Unfortunately, the latest version of your product fails the quality check.
//Since each version is developed based on the previous version,all the versions after
//a bad version are also bad.
class Solution extends VersionControl{
    //1.loop
    public int firstBadVersion1(int n){
        if(n<=1) return 1;
        int li=1,hi=n;
        while(li<=hi){
            int mi=(li+hi)/2;
            if(isBadVersion(mi)) hi=mi-1;
            else li=mi+1;
        }
        return li;
    }
    //2.recursion
    public int firstBadVersion2(int n){
        return bs(1,n);
    }
    public int bs(int low,int high){
        if(low>high) return low;
        int mid=low+(high-low)/2;
        if(isBadVersion(mid)) return bs(low,mid-1);
        else return bs(mid+1,high);
    }
}
class VersionControl{
    public static boolean isBadVersion(int version){
        return true;
    }
}