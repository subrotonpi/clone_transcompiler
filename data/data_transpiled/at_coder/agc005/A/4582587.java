public static void print ( List < String > x ) {
  String s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'T' && x . size ( ) != 0 && x . get ( x . size ( ) - 1 ) == 'S' ) x . remove ( x . size ( ) - 1 ) ;
    else x . add ( s . charAt ( i ) ) ;
  }
  System . out . println ( x . size ( ) ) ;
}
