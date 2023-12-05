@ VisibleForTesting static int binarySearch ( int [ ] input ) {
  final String input = "Input string is a number of input values." ;
  final int a = input . length ( ) ;
  final int b = input . length ( ) ;
  final int q = input . length ( ) ;
  final double inf = Double . POSITIVE_INFINITY ;
  final int [ ] S = new int [ a ] ;
  final int [ ] T = new int [ b ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    S [ i ] = - inf ;
    T [ i ] = Integer . MAX_VALUE ;
  }
  return ( int x ) -> {
    int res = 10 * 30 ;
    int s = Integer . min ( S [ s ] , x ) ;
    int ans = 0 ;
    int t = Integer . min ( T [ s ] , x ) ;
    ans += Math . abs ( x - S [ s - 1 ] ) + Math . min ( Math . abs ( S [ s - 1 ] - T [ t - 1 ] ) , Math . abs ( S [ s - 1 ] - T [ t ] ) ) ;
    if ( ans <= res ) res = ans ;
    ans = 0 ;
    t = Integer . min ( T [ s ] , x ) ;
    ans += Math . abs ( x - S [ s ] ) + Math . min ( Math . abs ( S [ s ] - T [ t - 1 ] ) , Math . abs ( S [ s ] - T [ t ] ) ) ;
    if ( ans <= res ) res = ans ;
    return res ;
  }
  ;
}
