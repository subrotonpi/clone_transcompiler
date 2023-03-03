public static int n ( Scanner input ) {
  int m = input . nextInt ( ) ;
  int e [ ] [ ] = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    int c = input . nextInt ( ) ;
    e [ i ] [ a - 1 ] = input . nextInt ( ) ;
    e [ i ] [ b - 1 ] = input . nextInt ( ) ;
    e [ i ] [ c - 1 ] = input . nextInt ( ) ;
  }
  int M = 10 * 18 ;
  int d [ ] = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    d [ i ] = 0 ;
  }
  int k = 0 ;
  int v = 0 ;
  while ( k < n * 2 ) {
    k ++ ;
    if ( k == n ) v = d [ d . length - 1 ] ;
    boolean f = false ;
    for ( int a = 0 ;
    a < e . length ;
    a ++ ) {
      if ( d [ b ] > d [ a ] + c ) {
        d [ b ] = d [ a ] + c ;
        f = true ;
      }
    }
    if ( ! f ) break ;
  }
  if ( v == 0 || v == d [ d . length - 1 ] ) System . out . println ( - d [ d . length - 1 ] ) ;
  else System . out . println ( "inf" ) ;
  return v ;
}
