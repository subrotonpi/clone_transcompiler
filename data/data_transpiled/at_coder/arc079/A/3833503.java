public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  ArrayList < String > a = new ArrayList < String > ( ) ;
  ArrayList < String > b = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    String ai = input . substring ( 0 , i ) ;
    String bi = input . substring ( i + 1 , i ) ;
    if ( ai . equals ( "1" ) ) {
      a . add ( bi ) ;
    }
    if ( bi . equals ( N . toString ( ) ) ) {
      b . add ( ai ) ;
    }
  }
  if ( new HashSet < String > ( a ) . size ( ) & new HashSet < String > ( b ) . size ( ) > 0 ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
}
