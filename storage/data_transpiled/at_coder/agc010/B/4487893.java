public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( args ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) % ( ( 1 + n ) * n / 2 ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    int m = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) / ( ( 1 + n ) * n / 2 ) ;
    int [ ] d = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      d [ i ] = a [ ( i + 1 ) % n ] - a [ i ] - m ;
    }
    for ( int i = 0 ;
    i < d . length ;
    i ++ ) {
      if ( d [ i ] % n > 0 || d [ i ] > 0 ) {
        System . out . println ( "NO" ) ;
        exit ( ) ;
      }
    }
    if ( - Arrays . stream ( d ) . mapToInt ( Integer :: parseInt ) . sum ( ) == n * m ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
