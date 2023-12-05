public static int [ ] [ ] [ ] getHW ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = new int [ H ] ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int count = 0 ;
  int [ ] [ ] ans = new int [ W ] [ W ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      for ( int j = 0 ;
      j < H ;
      j ++ ) {
        if ( j != H - 1 ) {
          if ( a [ j ] [ i ] % 2 == 1 ) {
            a [ j ] [ i ] -- ;
            a [ j + 1 ] [ i ] ++ ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] [ i + 1 ] = 1 ;
            ans [ count ] [ j + 1 ] = 1 ;
          }
        }
        