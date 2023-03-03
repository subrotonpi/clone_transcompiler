public static void input ( Scanner s ) {
  int x = s . nextInt ( ) ;
  if ( x % 2 == 1 ) {
    String a = s . substring ( 0 , x / 2 ) ;
    String b = s . substring ( x / 2 + 1 ) . substring ( 0 , s . length ( ) - 1 ) ;
    if ( a . equals ( b ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  else {
    String a = s . substring ( 0 , x / 2 ) ;
    String b = s . substring ( x / 2 ) . substring ( 0 , s . length ( ) - 1 ) ;
    if ( a . equals ( b ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
