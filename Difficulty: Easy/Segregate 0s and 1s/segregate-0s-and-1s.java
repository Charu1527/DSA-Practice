class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int Countzero=0;;
        int Countone=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                Countzero++;
                
            }else if (arr[i]==1) {
                Countone++;
                
            }
        }
        int i=0;
        while(Countzero>0){
            arr[i]=0;
            i++;
            Countzero--;
        }
        while(Countone>0){
            arr[i]=1;
            i++;
            Countone--;
        }
    }
}
