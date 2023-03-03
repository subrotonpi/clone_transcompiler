public static int solve ( int n , int p , int [ ] g ) {
  int [ ] leftOvers = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    leftOvers [ i ] = g [ i ] % p ;
  }
  int [ ] count = new int [ p ] ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) {
    count [ i ] = leftOvers [ i ] ;
  }
  int res = count [ 0 ] ;
  if ( p == 2 ) {
    return res + ( count [ 1 ] + 1 ) / 2 ;
  }
  if ( p == 3 ) {
    int m = Math . min ( count [ 1 ] , count [ 2 ] ) ;
    res += m ;
    m = Math . max ( count [ 1 ] , count [ 2 ] ) - m ;
    res += ( m / 3 ) ;
    if ( m % 3 > 0 ) {
      res ++ ;
    }
    return res ;
  }
  int m = Math . min ( count [ 1 ] , count [ 3 ] ) ;
  res += m ;
  count [ 1 ] -= m ;
  count [ 3 ] -= m ;
  res += count [ 2 ] / 2 ;
  count [ 2 ] = count [ 2 ] % 2 ;
  m = Math . min ( count [ 1 ] / 2 , count [ 2 ] ) ;
  res += m ;
  count [ 1 ] -= 2 * m ;
  count [ 2 ] -= m ;
  m = Math . min ( count [ 3 ] / 2 , count [ 2 ] ) ;
  res += m ;
  count [ 3 ] -= 2 * m ;
  count [ 2 ] -= m ;
  m = Integer . parseInt ( count [ 1 ] ) ;
  res += ( m / 4 ) ;
  if ( m % 4 > 0 ) {
    res ++ ;
  }
  return res ;
}
