public static int N = Integer . parseInt ( input ) {
  int digit_sum = 9 * 10 ;
  int min = 0 ;
  while ( n > 0 ) {
    min += n % 10 ;
    n /= 10 ;
  }
  return min ;
}
