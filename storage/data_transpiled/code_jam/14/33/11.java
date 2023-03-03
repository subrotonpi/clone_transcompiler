static boolean valid ( List < String > list ) throws IOException {
  final Iterator < Integer > iter = xrange ( list . size ( ) - 1 ) . iterator ( ) ;
  for ( int i : xrange ( list . size ( ) - 1 ) ) {
    if ( Math . abs ( list . get ( i ) - list . get ( i + 1 ) ) > 2 ) {
      return false ;
    }
  }
  return true ;
}
