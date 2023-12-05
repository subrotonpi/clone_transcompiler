static private long doubling ( long n , long x , long mod ) {
  final long ans = 0 , exponent = Long . SIZE ;
  for ( int i = Integer . numberOfLeadingZeros ( x ) ;
  i > 1 ;
  i -- ) {
    if ( "1" . equals ( x ) ) {
      ans = ( ans * Math . pow ( 10 , exponent , mod ) + n ) % mod ;
    }
    n = ( n * Math . pow ( 10 , exponent , mod ) + n ) % mod ;
    exponent *= 2 ;
  }
  return ans ;
  if ( getClass ( ) . isEnum ( ) ) {
    final int N = Integer . parseInt ( input ( ) ) ;
    final List < List < Long >> a = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      a . add ( Collections . singletonList ( Long . parseLong ( input ( ) ) ) ) ;
    }
    final long mod = Long . parseLong ( input ( ) ) ;
    ans = 0 ;
    for ( int i = 0 ;
    i < a . size ( ) ;
    i ++ ) {
      long n = a . get ( i ) ;
      final List < Long > repeat = a . get ( i ) ;
      ans = ( ans * Math . pow ( 10 * Long . SIZE , repeat . size ( ) ) + doubling ( n , repeat . size ( ) , mod ) ) % mod ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
