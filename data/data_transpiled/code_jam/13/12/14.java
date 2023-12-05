public static int T = Integer . parseInt ( Scanner in ) {
  int E , R , N ;
  int [ ] v ;
  int mVal ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    if ( v . length == 1 ) {
      return val + ce * v [ 0 ] ;
    }
    mVal = 0 ;
    for ( int j = 0 ;
    j < ce + 1 ;
    j ++ ) {
      int vv = dumb ( Math . min ( E , ce - j + R ) , val + i * v [ 0 ] , E , R , v . length > 1 ) ;
      if ( vv > mVal ) {
        mVal = vv ;
      }
    }
  }
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    E = in . nextInt ( ) ;
    R = in . nextInt ( ) ;
    N = in . nextInt ( ) ;
    v = in . nextInt ( ) ;
    int [ ] nxb = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      nxb [ i ] = - 1 ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        if ( v [ j ] > v [ i ] ) {
          nxb [ i ] = j ;
          break ;
        }
      }
    }
    int ce = E ;
    int val = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int nb = nxb [ i ] ;
      if ( nb == - 1 ) {
        val = val + v [ i ] * ce ;
        ce = Math . min ( E , R ) ;
      }
      else {
        int rg = E - R * ( nb - i ) ;
        int spe = Math . max ( 0 , Math . min ( ce , ce - rg ) ) ;
        val = val + v [ i ] * spe ;
        ce = Math . min ( E , ce - spe + R ) ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + val ) ;
  }
  return 0 ;
}
