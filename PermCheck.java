import java.util.*;

class PermCheck {
  public int solution(int[] A) {
    // write your code in Java SE 8
    if (A.length == 1)
      return (A[0] == 1 ? 1 : 0);

    HashSet<Integer> hs = new HashSet<>();

    int missing = 1;

    for (int i=0; i<A.length; i++) {
      if (hs.contains(A[i])) // multiple!!
        return 0;
      else {
        hs.add(A[i]);
        while (hs.contains(missing))
          missing++;
      }
    }

    return (missing > A.length ? 1 : 0);
  }
}
