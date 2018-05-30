class FrogRiverOne {
  public int solution(int X, int[] A) {
    // write your code in Java SE 8

    if (X > A.length)
      return -1;

    boolean[] b = new boolean[X + 1]; // redundant 0.

    for (int i=0; i<A.length; i++) {
      int pos = A[i];
      if (!b[pos]) {
        b[pos] = true;
        X--;
        if (X == 0) // all steps done.
          return i;
      }
    }

    return -1;
  }
}
