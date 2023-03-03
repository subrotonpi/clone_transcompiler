public static final Function I = new Function ( ) {
  int i , j ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ n ] ;
  int [ ] d = new int [ 2 * n ] ;
  for ( ;
  i < m ;
  i ++ ) {
    v [ s ] = i ;
  }
  for ( ;
  i < m ;
  i ++ ) {
    int g = i ;
    int g = i + 1 ;
    int j = i + 1 ;
    v [ s ] = g ;
    v [ s ] |= 1 << g - 1 ;
  }
  for ( ;
  i < m ;
  i ++ ) {
    int i = i + 1 ;
    int j = i + 1 ;
    d [ i ] = i * ( i & ( 1 << j | v [ j ] ) < 1 ) ;
  }
  System . out . println ( d [ d . length - 2 ] ) ;
}
