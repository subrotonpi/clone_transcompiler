@ Nonnull public static LinkedHashMap < Integer , Integer > read ( ) {
  final int n = 10 ;
  final int k = n - 1 ;
  final int [ ] par = new int [ n ] ;
  final int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = Integer . parseInt ( System . in . readLine ( ) ) ;
  }
  final int i = Integer . parseInt ( System . in . readLine ( ) ) ;
  final int ans = i ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int x = li ;
    y -- ;
    int ans = d [ x ] + 1 ;
    while ( d [ x ] < d [ y ] ) {
      int l = m ;
      int i = par [ y ] [ i ] ;
      int j = l ;
      while ( j -- > 0 ) {
        int m = ( l + j ) / 2 ;
        if ( par [ x ] [ j ] != 0 ) {
          l = m ;
        }
        else {
          r = m ;
        }
      }
      x = par [ x ] [ j ] ;
      y = par [ y ] [ i ] ;
    }
    ans -= 2 * d [ l ] ;
  }
  final int [ ] l ;
  if ( par [ x ] != null ) {
    l = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] = i ;
  }
  else {
    l = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] = i ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = li ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = i ;
}
final int [ ] l = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) l [ i ] = i ;
for ( int i = 0 ;
i < l ;
i ++ ) l [ i ] = i ;
int ans = l [ i ] + 1 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  l [ i ] = i ;
}
return ans ;
}
