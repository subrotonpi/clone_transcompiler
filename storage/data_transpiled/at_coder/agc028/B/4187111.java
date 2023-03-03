public static long power ( long a , long b ) {
  if ( b == 0 ) {
    return 1 ;
  }
  else if ( b == 1 ) {
    return a % 1000000007 ;
  }
  else if ( b % 2 == 0 ) {
    return ( power ( a , b / 2 ) * 2 ) % 1000000007 ;
  }
  else {
    return ( power ( a , b / 2 ) * 2 * a ) % 1000000007 ;
  }
  /*divide(a, b)*/
  {
    return ( a * power ( b , 1000000005 ) ) % 1000000007 ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int fac_lim = N ;
  long [ ] fac = new long [ fac_lim + 1 ] ;
  fac [ 0 ] = 0L ;
  for ( int i = 0 ;
  i < fac_lim ;
  i ++ ) {
    fac [ i + 1 ] = fac [ i ] * ( i + 1 ) ;
    fac [ i + 1 ] = fac [ i + 1 ] % 1000000007 ;
  }
  long [ ] fs = new long [ N + 1 ] ;
  fs [ 1 ] = fac [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    fs [ i + 1 ] = fs [ i ] + divide ( fs [ i ] , i + 1 ) ;
    fs [ i + 1 ] %= 1000000007 ;
  }
  long [ ] A = new long [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Long . parseLong ( input ( ) ) ;
  }
  long ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += ( fs [ i + 1 ] + fs [ N - i ] - fs [ 1 ] ) * A [ i ] ;
    ans %= 1000000007 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
