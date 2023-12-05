public static int y ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( y % 4 == 0 ) {
    if ( y % 100 == 0 ) {
      if ( y % 400 == 0 ) {
        System . out . println ( "YES" ) ;
      }
      else {
        System . out . println ( "NO" ) ;
      }
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return y ;
}
