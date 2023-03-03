public static int [ ] [ ] map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] d = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    d [ a - 1 ] [ b - 1 ] = b - 1 ;
    d [ b - 1 ] [ a - 1 ] = a - 1 ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int h = 0 ;
      h < n ;
      h ++ ) {
        if ( i != j ) {
          if ( ! d [ i ] [ j ] . equals ( d [ i ] [ h ] ) ) {
            if ( d [ i ] [ h ] . equals ( d [ h ] [ h ] ) ) {
              c ++ ;
              break ;
            }
          }
        }
      }
    }
  }
  else {
    System . out . println ( c ) ;
    c = 0 ;
  }
  return d ;
}
