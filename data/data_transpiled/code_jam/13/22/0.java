public static double binom ( int n , int r ) {
  double p = 1.0 ;
  for ( int i : xrange ( r ) ) p = p * ( n - i ) / ( i + 1 ) ;
  return p ;
  /* solve case */
  int N = Integer . parseInt ( readLine ( ) ) ;
  int X = Integer . parseInt ( readLine ( ) ) ;
  int Y = Integer . parseInt ( readLine ( ) ) ;
  int k = 1 ;
  while ( ( k + 2 ) * ( k + 3 ) / 2 <= N ) k += 2 ;
  assert k % 2 == 1 ;
  int level = Math . abs ( X ) + Y + 1 ;
  assert level % 2 == 1 ;
  if ( level <= k ) {
    System . out . println ( "Case #" + testCase + ": 1.0" ) ;
    return 0 ;
  }
  if ( level > k + 2 ) {
    System . out . println ( "Case #" + testCase + ": 0.0" ) ;
    return 0 ;
  }
  assert level == k + 2 ;
  int d = N - k * ( k + 1 ) / 2 ;
  int h = k + 1 ;
  assert d <= 2 * h ;
  if ( Y == h ) {
    System . out . println ( "Case #" + testCase + ": 0.0" ) ;
    return 0 ;
  }
  if ( d > h && Y < d - h ) {
    System . out . println ( "Case #" + testCase + ": 1.0" ) ;
    return 0 ;
  }
  double prob = 0.0 ;
  for ( int i : xrange ( Y + 1 , d + 1 ) ) prob += binom ( d , i ) ;
  prob /= 2 * d ;
  System . out . println ( "Case #" + testCase + ": " + prob ) ;
  for ( int i = 1 ;
  i < xrange ( r ) ;
  i ++ ) {
    solveCase ( i ) ;
  }
  return 0 ;
}
