@ VisibleForTesting static LinkedHashMap < Integer , Integer > dd ( int n ) {
  Function < Integer , Integer > tri = n -> ( n * ( n + 1 ) ) / 2 ;
  HashMap < Integer , Integer > sigs = new HashMap < > ( ) ;
  for ( int n : xrange ( 1 , 2000000 + 1 ) ) {
    String s = Integer . toString ( n ) ;
    ArrayList < Integer > rots = new ArrayList < > ( ) ;
    for ( int b : xrange ( s . length ( ) ) ) {
      rots . add ( s . substring ( b ) + s . substring ( 0 , b ) ) ;
    }
    Collections . sort ( rots ) ;
    sigs . put ( n , rots . get ( 0 ) ) ;
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    int A = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int B = Integer . parseInt ( scanner . nextLine ( ) ) ;
    HashMap < Integer , Integer > sigc = new LinkedHashMap < > ( ) ;
    for ( int n : xrange ( A , B + 1 ) ) {
      sigc . put ( sigs . get ( n ) , 1 ) ;
    }
    int count = sigc . values ( ) . stream ( ) . reduce ( tri , ( v - 1 ) -> v * ( v - 1 ) ) ;
    System . out . println ( String . format ( "Case #%s: %s" , t , count ) ) ;
  }
  return sigs ;
}
