static String testCase ( ) {
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] [ ] vines = new int [ N ] [ N + 1 ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    vines [ i ] = new int [ N + 1 ] ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      vines [ i ] [ j ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
  }
  final int D = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  vines [ 0 ] = D ;
  final int [ ] reach = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    reach [ i ] = - 1 ;
  }
  reach [ 0 ] = vines [ 0 ] [ 0 ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= N ;
    j ++ ) {
      if ( vines [ j ] [ 0 ] > vines [ i ] [ 0 ] + reach [ i ] ) {
        break ;
      }
      int r = Math . min ( vines [ j ] [ 1 ] , vines [ j ] [ 0 ] - vines [ i ] [ 0 ] ) ;
      if ( r > reach [ j ] ) {
        reach [ j ] = r ;
      }
    }
  }
  if ( reach [ N ] != - 1 ) {
    return "YES" ;
  }
  return "NO" ;
}
