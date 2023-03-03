static final int [ ] getDepth ( ) {
  System . setProperty ( "java.awt.headless" , "true" ) ;
  final int HUGE = 2147483647 ;
  final int HUGEL = 9223372036854775807 ;
  final String ABC = "abcdefghijklmnopqrstuvwxyz" ;
  class Node {
    int [ ] children0 = new int [ N ] ;
    int [ ] parent0 = new int [ N ] ;
    int depth = - 1 ;
    @ Override public int getDepth ( ) {
      if ( depth == - 1 ) {
        List < Integer > childdepths = new ArrayList < Integer > ( ) ;
        for ( int ch0 : children0 ) {
          childdepths . add ( nodes [ ch0 ] . getDepth ( ) ) ;
        }
      }
      return depth ;
    }
  }
  return null ;
}
