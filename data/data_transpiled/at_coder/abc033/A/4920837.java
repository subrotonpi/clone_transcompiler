public static boolean password ( @ Nonnull int N ) {
  Set < String > s = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    s . add ( ( N / ( 10 * i ) ) % 10 ) ;
  }
  return s . size ( ) == 1 ;
}
