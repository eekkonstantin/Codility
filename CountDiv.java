class CountDiv {
  public int solution(int A, int B, int K) {
    // write your code in Java SE 8
    int r = 0; // handle zeroes. zero-division counts as 1.
    if (A == 0 || B == 0)
      r++;

    if (B < K) // below min value. nothing divisible.
      return 0 + r;
    if (B == K) // min value, nothing below is divisible
      return 1 + r;

    return B / K - A / K
           + (A % K == 0 ? 1 : 0);
  }
}
