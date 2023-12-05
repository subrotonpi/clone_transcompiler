static final String solve ( ) {
  final String input = "Please input the union of two integers: " ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] par = new int [ n ] ;
  final int [ ] rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  final String printper = "print per " ;
  System . out . println ( par ) ;
  final int [ ] find = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = i ;
  }
  final String x = input . substring ( 0 , 1 ) ;
  final String y = input . substring ( 1 , 2 ) ;
  if ( rank [ x ] < rank [ y ] ) {
    par [ x ] = y ;
  }
  else {
    par [ y ] = x ;
    if ( rank [ x ] == rank [ y ] ) {
      rank [ x ] ++ ;
    }
  }
  final boolean sameCheck = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    par [ i ] = find [ i ] ;
  }
  final int N = Integer . parseInt ( input ) ;
  final int K = Integer . parseInt ( input ) ;
  final int L = Integer . parseInt ( input ) ;
  final UnionFind roadUf = new UnionFind ( N ) ;
  final UnionFind trainUf = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    roadUf . union ( a - 1 , b - 1 ) ;
  }
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    trainUf . union ( a - 1 , b - 1 ) ;
  }
  final int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ roadUf . find ( i ) ] = trainUf . find ( i ) ;
  }
  System . out . println ( ans ) ;
  return "" ;
}
