public static int solveN ( int n ) {
  int [ ] digits = ArrayUtil . toIntArray ( String . valueOf ( n ) ) ;
  return solve ( digits ) ;
  /*for (int i = 0; i < digits.length-1; i++) {
  int a = digits[i];
  int b = digits[i+1];
  if (a>b) {
  assert digits[i] > 0;
  digits[i] --;
  for (int j = i+1; j < digits.length; j++) {
  digits[j] = 9;
  }
  }
  }*/
}
