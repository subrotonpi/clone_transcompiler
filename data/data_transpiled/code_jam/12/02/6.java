public static final void main ( String [ ] args ) throws IOException {
  if ( args . length == 0 ) {
    int T = Integer . parseInt ( args [ 0 ] ) ;
    for ( int i : xrange ( T ) ) {
      List < Integer > values = map . get ( args [ i ] ) ;
      int _N = values . get ( 0 ) ;
      int S = values . get ( 1 ) ;
      int p = values . get ( 2 ) ;
      List < Integer > t = values . subList ( 3 , values . size ( ) ) ;
      int minNormal = p + 2 * Math . max ( 0 , p - 1 ) ;
      int minSurprising = p + 2 * Math . max ( 0 , p - 2 ) ;
      int cnNormal = Stream . of ( t ) . filter ( x -> x >= minNormal ) . count ( ) ;
      int cnSurprising = Stream . of ( t ) . filter ( x -> x >= minSurprising ) . count ( ) - cnNormal ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( cnNormal + min ( cnSurprising , S ) ) ) ;
    }
  }
}
