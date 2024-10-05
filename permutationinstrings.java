class Solution {
  public boolean checkInclusion(String s1, String s2) {
      if (s1.length() > s2.length()) {
          return false;
      }
      int[] s1Freq = new int[26];
      int[] windowFreq = new int[26];
      for (int i = 0; i < s1.length(); i++) {
          s1Freq[s1.charAt(i) - 'a']++;
      }
      for (int i = 0; i < s2.length(); i++) {
          windowFreq[s2.charAt(i) - 'a']++;
          if (i >= s1.length()) {
              windowFreq[s2.charAt(i - s1.length()) - 'a']--;
          }
          if (Arrays.equals(s1Freq, windowFreq)) {
              return true; 
          }
      }
  return false; 
  }
}

