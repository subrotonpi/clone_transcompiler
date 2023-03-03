public static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] D = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int [ ] tmp = new int [ N ] ;
    for ( int j = 0 ;
    j < tmp . length ;
    j ++ ) {
      tmp [ j ] = Integer . parseInt ( tmp [ j ] ) ;
    }
    for ( int j = 0 ;
    j < tmp . length ;
    j ++ ) {
      tmp [ j ] = Integer . parseInt ( tmp [ j ] ) ;
    }
  }
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] P = new int [ Q ] [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int [ ] tmp = new int [ N ] ;
    for ( int j = 0 ;
    j < P . length ;
    j ++ ) {
      tmp [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
      P [ i ] = tmp [ j ] ;
    }
  }
  final int [ ] [ ] maps = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == 0 && j == 0 ) continue ;
      if ( i == 0 ) {
        maps [ j ] [ i ] = maps [ j - 1 ] [ i ] + D [ j ] [ i ] ;
        continue ;
      }
      if ( j == 0 ) {
        maps [ j ] [ i ] = maps [ j ] [ i - 1 ] + D [ j ] [ i ] ;
        continue ;
      }
      maps [ j ] [ i ] = maps [ j ] [ i - 1 ] + maps [ j - 1 ] [ i - 1 ] - maps [ j - 1 ] [ i - 1 ] + D [ j ] [ i ] ;
    }
  }
  final int [ ] anArray = new int [ N * N + 1 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    anArray [ i ] = - 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    anArray [ i ] = - 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    an @ @