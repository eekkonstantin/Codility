class BinaryGap {
  public int solution(int N) {
    // write your code in Java SE 8
    String item = Integer.toBinaryString(N);

    if (item.length() < 3) // need at least 3 chars to have any gap.
      return 0;

    // last "1" is superfluous
    if (!item.endsWith("1"))
      item = item.substring(0, item.lastIndexOf("1")); // remove trailing zeroes

    int longest = 0, i = 0;
    boolean inSeq = false;

    while (i > -1 && i < item.length()) {
      if (item.charAt(i) != '0') {
        inSeq = false;
        i = item.indexOf("0", i); // jump `i` to next 0 from current `i`
      } else {
        if (longest == 0) longest++;
        if (!inSeq) {
          // check if match
          if (item.startsWith(repeat("0", longest), i)) {
            // jump by that amount
            i += longest;
            inSeq = true;
            continue;
          } else { // find next 1
            i = item.indexOf("1", i);
            continue;
          }
        } else longest++;
        i++;
      }
    }
    return longest;
  }

  public static String repeat(String s, int n) {
    return new String(new char[n]).replace("\0", s);
  }
}
