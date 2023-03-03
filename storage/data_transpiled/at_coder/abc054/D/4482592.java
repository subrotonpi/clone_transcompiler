public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int Ma = Integer . parseInt ( input ) ;
  int Mb = Integer . parseInt ( input ) ;
  int [ ] [ ] dp = new int [ 401 ] [ 401 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ 0 ] = 10 * 18 ;
  }
  dp [ 0 ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    for ( int ca = i * 10 ;
    ca >= 0 ;
    ca -- ) {
      for ( int cb = i * 10 ;
      cb >= 0 ;
      cb -- ) {
        dp [ ca + a ] [ cb + b ] = Math . min ( dp [ ca + a ] [ cb + b ] , dp [ ca ] [ cb ] + c ) ;
      }
    }
  }
  int ans = 10 * 18 ;
  for ( int ca = 0 ;
  ca < 401 ;
  ca ++ ) {
    for ( int cb = 0 ;
    cb < 401 ;
    cb ++ ) {
      if ( ! ca * Mb == cb * Ma || ca == 0 ) continue ;
      if ( ans > dp [ ca ] [ cb ] ) ans = dp [ ca ] [ cb ] ;
    }
  }
  if ( ans == 10 * 18 ) System . out . println ( - 1 ) ;
  else System . out . println ( ans ) ;
  return dp ;
}
