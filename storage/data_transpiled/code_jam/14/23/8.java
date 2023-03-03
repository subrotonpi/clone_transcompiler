@ VisibleForTesting static boolean isPossible ( List < Integer > order ) {
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  return order . stream ( ) . allMatch ( possible ( order ) -> {
    Stack < Integer > stack = new Stack < > ( ) ;
    stack . add ( order . get ( 0 ) ) ;
    for ( int u = 1 ;
    u < order . size ( ) ;
    u ++ ) {
      while ( ! edges . get ( stack . peek ( ) ) . equals ( edges . get ( stack . peek ( ) ) ) ) {
        stack . pop ( ) ;
        if ( stack . size ( ) == 0 ) {
          return false ;
        }
      }
      stack . push ( u ) ;
    }
    return true ;
  }
  ) ;
}
