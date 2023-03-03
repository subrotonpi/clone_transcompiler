static final int [ ] [ ] resize ( int [ ] input ) {
  int maxW = Integer . parseInt ( input [ 0 ] ) ;
  int n = input [ 1 ] . length , maxK = input [ 2 ] . length ;
  int [ ] [ ] dp = new int [ maxK + 1 ] [ maxW + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int w = input [ i ] . length ;
    int val = input [ i ] . charAt ( 0 ) ;
    if ( w > maxW ) continue ;
    dp [ 1 ] [ w ] = val ;
  }
  return dp ;
}
