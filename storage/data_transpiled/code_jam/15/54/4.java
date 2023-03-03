) ) public static String __author__ ( ) {
  "Tianren Liu" ;
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t : xrange ( T ) ) {
    final int P = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final List < Integer > E = Stream . of ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) . collect ( Collectors . toList ( ) ) ;
    final List < Integer > B = new ArrayList < > ( ) ;
    if ( E . get ( 0 ) . intValue ( ) > 1 ) {
      final int fz = E . get ( 0 ) . intValue ( ) ;
      final int len = E . size ( ) ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        B . add ( i ) ;
      }
      while ( fz > 1 ) {
        B . add ( 0 ) ;
        fz = fz / 2 ;
      }
    }
    while ( len > 1 ) {
      final int b = E . get ( 1 ) . intValue ( ) ;
      final List < Integer > Eb = new ArrayList < > ( ) , Es = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        final int e = E . get ( i ) . intValue ( ) ;
        final int f = E . get ( i ) . intValue ( ) ;
        if ( Es . containsKey ( e ) ) {
          f -= Es . get ( e ) ;
        }
        if ( f > 0 ) {
          Eb . add ( new Integer ( e ) ) ;
          if ( Es . containsKey ( e + b ) ) {
            Es . put ( e + b , f ) ;
          }
          else {
            Es . put ( e + b , f ) ;
          }
        }
      }
      B . add ( b ) ;
      E = Eb ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + new String ( B ) ) ;
  }
  return null ;
}
