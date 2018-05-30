import java.util.*;

class MissingInteger {
  public int solution(int[] A) {
    // write your code in Java SE 8
    HashSet<Integer> hs = new HashSet<>();

    int lowest = 1;
    for (int i=0; i<A.length; i++) {
      if (A[i] >= 0 && !hs.contains(A[i])) {
        // key not in map.
        hs.add(A[i]);
        while (hs.contains(lowest)) {
          lowest++;
        }
      }
    }

    return lowest;
  }
}
