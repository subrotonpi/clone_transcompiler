public static int N ( ) {
  int M = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( dif ) ;
  return dif . size ( ) ;
}
