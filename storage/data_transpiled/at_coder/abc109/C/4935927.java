public static int N ( int N , int X ) {
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( x ) ;
  /* if (b == 0) return a; return gcd(b, a%b); */
  int [ ] diff = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) diff [ i ] = x [ i + 1 ] - x [ i ] ;
  if ( diff . length == 1 ) {
    System . out . println ( diff [ 0 ] ) ;
    exit ( ) ;
  }
  int ans = gcd ( diff [ 0 ] , diff [ 1 ] ) ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) ans = gcd ( ans , diff [ i ] ) ;
  return ans ;
}
