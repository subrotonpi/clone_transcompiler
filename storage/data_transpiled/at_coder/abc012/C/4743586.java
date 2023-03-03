public static int n ( ) {
  int ans = 2025 - n ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( ans % i == 0 && 1 <= ans / i <= 9 ) {
      System . out . println ( i + "x" + ans / i ) ;
    }
  }
  return ans ;
}
