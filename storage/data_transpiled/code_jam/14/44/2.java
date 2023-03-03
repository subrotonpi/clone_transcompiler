static final int T = Integer . parseInt ( readLine ( ) ) {
  int M , N ;
  int [ ] a = new int [ M ] ;
  int a [ ] = readLine ( ) . split ( " " ) ;
  int b [ ] = readLine ( ) . split ( " " ) ;
  for ( int i : xrange ( Math . min ( a . length , b . length ) ) ) {
    if ( a [ i ] != b [ i ] ) {
      return i ;
    }
  }
  return Math . min ( a . length , b . length ) ;
  /* calc */
  int s = 1 + a [ 0 ] . length ( ) ;
  for ( int i : xrange ( 1 , a . length ) ) {
    s += a [ i ] . length ( ) - lca ( a [ i ] , a [ i - 1 ] ) ;
  }
  /* frac */
  if ( a == 0 ) {
    return 1 ;
  }
  /* dfs */
  int [ ] a = new int [ a . length ] ;
  int sum = a [ 0 ] * a [ 0 ] * ( a . length - 1 ) ;
  /* dfs */
  if ( m == 1 ) {
    return calc ( a ) ;
  }
  int ret = - 1 , ways = 0 ;
  for ( int i = 1 ;
  i < ( 1 << a . length ) - 1 ;
  i ++ ) {
    int [ ] p = new int [ a . length ] ;
    for ( int j = 0 ;
    j < p . length ;
    j ++ ) {
      if ( ( ( 1 << j ) & i ) != 0 ) {
        p [ j ] = a [ j ] ;
      }
    }
    int [ ] q = new int [ a . length ] ;
    for ( int j = 0 ;
    j < q . length ;
    j ++ ) {
      if ( ( ( 1 << j ) & i ) == 0 ) {
        q [ j ] = a [ j ] ;
        sum += a [ j ] * a [ j ] ;
      }
    }
    if ( q . length >= m - 1 ) {
      int t = dfs ( q , m - 1 ) ;
      sum += a [ 0 ] * a [ 0 ] * b [ 0 ] ;
      if ( sum == 0 || sum == 0 ) {
        ret = t ;
        ways = sum ;
      }
      else if ( sum == 0 ) {
        ways += s ;
      }
    }
  }
  return ret ;
}
