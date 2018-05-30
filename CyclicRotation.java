class CyclicRotation {
  public int[] solution(int[] A, int K) {
    // write your code in Java SE 8

    // find number of *necessary* rotations to do
    if (A.length != 0)
      K %= A.length;
    else // empty array
      K = 0;

    if (K == 0)
      return A;

    int[] n = new int[A.length];
    int i = A.length - K;

    for (int c=0; c<A.length; c++) {
      n[c] = A[i++];
      if (i == A.length) // reached end, reset to 0
        i = 0;
    }

    return n;
  }
}
