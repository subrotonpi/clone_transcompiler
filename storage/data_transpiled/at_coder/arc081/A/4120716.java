@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Map < Integer , Integer > C = new HashMap < > ( A ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < C . size ( ) ;
  i ++ ) {
    l . add ( C . get ( i ) ) ;
  }
  int ans ;
  return ans ;
}
