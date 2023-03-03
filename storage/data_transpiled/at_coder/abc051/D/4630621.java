static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int M = Integer . parseInt ( input ( ) ) ;
  graph . clear ( ) ;
  int [ ] [ ] maps = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    maps [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    maps [ a ] [ b ] = c ;
    maps [ b ] [ a ] = c ;
  }
  int ans = 0 ;
  int [ ] [ ] org = new int [ N ] [ N ] ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( i <= j ) continue ;
        maps [ i ] [ j ] = Math . min ( maps [ i ] [ j ] , maps [ i ] [ k ] + maps [ k ] [ j ] ) ;
        maps [ j ] [ i ] = Math . min ( maps [ i ] [ j ] , maps [ i ] [ k ] + maps [ k ] [ j ] ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i <= j ) continue ;
      if ( org [ i ] [ j ] == 9999999 ) continue ;
      if ( org [ i ] [ j ] != maps [ i ] [ j ] ) ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
