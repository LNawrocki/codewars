package pl.nawrockiit;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a){
        int odd = 0;
        a = Arrays.stream(a).sorted().toArray();
        for (int i = 0 ; i < a.length; i++){
            if (odd != a[i] && odd == 0) {
                odd = a[i];
            } else if (odd == a[i]){
                odd = 0;
            }
        }
      return odd;
    };
}



//public class FindOdd {
//	public static int findIt(int[] A) {
//  	int xor = 0;
//    for (int i = 0; i < A.length; i++) {
//    	xor ^= A[i];
//    }
//    return xor;
//  }
//}
//
//import static java.util.Arrays.stream;
//
//public class FindOdd {
//  public static int findIt(int[] arr) {
//    return stream(arr).reduce(0, (x, y) -> x ^ y);
//  }
//}
//
//
//public class FindOdd {
//	public static int findIt(int[] A) {
//  	int odd=0;
//    for (int item: A)
//      {
//        odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
//      }
//
//    return odd;
//  }
//}
