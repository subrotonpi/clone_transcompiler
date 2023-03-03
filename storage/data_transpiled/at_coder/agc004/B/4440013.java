static final double INF = Double . POSITIVE_INFINITY ;
final int MOD = 10 * * 9 + 7 ;
{
  int n = Integer . parseInt ( System . in ) ;
  int x = Integer . parseInt ( System . in ) ;
  int [ ] LI_ = new int [ n ] ;
  int [ ] LF = new int [ n ] ;
  int [ ] LS = new int [ n ] ;
  int i = 0 ;
  int j = 0 ;
  for ( ;
  i < n ;
  i ++ ) {
    LI_ [ i ] = Integer . parseInt ( System . in ) ;
  }
  int [ ] L_ = new int [ n ] ;
  int j = 0 ;
  for ( ;
  j < n ;
  j ++ ) {
    LI_ [ i ] = Integer . parseInt ( System . in ) - 1 ;
  }
  int [ ] L_ = new int [ n ] ;
  int j = 0 ;
  for ( ;
  j < n ;
  j ++ ) {
    L_ [ j ] = Integer . parseInt ( System . in ) ;
  }
  int i = j ;
  int j = 0 ;
  for ( ;
  j < n ;
  j ++ ) {
    int a = LI_ [ j ] ;
    if ( a < min_a ) {
      min_a = a ;
      min_i = i ;
    }
    j ++ ;
    j ++ ;
  }
  int [ ] A = new int [ j ] ;
  int [ ] dp = new int [ n ] ;
  dp [ 0 ] = INF ;
  dp [ 1 ] = A ;
  for ( int k = n - 1 ;
  k > 0 ;
  k -- ) {
    int tmp = 0 ;
    for ( int i = n ;
    i < n ;
    i ++ ) {
      if ( dp [ i + 1 ] > dp [ i ] ) dp [ i + 1 ] = dp [ i ] ;
      tmp += dp [ i + 1 ] ;
    }
    res = Math . min ( res , tmp + ( k + 1 ) * j ) ;
  }
  return res ;
}
