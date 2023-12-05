static final int [ ] [ ] getLengths ( ) {
  final int [ ] [ ] stdin = new int [ n ] [ n ] ;
  System . arraycopy ( stdin , 0 , stdin [ 0 ] , 0 , stdin [ 1 ] . length ) ;
  final int [ ] [ ] p = new int [ n ] [ n ] ;
  int i ;
  int lo = 0 ;
  int hi = 0 ;
  for ( i = 0 ;
  i < p . length ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( stdin [ i ] [ 0 ] ) ;
  }
  final int li_ = 0 ;
  for ( i = 0 ;
  i < p . length ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( stdin [ i ] [ 0 ] ) - 1 ;
  }
  final int lf [ ] = Float . parseFloat ( stdin [ i ] [ 0 ] ) ;
  final int ls [ ] = Float . parseFloat ( stdin [ i ] [ 0 ] ) ;
  final int ns [ ] = stdin [ i ] [ 1 ] ;
  final int lc [ ] = new int [ ns ] ;
  for ( i = 0 ;
  i < lc ;
  i ++ ) {
    lc [ i ] = list ( ns [ i ] ) ;
  }
  final int ni = Integer . parseInt ( stdin [ i ] [ 0 ] ) ;
  final int nf = Float . parseFloat ( stdin [ i ] [ 1 ] ) ;
  final int n = ni ;
  final int [ ] [ ] d = new int [ n ] [ li ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ 0 ] = li [ i ] ;
  }
  final int q = ni ;
  final int [ ] [ ] p = new int [ q ] [ n ] ;
  for ( i = 0 ;
  i < q ;
  i ++ ) {
    p [ i ] [ 0 ] = ni ;
    for ( int j = 0 ;
    j < p [ i ] . length ;
    j ++ ) {
      p [ i ] [ j ] = p [ i ] [ j ] ;
    }
  }
  final int [ ] [ ] cum_d = cum_2d ( d ) ;
  final int [ ] [ ] dic = new int [ n * n + 1 ] [ n ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < p [ i ] . length ;
    j ++ ) {
      maxs [ i ] = Math . max ( dic [ i ] , maxs [