package pl.nawrockiit;

public class Sum {

    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int sum =0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }
}

//public class Sum
//{
//  public int GetSum(int a, int b)
//  {
//    return (a + b) * (Math.abs(a - b) + 1) / 2;
//  }
//}

//  public class Sum
//  {
//     public int GetSum(int smaller, int bigger)
//     {
//        if(bigger<smaller) {
//          return GetSum(bigger,smaller);
//        }
//        else
//        {
//          /* use Euler's formula to sum up all numbers from 0 to bigger
//          /  and subtract the sum of numbers from 0 to smaller (exclusive)
//          */
//          return (bigger+smaller)*(bigger-smaller+1)/2;
//        }
//     }
//  }
