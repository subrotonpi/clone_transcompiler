public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  /* int digit = String.valueOf(n).length(); int[][] dp = new int[digit+1][2]; dp[0][0]=1; for d in range digit */
  for ( int d = 0 ;
  d < digit ;
  d ++ ) {
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      int t ;
      if ( i == 1 ) t = 9 ;
      else t = Integer . parseInt ( String . valueOf ( n ) . charAt ( d ) ) ;
      for ( int j = 0 ;
      j < t ;
      j ++ ) {
        if ( j != 4 && j != 9 ) dp [ d + 1 ] [ i ] = j - t ;
      }
    }
  }
  return B - A - B ;
}
