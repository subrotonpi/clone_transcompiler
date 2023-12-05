static void print ( int n , int t ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = t ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] - a [ i - 1 ] < t ) res += a [ i ] - a [ i - 1 ] ;
    else res += t ;
  }
  System . out . println ( res ) ;
}
