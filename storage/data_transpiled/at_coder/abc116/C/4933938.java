public static void print ( int N ) {
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int S = Integer . parseInt ( H [ 0 ] ) ;
  int ans = 0 ;
  while ( S > 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( H [ i ] > 0 ) break ;
    }
    for ( int j = i ;
    j < N ;
    j ++ ) {
      if ( H [ j ] == 0 ) break ;
    }
    if ( j == N - 1 && H [ j ] > 0 ) j ++ ;
    for ( int k = i ;
    k < j ;
    k ++ ) {
      H [ k ] -- ;
    }
    ans ++ ;
    S -= j - i ;
  }
  System . out . println ( ans ) ;
}
