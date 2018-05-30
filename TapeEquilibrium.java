class TapeEquilibrium {
  public int solution(int[] A) {
    // write your code in Java SE 8

    int sumR = 0;
    for (int s=1; s<A.length; s++)
      sumR += A[s];

    int sumL = A[0], minDiff = Math.abs(sumR - sumL);

    for (int i=1; i< A.length-1; i++) {
      sumL += A[i];
      sumR -= A[i];
      minDiff = Math.min(Math.abs(sumR - sumL), minDiff);
    }

    return minDiff;
  }
}
