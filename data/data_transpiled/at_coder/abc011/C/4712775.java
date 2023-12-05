public static void print ( int n ) {
  int [ ] ng = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    ng [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] moves = new int [ 301 ] ;
  for ( int i = 0 ;
  i < 300 ;
  i ++ ) {
    if ( moves [ i ] >= 0 ) {
      for ( int j = 1 ;
      j < 4 ;
      j ++ ) {
        if ( i + j <= 300 && ! ng [ i + j ] ) {
          if ( moves [ i + j ] < 0 ) {
            moves [ i + j ] = moves [ i ] + 1 ;
          }
          else {
            moves [ i + j ] = Math . min ( moves [ i + j ] , moves [ i ] + 1 ) ;
          }
        }
      }
    }
  }
  System . out . println ( 0 <= moves [ n ] && n <= 100 ? "YES" : "NO" ) ;
}
