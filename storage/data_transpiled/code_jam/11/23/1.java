static boolean verify ( Set < String > a , Set < String > b ) {
  final int cc = new HashSet < String > ( b ) . size ( ) ;
  for ( String s : a ) {
    if ( new HashSet < String > ( b ) . size ( ) != cc ) {
      return false ;
    }
  }
  return true ;
}
