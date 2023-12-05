public static final Function I = new Function ( ) {
  int i ;
  int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  int v [ ] = new int [ n ] ;
  int d [ ] = new int [ 1 << n ] ;
  for ( ;
  i < m ;
  i ++ ) {
    int s = input . nextInt ( ) ;
    int g = input . nextInt ( ) ;
    v [ s - 1 ] += 1 << g - 1 ;
  }
  for ( int i = 1 ;
  i < 1 << n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( i & 1 << j ) + ( i & v [ j ] ) < 1 ) d [ i | 1 << j ] += d [ i ] ;
    }
  }
  System . out . println ( d [ d . length - 2 ] ) ;
}
