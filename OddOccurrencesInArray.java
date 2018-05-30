import java.util.*;

class OddOccurrencesInArray {
  public int solution(int[] A) {
    // write your code in Java SE 8
    Arrays.sort(A);

    if (A.length == 1)
      return A[0];

    int i=0;
    while (i < A.length-1) {
      if (A[i] == A[i+1])
        i += 2;
      else
        return A[i];
    }

    // all checked. return last value.
    return A[A.length-1];
  }
}
