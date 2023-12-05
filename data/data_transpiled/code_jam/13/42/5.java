static final int solve ( int t ) {
  int n , p ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    p = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int indep = 1 ;
    int pt = p ;
    int x = n - 1 ;
    while ( x >= 0 ) {
      if ( pt > 2 * x ) {
        indep ++ ;
        pt -= 2 * x ;
      }
      else break ;
      x -- ;
    }
    indep = 2 * indep - 2 ;
    if ( p == 2 * n ) indep = 2 * n - 1 ;
    int dep = 0 ;
    x = n ;
    while ( x > 0 ) {
      if ( p >= 2 * x ) break ;
      dep ++ ;
      x -- ;
    }
    dep = 2 * n - 2 * dep ;
    if ( p == 1 ) dep = 0 ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + indep + " " + dep ) ;
  }
  return t ;
}
