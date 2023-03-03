public static int [ ] [ ] readIntRange ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] xv = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xv [ i ] = Integer . parseInt ( input ) ;
  int [ ] af = new int [ n ] ;
  int prevx = 0 ;
  for ( int x = 0 ;
  x < xv . length ;
  x ++ ) {
    int v = xv [ x ] ;
    af [ x ] = af [ x ] - v - x + prevx ;
    prevx = v [ x ] ;
  }
  int [ ] bf = new int [ n ] ;
  int prevx = 0 ;
  for ( int x = xv . length - 1 ;
  x >= 0 ;
  x -- ) {
    int v = c - x ;
    bf [ x ] = bf [ x ] + v - x + prevx ;
    prevx = v [ x ] ;
  }
  int [ ] maxa = new int [ n ] ;
  for ( int i = 1 ;
  i < af . length ;
  i ++ ) maxa [ n ] = Math . max ( maxa [ n - 1 ] , af [ i ] ) ;
  int [ ] maxb = new int [ n ] ;
  for ( int i = 1 ;
  i < bf . length ;
  i ++ ) maxb [ n ] = Math . max ( maxb [ n - 1 ] , bf [ i ] ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < af . length ;
  i ++ ) {
    int _af = af [ i ] ;
    if ( _af + maxb [ n - i ] - ( i != 0 ? xv [ i - 1 ] [ 0 ] : 0 ) > ans ) ans = _af + maxb [ n - i ] - ( i != 0 ? xv [ i - 1 ] [ 0 ] : 0 ) ;
  }
  for ( int i = 0 ;
  i < bf . length ;
  i ++ ) {
    int _bf = bf [ i ] ;
    if ( _bf + maxa [ n - i ] - ( i != 0 ? c - xv [ n - i ] [ 0 ] : 0 ) > ans ) ans = _bf + maxa [ n - i ] - ( i != 0 ? c - xv [ n - i ] [ 0 ] : 0