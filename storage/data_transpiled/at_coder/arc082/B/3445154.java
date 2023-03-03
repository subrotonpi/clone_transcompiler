public static void print ( int n ) {
  int [ ] p = new int [ n ] ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    p [ 0 ] = Integer . parseInt ( s ) ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i + 1 == p [ i ] ) {
      cnt ++ ;
      if ( i == 0 ) {
        p [ i ] = p [ i + 1 ] ;
      }
      else if ( i == n - 1 ) {
        p [ i - 1 ] = p [ i ] ;
      }
      else if ( i + 2 == p [ i + 1 ] ) {
        p [ i ] = p [ i + 1 ] ;
      }
      else if ( i + 1 != p [ i - 1 ] && i != p [ i ] ) {
        p [ i - 1 ] = p [ i ] ;
      }
      else {
        p [ i ] = p [ i + 1 ] ;
      }
    }
  }
  System . out . println ( cnt ) ;
}
