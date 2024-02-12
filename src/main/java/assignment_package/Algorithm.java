package assignment_package;

public class Algorithm {
    public static int getLargest(int arr[], int sz) {       // N = sz
                                                            // *times ran
        int iterate1 = 0;                                   // 1
        int iterate2 = 0;                                   // 1
        int largest = 0;                                    // 1
        while (iterate1 < sz - 1) {                         // N+1
            iterate2++;                                     // N
            if (iterate2 == sz) {                           // N
                iterate1++;                                 // 1
                iterate2 = iterate1;                        // 1
                continue;                                   // 1
            }                                               //
            int product = arr[iterate1] * arr[iterate2];    // N-1
            if (product > largest) largest = product;       // N-1
        }                                                   //
        return largest;                                     // 1
    }                                                       // O(N)
}
