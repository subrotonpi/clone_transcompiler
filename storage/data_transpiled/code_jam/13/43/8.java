static final String proc ( int [ ] a , int [ ] b ) {
  final List < Pair < Integer , Integer >> pairs = zip ( a , b ) ;
  final int [ ] sums = new int [ pairs . size ( ) ] ;
  for ( Pair < Integer , Integer > q : pairs ) sums [ q . first ] = q . second + q . third ;
  final int N = a . length ;
  final boolean [ ] [ ] valid = new boolean [ N + 1 ] [ N + 1 ] ;
  valid [ 0 ] [ 0 ] = null ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) valid [ i ] [ 1 ] = sums [ i ] . length <= i + 1 ? sums [ i ] [ 0 ] : 0 ;
  /* go */
  if ( N == N + 1 ) return true ;
  final boolean [ ] v = valid [ N ] . clone ( ) ;
  int last = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( l [ i ] ) {
      v [ i ] = false ;
      last = Math . max ( last , a [ i ] ) ;
    }
    else if ( v [ i ] ) v [ i ] &= a [ i ] == last + 1 ;
  }
  last = 0 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( l [ i ] ) {
      v [ i ] = false ;
      last = Math . max ( last , b [ i ] ) ;
    }
    else if ( v [ i ] ) v [ i ] &= b [ i ] == last + 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( v [ i ] ) {
      l [ i ] = n ;
      if ( go ( l [ i ] , n + 1 ) ) return true ;
      l [ i ] = null ;
    }
  }
  final String [ ] res = new String [ N ] ;
  res [ pairs . indexOf ( new Pair < Integer , Integer > ( 1 , 1 ) ) ] = 1 ;
  go ( res , 2 ) ;
  return StringUtils . join ( res , " " ) ;
}
