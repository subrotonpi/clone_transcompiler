public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Integer . parseInt ( input . readLine ( ) ) - 1 ;
  int MOD = 10 * 9 + 7 ;
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 1 ;
  boolean [ ] k = new boolean [ m ] ;
  int [ ] L = new int [ n ] ;
  int r = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n && ! k [ f [ r ] ] ) {
      k [ f [ r ] ] = true ;
      L [ r ] += l ;
    }
    if ( l == r ) r ++ ;
    else k [ f [ l ] ] = false ;
  }
  int s = 0 ;
  r = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = ( s + dp [ i ] ) % MOD ;
    while ( r < L [ i ] ) {
      s = ( s - dp [ r ] ) % MOD ;
      r ++ ;
    }
    dp [ i + 1 ] = s % MOD ;
  }
  System . out . println ( dp [ dp . length - 1 ] ) ;
}
