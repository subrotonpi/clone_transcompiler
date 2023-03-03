public static int ramp ( int p ) {
  if ( p >= 0 ) return p ;
  else return 0 ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int repeat : xrange ( T ) ) {
    String [ ] lineArr = readLine ( ) . split ( " " ) ;
    int N = Integer . parseInt ( lineArr [ 0 ] ) ;
    int S = Integer . parseInt ( lineArr [ 1 ] ) ;
    p = Integer . parseInt ( lineArr [ 2 ] ) ;
    int [ ] t = new int [ N ] ;
    for ( int i : xrange ( 3 , lineArr . length ) ) t [ i ] = Integer . parseInt ( lineArr [ i ] ) ;
    int count_n = 0 ;
    int count_s = 0 ;
    for ( int j : t ) {
      if ( j >= p + 2 * ramp ( p - 1 ) ) count_n ++ ;
      else if ( j >= p + 2 * ramp ( p - 2 ) ) count_s ++ ;
    }
    int count = count_n ;
    if ( count_s <= S ) count += count_s ;
    else count += S ;
    System . out . println ( "Case #" + ( repeat + 1 ) + ": " + count ) ;
  }
  return 0 ;
}
