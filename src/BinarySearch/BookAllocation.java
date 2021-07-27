package BinarySearch;

public class BookAllocation {
    public static boolean canReadAll(int[] pages,int maxC,int numStudents) {
        int studentNo = 1;
        int pageRead=0;
        int i=0;
        while(i<pages.length){
            if(studentNo>numStudents){
                return false;
            }
            if (pageRead+pages[i]<=maxC){
                pageRead+=pages[i];
                i++;
            }else{
                studentNo++;
                pageRead=0;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40};
        int n=arr.length;
        int l=0;
        int r= 100;
        while(r>l+1){
            int mid = (l+r)/2; //maxC
            if(canReadAll(arr,mid,2)){
                r=mid;
            }else{
                l=mid;
            }

        }
        System.out.println(r);

    }
}
