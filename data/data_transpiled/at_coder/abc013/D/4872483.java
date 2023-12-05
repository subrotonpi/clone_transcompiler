public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int [ ] h = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    h [ a [ i ] - 1 ] = h [ a [ i ] ] ;
    h [ a [ i ] - 1 ] = h [ a [ i ] - 1 ] ;
  }
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ h [ i ] ] = i ;
  }
  int [ ] o = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    o [ i ] = i ;
  }
  while ( d > 0 ) {
    if ( d % 2 == 1 ) {
      o = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        o [ i ] = b [ o [ i ] ] ;
      }
      b [ i ] = b [ b [ i ] ] ;
    }
    d >>= 1 ;
  }
  for ( int i : o ) {
    System . out . println ( i + 1 ) ;
  }
}
