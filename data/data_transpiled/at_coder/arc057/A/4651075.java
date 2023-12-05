public static int A ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = 2 * 10 * 12 ;
  int ans = 0 ;
  if ( K == 0 ) {
    ans = X - A ;
  }
  else {
    while ( A < X ) {
      A ++ + K * A ;
      ans ++ ;
    }
  }
  return ans ;
}
