public static int n = Integer . parseInt ( input ) {
  final int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  Arrays . sort ( s ) ;
  final int ans = Arrays . stream ( s ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  if ( ans % 10 > 0 ) {
    System . out . println ( ans ) ;
  }
  else {
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      if ( s [ i ] % 10 > 0 ) {
        System . out . println ( ans - s [ i ] ) ;
        exit ( ) ;
      }
    }
    System . out . println ( 0 ) ;
  }
  return ans ;
}
