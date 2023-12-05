public static void mod ( int mod , int [ ] [ ] n ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  float inf = Float . POSITIVE_INFINITY ;
  float [ ] [ ] G = new float [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) G [ i ] [ i ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ x - 1 ] [ y - 1 ] = 1 ;
    G [ y - 1 ] [ x - 1 ] = 1 ;
  }
  /* wf(G) */
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( G [ a - 1 ] [ j ] != i ) continue ;
        for ( int k = 0 ;
        k < n ;
        k ++ ) {
          if ( G [ a - 1 ] [ k ] == i + 1 && G [ j ] [ k ] == 1 ) dp [ k ] = ( dp [ j ] + dp [ k ] ) % mod ;
        }
      }
    }
  }
  System . out . println ( dp [ b - 1 ] ) ;
}
