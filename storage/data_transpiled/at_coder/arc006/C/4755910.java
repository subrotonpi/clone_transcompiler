public static void print ( int n ) {
  int [ ] L = new int [ n ] ;
  L [ 0 ] = Integer . parseInt ( input ) ;
  int l = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int w = Integer . parseInt ( input ) ;
    if ( w > L [ L . length - 1 ] ) {
      L [ l ] = w ;
      l ++ ;
    }
    else {
      for ( int j = 0 ;
      j < l ;
      j ++ ) {
        if ( w <= L [ j ] ) {
          L [ j ] = w ;
          break ;
        }
      }
    }
  }
  System . out . println ( l ) ;
}
