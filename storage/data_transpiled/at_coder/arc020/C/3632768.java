static final long doubling ( long n , long x , long mod ) {
  long ans = 0 , exponent = Long . SIZE ;
  while ( x > 0 ) {
    if ( ( x & 1 ) != 0 ) {
      ans = ( ans * Math . pow ( 10 , exponent , mod ) + n ) % mod ;
    }
    n = ( n * Math . pow ( 10 , exponent , mod ) + n ) % mod ;
    exponent *= 2 ;
    x >>= 1 ;
  }
  return ans ;
  if ( getClass ( ) . isPrimitive ( ) ) {
    int N = Integer . parseInt ( input ( ) ) ;
    List < List < Long >> a = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      a . add ( Collections . singletonList ( Long . parseLong ( input ( ) ) ) ) ;
    }
    int mod = Integer . parseInt ( input ( ) ) ;
    ans = 0 ;
    for ( int i = 0 ;
    i < a . size ( ) ;
    i ++ ) {
      long n = a . get ( i ) ;
      long repeat = n / mod ;
      ans = ( ans * Math . pow ( 10 * a . get ( i ) . longValue ( ) , repeat , mod ) + doubling ( n , repeat , mod ) ) % mod ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
