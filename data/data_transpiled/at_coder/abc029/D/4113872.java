public static int N ( ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= Integer . SIZE ;
  i ++ ) {
    ans += ( N / ( 10 * * i ) ) * ( 10 * * ( i - 1 ) ) ;
    int b = N % ( 10 * * i ) ;
    if ( b != 0 ) {
      if ( b >= 2 * 10 * * ( i - 1 ) ) ans += 10 * * ( i - 1 ) ;
      else if ( b >= 10 * * ( i - 1 ) ) ans += b % ( 10 * * ( i - 1 ) ) + 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
