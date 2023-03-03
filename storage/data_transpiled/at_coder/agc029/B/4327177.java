@ VisibleForTesting static void input ( ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  int [ ] C = new int [ A . size ( ) ] ;
  int ans = 0 ;
  for ( int a : A ) {
    if ( C [ a ] == 0 ) {
      continue ;
    }
    C [ a ] -- ;
    int t = 2 * a - a ;
    if ( C [ t ] != 0 ) {
      C [ t ] -- ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
