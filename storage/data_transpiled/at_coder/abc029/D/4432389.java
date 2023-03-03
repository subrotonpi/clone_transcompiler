public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    int A = ( N / ( 10 * * ( i ) ) ) ;
    if ( ( A ) % 10 == 1 ) {
      ans += ( A / 10 ) * ( 10 * * i ) ;
      ans += ( N % ( 10 * * ( i ) ) + 1 ) ;
    }
    else if ( A % 10 > 1 ) {
      ans += ( A / 10 ) * ( 10 * * i ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
