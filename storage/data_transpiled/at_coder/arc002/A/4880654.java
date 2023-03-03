private static int y = Integer . parseInt ( input ) {
  if ( y % 400 == 0 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  else if ( y % 100 == 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  else if ( y % 4 == 0 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return y ;
}
