class Solution {
  int[] counters;

  public int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int[] counters = new int[N];

    int max = 0, min = 0, t = 0;

    for (int i=0; i<A.length; i++) {
      if (A[i] <= N) { // INC
        int m = A[i] - 1; // index of counter to modify
        if (counters[m] < min) // check if last `max_counter` was applied
          counters[m] = min;
        t = ++counters[m];
        max = Math.max(t, max); // constantly update the highest value
      } else // MAX
        min = max;
    }

    for (int x=0; x<N; x++) {
      if (counters[x] < min) // last max_counter was not applied
        counters[x] = min;
    }
    return counters;
  }
}
