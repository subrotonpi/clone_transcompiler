public static void main ( String input ) {
  map . get ( input ) ;
  n = input . length ( ) ;
  m = input . length ( ) ;
  v = new int [ n ] ;
  d = new int [ 1 << n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    s = input . charAt ( i ) ;
    g = input . charAt ( i + 1 ) ;
    v [ s - 1 ] += 1 << g - 1 ;
  }
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) d [ i | 1 << j ] += d [ i ] * ( ( i & 1 << j ) + ( i & v [ j ] ) < 1 ) ;
  System . out . println ( d [ d . length - 2 ] ) ;
}
