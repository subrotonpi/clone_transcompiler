@ VisibleForTesting static int [ ] [ ] combinations ( int n , int m , int p , int q , int r ) {
  int [ ] [ ] c = new int [ m ] [ n ] , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int x = ( i + 1 ) ;
    int y = ( i + 1 ) ;
    int z = ( i + 1 ) ;
    c [ x - 1 ] [ y - 1 ] = z ;
  }
  for ( int i = n ;
  i < p ;
  i ++ ) {
    int [ ] d = new int [ m ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) for ( int k = 0 ;
    k < m ;
    k ++ ) d [ k ] += c [ j ] [ k ] ;
    ans = Math . max ( ans , Arrays . copyOfRange ( d , m - q , d . length ) ) ;
  }
  System . out . println ( ans ) ;
  return c ;
}
