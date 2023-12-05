public static int tests = Integer . parseInt ( input ) {
  String I = "IMPOSSIBLE" ;
  String cols = "ROYGBV" ;
  /*solve the test*/
  List < Integer > c = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    c . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < List < Integer >> s = new ArrayList < > ( ) ;
  s . add ( new ArrayList < > ( ) ) ;
  s . add ( new ArrayList < > ( ) ) ;
  s . add ( new ArrayList < > ( ) ) ;
  s . add ( c . get ( i ) ) ;
  for ( int i = 1 ;
  i < 6 ;
  i += 2 ) {
    while ( s . get ( i ) . size ( ) > 0 ) {
      int op = ( i + 3 ) % 6 ;
      if ( s . get ( op ) . size ( ) < 2 ) {
        if ( Integer . parseInt ( s . get ( op ) ) == 2 && s . get ( op ) . size ( ) == 1 && s . get ( i ) . size ( ) == 1 ) {
          return s . get ( op ) . get ( 0 ) + s . get ( i ) . get ( 0 ) ;
        }
        else {
          return I ;
        }
      }
      int cur = s . get ( op ) . remove ( 0 ) + s . get ( i ) . remove ( 0 ) + s . get ( op ) . remove ( 0 ) ;
      s . get ( op ) . add ( cur ) ;
    }
    List < Integer > base = new ArrayList < > ( s . subList ( 0 , 2 ) ) ;
    System . out . println ( base ) ;
    int n = Integer . parseInt ( base . get ( 0 ) ) ;
    if ( base . get ( 0 ) . size ( ) * 2 > n ) return I ;
    StringBuilder res = new StringBuilder ( n ) ;
    for ( int i = 0 ;
    i < base . get ( 0 ) . size ( ) ;
    i ++ ) {
      res . append ( base . get ( 0 ) . get ( i ) ) ;
    }
    List < Integer > other = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i < base . get ( 1 ) . size ( ) + base . get ( 2 ) . size ( ) ;
    i ++ ) {
      if ( base . get ( 1 + i ) . isEmpty