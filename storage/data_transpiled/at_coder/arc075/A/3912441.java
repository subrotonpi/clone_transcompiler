public static void print ( int n ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( s ) ;
  int t = Arrays . stream ( s ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  if ( t % 10 == 0 ) {
    for ( int v : s ) {
      if ( v % 10 != 0 ) {
        System . out . println ( t - v ) ;
        exit ( ) ;
      }
    }
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( t ) ;
  }
}
