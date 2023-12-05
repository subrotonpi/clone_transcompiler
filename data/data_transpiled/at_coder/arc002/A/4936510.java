public static void main ( String input ) {
  int s = Integer . parseInt ( input ) ;
  if ( s % 4 != 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    if ( s % 400 == 0 ) {
      System . out . println ( "YES" ) ;
    }
    else if ( s % 100 == 0 ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
}
