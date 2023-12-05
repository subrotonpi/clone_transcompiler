public static int N = Integer . parseInt ( input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A ) ;
  return A . size ( ) ;
}
