public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  ArrayList < ArrayList < Integer >> ar = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < l . size ( ) ;
    j ++ ) {
      l . add ( Integer . parseInt ( input ) ) ;
    }
    ar . get ( l . get ( 0 ) ) . add ( l . get ( 1 ) ) ;
  }
  for ( int r : ar . get ( 1 ) ) {
    if ( ar . get ( r ) . contains ( a ) ) {
      System . out . println ( "POSSIBLE" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "IMPOSSIBLE" ) ;
}
