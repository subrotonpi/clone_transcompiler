public static int chain ( int [ ] b , int x ) {
  int sz = 1 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    if ( b [ i ] == x && b [ x ] != i ) {
      sz = Math . max ( sz , 1 + chain ( b , i ) ) ;
    }
  }
  /* solve the array */
  int mx = 0 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    int [ ] seen = new int [ b . length ] ;
    Arrays . fill ( seen , 1 ) ;
    int cur = i ;
    while ( seen [ b [ cur ] ] == 0 ) {
      seen [ b [ cur ] ] = seen [ cur ] + 1 ;
      cur = b [ cur ] ;
    }
    mx = Math . max ( seen [ b [ cur ] - seen [ b [ cur ] ] + 1 ] , mx ) ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    if ( b [ b [ i ] ] == i ) {
      c += chain ( b , i ) + chain ( b , b [ i ] ) ;
    }
  }
  /* max */
  int T_max = Integer . parseInt ( readLine ( ) ) ;
  for ( int T = 0 ;
  T < T_max ;
  T ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] bffs = ArrayUtil . newIntArray ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      bffs [ i ] -- ;
    }
    String out = "Case #" + ( T + 1 ) + ": " + solve ( bffs ) ;
    System . out . println ( out ) ;
  }
  return sz ;
}
