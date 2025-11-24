import java.util.Arrays;
import java.util.Scanner;

public class Search_String {
    public static void main(String[] args) {
        String name="deepanshu";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the letter to be searched:");
        char target=scan.next().charAt(0);
//        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.print(search1(name,target));
    }
    static boolean search1(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }


//    static boolean search(String str,char target){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==target){
//                return true;
//            }
//        }
//        return false;
//
//    }
}

