@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] xy = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xy [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( xy ) ;
  List < Integer > xsort = new ArrayList < > ( xy ) ;
  Collections . sort ( xsort ) ;
  List < Integer > ysort = new ArrayList < > ( xy ) ;
  Collections . sort ( ysort ) ;
  int l = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l ++ ;
  }
  int [ ] [ ] cum = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cum [ i + 1 ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      cum [ i + 1 ] [ j + 1 ] = cum [ i + 1 ] [ j ] + cum [ i ] [ j + 1 ] - cum [ i ] [ j ] + ( xy [ i ] [ 0 ] & 1 ] == 1 ? 0 : 1 ) ;
    }
  }
  /* Compute the point in the largest order */
  int point = cum [ x1 + 1 ] [ y1 + 1 ] - cum [ x0 ] [ y1 + 1 ] - cum [ x1 + 1 ] [ y0 ] + cum [ x0 ] [ y0 ] ;
  int ans = 5 * 10 * 18 ;
  List < int [ ] > comb = new ArrayList < > ( ) ;
  for ( int a = 0 ;
  a < l ;
  a ++ ) {
    int b = comb . get ( a ) ;
    if ( b - a >= k - 1 ) {
      comb . add ( new int [ ] {
        a , b }
        ) ;
      }
    }
    for ( int a = 0 ;
    a < l ;
    a ++ ) {
      for ( int c = 0 ;
      c < comb . size ( ) ;
      c ++ ) {
        int d = comb . get ( a ) ;
        if ( countPointsInRec ( a , b , c ,