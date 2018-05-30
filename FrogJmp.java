class FrogJmp {
  public int solution(int X, int Y, int D) {
    // write your code in Java SE 8
    int r = Y - X; // distance needed
    return r / D + (r % D > 0 ? 1 : 0); // add extra jump if there's still some space
  }
}
