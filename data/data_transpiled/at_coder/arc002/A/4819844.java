public static int y ( ) {
  int y = input . nextInt ( ) ;
  if ( y % 4 == 0 && y % 100 == 0 && y % 400 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else if ( y % 4 == 0 && y % 100 == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else if ( y % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return y ;
}
