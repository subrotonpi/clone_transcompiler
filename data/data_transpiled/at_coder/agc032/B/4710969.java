public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( n * ( n - 2 ) / 2 ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j <= n ;
      j ++ ) {
        if ( i + j != n + 1 ) {
          System . out . println ( i + " " + j ) ;
        }
      }
    }
  }
  else {
    System . out . println ( ( n * ( n - 2 ) + 1 ) / 2 ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j <= n ;
      j ++ ) {
        if ( i + j != n ) {
          System . out . println ( i + " " + j ) ;
        }
      }
    }
  }
  return n ;
}
