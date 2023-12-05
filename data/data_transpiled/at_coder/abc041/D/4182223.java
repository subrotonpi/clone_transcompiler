public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] v = new int [ n ] ;
  int [ ] d = new int [ 1 << n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = i ;
    int g = i + 1 ;
    v [ s - 1 ] += 1 << g - 1 ;
  }
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) d [ i | 1 << j ] += d [ i ] * ( ( i & 1 << j ) + ( i & v [ j ] ) < 1 ) ;
  System . out . println ( d [ d . length - 2 ] ) ;
}
