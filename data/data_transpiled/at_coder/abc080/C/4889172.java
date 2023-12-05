public static int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] F = new int [ N ] [ N ] ;
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    F [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = - ( 10 * 7 ) * 10 * 100 ;
  for ( int i = 1 ;
  i < 2 * N ;
  i ++ ) {
    int [ ] counter = new int [ N ] ;
    int tmp = 0 ;
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      if ( ( i >> j ) & 1 ) {
        for ( int k = 0 ;
        k < N ;
        k ++ ) {
          if ( F [ k ] [ j ] == 1 ) {
            counter [ k ] ++ ;
          }
        }
      }
    }
    for ( int l = 0 ;
    l < N ;
    l ++ ) {
      tmp += P [ l ] [ counter [ l ] ] ;
    }
    ans = Math . max ( tmp , ans ) ;
  }
  return F ;
}
