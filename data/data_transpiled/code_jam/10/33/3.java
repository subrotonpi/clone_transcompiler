@ Nullable private static LinkedHashMap < Integer , Boolean > calcDP ( int [ ] [ ] board , boolean [ ] seen ) {
  int [ ] [ ] dp = new int [ board [ 0 ] . length ] [ board . length ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) dp [ i ] [ i ] = 1 ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int M = Integer . parseInt ( readLine ( ) ) ;
    int N = board . length ;
    int [ ] [ ] foo = new int [ M ] [ N ] ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      int [ ] row = new int [ N ] ;
      for ( int c = 0 ;
      c < Integer . parseInt ( readLine ( ) ) ;
      c ++ ) {
        row [ c ] = Integer . parseInt ( readLine ( ) , 16 ) ;
        b = b . length == 4 ? '0' : b . length ;
        row [ c ] = b . length == 1 ? 1 : 0 ;
      }
      board [ t ] [ m ] = row ;
    }
    solve ( t , board ) ;
  }
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int M = Integer . parseInt ( readLine ( ) ) ;
    int N = board . length ;
    for ( int c = 0 ;
    c < N ;
    c ++ ) {
      int [ ] row = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        row [ c ] = Integer . parseInt ( readLine ( ) , 16 ) ;
        b = b . length == 4 ? '0' : b . length ;
        row [ c ] = b . length == 1 ? 1 : 0 ;
      }
      boolean canDo = ! ( seen [ r ] || seen [ r + 1 ] || seen [ r ] || seen [ r ] || seen [ r + 1 ] || seen [ r + 1 ] ) ;
      if ( square && canDo ) {
        dp [ r ] [ c ] = Math . min ( dp [ r + 1 ] [ c + 1 ] , dp [ r + 1 ] [ c ] , dp [ r + 1 ] [ c + 1 ] ) + 1 ;
      }
      foo [ t ] = new int [ N ] ;
    }
  }
  for ( int c = 0 ;
  c < N ;
  c ++ ) {
    foo [ c ] = 1 ;
  }
  for (