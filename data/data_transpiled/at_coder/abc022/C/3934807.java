static final int [ ] [ ] G ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] g = new int [ N ] [ N ] ;
  final float inf = Float . MAX_VALUE ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int u = Integer . parseInt ( input . nextLine ( ) ) ;
    final int v = Integer . parseInt ( input . nextLine ( ) ) ;
    final int length = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ u - 1 ] [ v - 1 ] = length ;
  }
  final int [ ] [ ] sg = new int [ N ] [ N ] ;
  Arrays . fill ( sg , inf ) ;
  final float [ ] [ ] dist = new float [ N ] [ N ] ;
  float ans = inf ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) for ( int j = i + 1 ;
  j < N ;
  j ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( g [ 0 ] [ i ] == 0 || g [ 0 ] [ j ] == 0 ) continue ;
      ans = Math . min ( ans , g [ 0 ] [ i ] + g [ 0 ] [ j ] + dist [ i ] [ j ] ) ;
    }
  }
  return ( int [ ] ) ( ans < inf ? ans : - 1 ) ;
}
