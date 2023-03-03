private static int doCalc ( int numEngine , String [ ] query ) {
  int change = 0 ;
  BitSet flags = new BitSet ( numEngine ) ;
  for ( String q : query ) {
    flags . set ( q ) ;
    if ( flags . cardinality ( ) == 0 ) {
      flags . clear ( ) ;
      flags . set ( q ) ;
      change ++ ;
    }
  }
  /* main program */
  for ( int c = 0 ;
  c < input . nextInt ( ) ;
  c ++ ) {
    HashMap < String , Integer > dicEngine = new HashMap < > ( ) ;
    String [ ] query = new String [ numEngine ] ;
    int numEngine = input . nextInt ( ) ;
    for ( int i = 0 ;
    i < numEngine ;
    i ++ ) {
      String tmpStr = input . next ( ) ;
      dicEngine . put ( tmpStr , i ) ;
    }
    int numQuery = input . nextInt ( ) ;
    for ( int i = 0 ;
    i < numQuery ;
    i ++ ) {
      String strQuery = input . next ( ) ;
      query [ i ] = dicEngine . get ( strQuery ) ;
    }
    change = doCalc ( numEngine , query ) ;
    System . out . println ( "Case #" + ( c + 1 ) + ": " + change ) ;
  }
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    System . out . println ( "Scanner is not available" ) ;
  }
  return change ;
}
