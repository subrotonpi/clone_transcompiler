public static void print ( int n ) {
  int [ ] s = new int [ n ] ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    boolean match = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i + j < n ) {
        if ( s [ i + j ] != t [ j ] ) {
          match = false ;
        }
      }
    }
    if ( match ) {
      if ( i == 0 ) {
        System . out . println ( n ) ;
      }
      else {
        System . out . println ( n + i ) ;
      }
      break ;
    }
  }
  else {
    System . out . println ( n * 2 ) ;
  }
}
