public static void input ( String s ) {
  if ( s . length ( ) % 2 == 1 ) {
    s = s . substring ( 0 , s . length ( ) - 1 ) ;
  }
  else {
    s = s . substring ( 0 , s . length ( ) - 2 ) ;
  }
  int x = ( int ) ( s . length ( ) / 2 ) ;
  if ( s . length ( ) == x ) {
    System . out . println ( 2 * x ) ;
  }
  else {
    while ( s . length ( ) != x ) {
      s = s . substring ( 0 , x ) ;
      x -- ;
    }
    System . out . println ( 2 * x ) ;
  }
}
