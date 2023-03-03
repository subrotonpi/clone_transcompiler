@ Nonnull public static LinkedHashMap < Integer , Integer > map ( @ Nonnull final int n ) {
  final int k = n - 1 ;
  final int [ ] par = new int [ n ] ;
  final int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = Integer . parseInt ( System . in . readLine ( ) ) ;
  final int i = Integer . parseInt ( System . in . readLine ( ) ) ;
  final int ans = i ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int x = li ;
    y -- ;
    int ans = d [ x ] + 1 ;
    while ( d [ x ] < d [ y ] ) {
      int l = d [ y ] + 1 ;
      int i = lo2 [ y ] ;
      int j = l ;
      if ( j == n ) {
        l = j ;
      }
      else {
        r = l ;
      }
    }
    x = par [ x ] [ j ] ;
    y = lo2 [ x ] ;
  }
  int ans = 0 ;
  if ( ans == 0 ) {
    int lca = x ;
    while ( par [ x ] != 0 ) {
      int l = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) l = i ;
      if ( par [ x ] [ j ] != 0 ) {
        l = m ;
      }
      else {
        r = l ;
      }
    }
    int i = par [ x ] [ i ] ;
    int j = l ;
    while ( j > 0 ) {
      int l = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) l = i ;
      if ( par [ x ] [ j ] != 0 ) {
        l = i ;
      }
    }
  }
  else {
    int l = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l = i ;
    if ( par [ x ] [ j ] != 0 ) {
      int l = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) l = i ;
      if ( par [ x ] [ j ] != 0 ) {
        l = i ;
      }
    }
  }
  int l = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l = par [ x ] [ j ] ;
  int j = l ;
  ans -= 2 * d [ j ] ;
  ans -= l ;
  ans -= 2 * d [ j ] ;
  ans -= 2 * d [ j ] ;
  ans -= 2 * d [