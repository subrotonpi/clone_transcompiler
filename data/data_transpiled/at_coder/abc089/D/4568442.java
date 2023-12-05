public static int [ ] [ ] parse ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) L . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int Q = Integer . parseInt ( input ) ;
  List < List < Integer >> query = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) query . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  List < int [ ] > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) for ( int j = 0 ;
  j < W ;
  j ++ ) P . add ( new int [ ] {
    0 , 0 }
    ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) for ( int j = 0 ;
    j < W ;
    j ++ ) P . add ( L . get ( i ) . get ( j ) - 1 , new int [ ] {
      i , j }
      ) ;
      int [ ] dp = new int [ H * W ] ;
      for ( int i = 0 ;
      i < D ;
      i ++ ) {
        dp [ i ] = 0 ;
        int cnt = i + D ;
        while ( cnt < H * W ) {
          dp [ cnt ] = dp [ cnt - D ] + Math . abs ( P . get ( cnt ) . get ( 0 ) - P . get ( cnt - D ) . get ( 0 ) ) + Math . abs ( P . get ( cnt ) . get ( 1 ) - P . get ( cnt - D ) . get ( 1 ) ) ;
          cnt = cnt + D ;
        }
      }
      for ( int j = 0 ;
      j < Q ;
      j ++ ) System . out . println ( dp [ query . get ( j ) . get ( 1 ) - 1 ] - dp [ query . get ( j ) . get ( 0 ) - 1 ] ) ;
      return dp ;
    }
    