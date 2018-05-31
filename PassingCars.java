class PassingCars {
  static final int MAX = 1000000000;

  public int solution(int[] A) {
    // write your code in Java SE 8
    if (A.length < 2)
      return 0;

    int same = 1, r = 0, first = 0;
    // first pair is counted only when `0` first occurs.
    while (first < A.length && A[first] != 0)
      first++;

    // end if first `0` only appears at the end of array.
    if (++first == A.length)
      return 0;

    for (int i=first; i<A.length; i++) {
      if (A[i] != 0)
        r += same;
      else
        same++;
      if (r > MAX || same > MAX)
        return -1;
    }

    return (r > MAX ? -1 : r);
  }
}
