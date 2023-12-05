public static void main ( String input , int n , int D ) {
  int [ ] x = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] q = Integer . parseInt ( input ) ;
  int [ ] ind = new int [ n ] ;
  ind [ 0 ] = D ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ind [ i ] = Math . min ( ind [ i ] , Math . abs ( ind [ i ] - x [ i ] ) ) ;
  }
  int [ ] l = new int [ Q ] ;
  l [ 0 ] = 1 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( x [ i ] < 2 * l [ l . length - 1 ] ) {
      l [ i ] = x [ i ] + l [ l . length - 1 ] ;
    }
    else {
      l [ i ] = l [ l . length - 1 ] ;
    }
  }
  Arrays . sort ( l ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    if ( l [ q [ i ] ] <= ind [ q [ i ] - 1 ] ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
