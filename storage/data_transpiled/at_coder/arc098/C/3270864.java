@ VisibleForTesting static int [ ] getSortedList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > A_sorted = Ordering . natural ( ) . sortedCopy ( A ) ;
  int ans = Integer . MAX_VALUE ;
  int ap = 0 ;
  for ( int i = 0 ;
  i < A_sorted . size ( ) ;
  i ++ ) {
    int a = A_sorted . get ( i ) ;
    if ( a == ap ) continue ;
    ap = a ;
    int [ ] L = new int [ A . size ( ) ] ;
    Arrays . fill ( L , 0 ) ;
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    for ( int j = 0 ;
    j < A . size ( ) ;
    j ++ ) {
      int aa = A . get ( j ) ;
      if ( aa < a ) {
        if ( L [ L . length - 1 ] == 0 ) continue ;
        else L [ L . length - 1 ] ++ ;
      }
      else {
        L [ L . length - 1 ] ++ ;
      }
    }
    int cnt = 0 ;
    aap = aa ;
    for ( int v : map . get ( aa ) ) {
      if ( L [ v ] >= K ) {
        L [ v ] -- ;
        cnt ++ ;
      }
    }
    if ( cnt >= Q ) break ;
  }
  ans = Math . min ( ans , aa - a ) ;
  return ans ;
}
