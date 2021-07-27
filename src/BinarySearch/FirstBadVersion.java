package BinarySearch;

public class FirstBadVersion{
    public static boolean utilIsBad(char versions) {
        if(versions=='B'){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        char[] versions = {'G','B','B','B','B'};
        int n = versions.length;
        int l=-1,r=n-1;
        while(r>l+1){
            int mid = (l+r)/2;
            if(utilIsBad(versions[mid])){
                r=mid;
            }
            else{
                l=mid;
            }
        }
        System.out.println(r);

    }
        }
