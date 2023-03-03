@ VisibleForTesting static int gcd ( ) {
  int N = input . nextInt ( ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . valueOf ( input . nextInt ( ) ) ) ;
  }
  return A . size ( ) ;
}
