@ MoreIO . InputFunction public static void main ( String [ ] args ) {
  final double INF = Double . POSITIVE_INFINITY ;
  final int N = ( Integer ) input . split ( " " ) [ 0 ] ;
  final int M = ( Integer ) input . split ( " " ) [ 1 ] ;
  final int [ ] a = new int [ N ] ;
  final int [ ] b = new int [ N ] ;
  final int [ ] c = new int [ N ] ;
  final double [ ] d = new double [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int s1 = ( Integer ) input . split ( " " ) [ 0 ] ;
    final int s2 = ( Integer ) input . split ( " " ) [ 0 ] ;
    final int s3 = ( Integer ) input . split ( " " ) [ 1 ] ;
    a [ i ] = s1 ;
    b [ i ] = s2 ;
    c [ i ] = - s3 ;
  }
  Arrays . fill ( d , INF ) ;
  final int [ ] cnt = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    boolean update = false ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      if ( Double . isInfinite ( d [ a [ i ] - 1 ] ) ) continue ;
      if ( ( d [ b [ i ] - 1 ] > d [ a [ i ] - 1 ] + c [ i ] ) ) {
        d [ b [ i ] - 1 ] = d [ a [ i ] - 1 ] + c [ i ] ;
        cnt [ b [ i ] - 1 ] ++ ;
        update = true ;
      }
    }
    if ( ! update ) break ;
  }
  final double ans ;
  if ( cnt [ N - 1 ] < N ) ans = - d [ N - 1 ] ;
  else ans = Double . POSITIVE_INFINITY ;
  System . out . println ( ans ) ;
}
