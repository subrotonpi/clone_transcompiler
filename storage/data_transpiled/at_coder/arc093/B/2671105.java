public static int [ ] [ ] scan ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int aLine = ( A - 1 ) / 50 + 1 ;
  int bLine = ( B - 1 ) / 50 + 1 ;
  System . out . println ( 2 * aLine + 2 * bLine + 99 ) ;
  for ( int i = 0 ;
  i < aLine ;
  i ++ ) {
    if ( i == aLine - 1 ) {
      System . out . println ( ( ".#" + ( ( A - 1 ) % 50 ) + "#" + ( 99 - 2 * ( ( A - 1 ) % 50 ) ) ) ) ;
    }
    else {
      System . out . println ( ( ".#" + 49 ) + "." ) ;
    }
    System . out . println ( "#" ) ;
  }
  for ( int i = 0 ;
  i < bLine ;
  i ++ ) {
    System . out . println ( "." + 99 ) ;
    if ( i == bLine - 1 ) {
      System . out . println ( ( "#." + ( ( B - 1 ) % 50 ) + "." + ( 99 - 2 * ( ( B - 1 ) % 50 ) ) ) ) ;
    }
    else {
      System . out . println ( ( "#." + 49 ) + "#" ) ;
    }
  }
  return new int [ ] [ ] {
    {
      A , B }
      , {
        A , B }
      }
      ;
    }
    