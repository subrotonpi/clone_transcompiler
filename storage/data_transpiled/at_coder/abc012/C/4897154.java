public static int N = Integer . parseInt ( input ) {
  int All = 2025 ;
  int n = All - N ;
  for ( int i = 1 ;
  i <= Math . min ( n , 9 ) ;
  i ++ ) {
    if ( n % i == 0 && n / i <= 9 ) {
      System . out . println ( i + "x" + n / i ) ;
    }
  }
  return n ;
}
