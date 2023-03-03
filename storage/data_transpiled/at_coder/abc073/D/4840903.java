@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  final int inf = 10 * 9 ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int r1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > r = Lists . newArrayList ( ) ;
  final List < Integer > abc = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    abc . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final int [ ] [ ] d = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ 0 ] = inf ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      final int dk = d [ i ] [ k ] + d [ k ] [ j ] ;
      if ( d [ i ] [ j ] > dk ) {
        d [ j ] [ i ] = dk ;
        d [ i ] [ j ] = dk ;
      }
    }
  }
  permutations ( r ) ;
  int ans = inf ;
  final List < Integer > p = Lists . newArrayList ( ) ;
  for ( final Integer [ ] pi : p ) {
    int res = 0 ;
    for ( int i = 0 ;
    i < r1 - 1 ;
    i ++ ) {
      res += d [ pi [ i ] - 1 ] [ pi [ i + 1 ] - 1 ] ;
    }
    if ( ans > res ) {
      ans = res ;
    }
  }
  System . out . println ( ans ) ;
  return p ;
}
