public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) {
        for ( int l = 0 ;
        l < 2 ;
        l ++ ) {
          if ( i * 8 + j * 4 + k * 2 + l * 1 == n ) {
            System . out . println ( i + j + k + l ) ;
            if ( i == 1 ) System . out . println ( i ) ;
            if ( j == 1 ) System . out . println ( j ) ;
            if ( k == 1 ) System . out . println ( k ) ;
            if ( l == 1 ) System . out . println ( l ) ;
          }
        }
      }
    }
  }
}
