public static int Q = Integer . parseInt ( input ) {
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < 2 * N - 1 ;
    i ++ ) {
      List < Integer > x = map . get ( ( input . nextLine ( ) ) ) ;
      for ( int num : x ) {
        map . put ( num , map . getOrDefault ( num , 0 ) + 1 ) ;
      }
    }
    List < String > res = new ArrayList < > ( ) ;
    for ( String key : map . keySet ( ) ) {
      if ( map . get ( key ) % 2 == 1 ) {
        res . add ( key ) ;
      }
    }
    Collections . sort ( res ) ;
    for ( int i = 0 ;
    i < res . size ( ) ;
    i ++ ) {
      res . set ( i , String . valueOf ( res . get ( i ) ) ) ;
    }
    System . out . println ( "Case #" + ( q + 1 ) + ": " + res ) ;
  }
  return Q ;
}
