static final double solve ( ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  {
    int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int d = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = 0 ;
    int [ ] [ ] grid = new int [ c ] [ ] ;
    for ( int l = 0 ;
    l < c ;
    l ++ ) {
      int p = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int v = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      grid [ l ] [ p ] = v ;
      n += v ;
    }
    double ret = 0d ;
    for ( int i = 0 ;
    i < grid . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < grid . length ;
      j ++ ) {
        if ( j < i ) continue ;
        n = 0 ;
        for ( int k = i ;
        k <= j ;
        k ++ ) n += grid [ k ] [ 1 ] ;
        double blob = ( d * ( n - 1 ) - ( grid [ j ] [ 0 ] - grid [ i ] [ 0 ] ) ) / 2. ;
        if ( ret < blob ) ret = blob ;
      }
    }
    return ret ;
  }
  for ( int test = 1 ;
  test <= t ;
  test ++ ) {
    double ret = solve ( ) ;
    System . out . println ( "Case #" + test + ": " + ret ) ;
  }
  return ret ;
}
