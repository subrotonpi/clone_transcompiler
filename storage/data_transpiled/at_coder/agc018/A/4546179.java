public static int gcd ( int n , int k ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  /* if (b == 0) return a; return gcd(b, a%b); */
  int num = a [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    num = gcd ( num , a [ i ] ) ;
  }
  if ( k > max ( a ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
    exit ( ) ;
  }
  if ( k % num == 0 ) System . out . println ( "POSSIBLE" ) ;
  else System . out . println ( "IMPOSSIBLE" ) ;
  return num ;
}
