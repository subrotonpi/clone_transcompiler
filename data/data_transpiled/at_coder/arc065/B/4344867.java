static final int [ ] solve ( int N ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  class UnionFind {
    int [ ] parent = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      parent [ i ] = i ;
      rank [ i ] = 0 ;
    }
  }
  int [ ] d = 10 * 6 ;
  Map < Integer , Integer > nums = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int n = root . find ( i ) + train . find ( i ) * d ;
    if ( n >= 0 ) {
      nums . put ( n , n + 1 ) ;
    }
    else {
      nums . put ( n , n + 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans . put ( i , nums . get ( root . find ( i ) ) + train . find ( i ) * d ) ;
  }
  System . out . println ( Arrays . toString ( ans ) ) ;
  solve2 ( ) ;
  {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    if ( x == y ) return null ;
    if ( rank [ x ] < rank [ y ] ) {
      parent [ x ] = y ;
    }
    else {
      parent [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
  }
  boolean same = ( Integer ) root . equals ( Integer . parseInt ( input ) ) ;
  int [ ] ret = new int [ N ] ;
  ret [ 0 ] = 0 ;
  ret [ 1 ] = 0 ;
  UnionFind root = new UnionFind ( N ) ;
  UnionFind train = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    root . union ( a , b ) ;
  }
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    train . union ( a , b ) ;
  }
  int [ ] ans = new int [ N ] ;
  ans [ 0 ] = 1 ;
  for ( int i