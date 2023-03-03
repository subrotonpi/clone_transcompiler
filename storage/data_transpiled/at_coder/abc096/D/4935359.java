public static int [ ] readPrime ( ) {
  final String input = System . getProperty ( "input" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int upper = 55555 ;
  final boolean [ ] pFlag = new boolean [ upper + 1 ] ;
  pFlag [ 0 ] = pFlag [ 1 ] = false ;
  final int [ ] prime = new int [ upper + 1 ] ;
  for ( int i = 2 ;
  i <= upper ;
  i ++ ) {
    if ( pFlag [ i ] ) {
      prime [ i ] = i ;
      for ( int j = 2 * i ;
      j <= upper ;
      j += i ) {
        pFlag [ j ] = false ;
      }
    }
  }
  final int [ ] ans = new int [ N ] ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < prime . length ;
  i ++ ) {
    if ( prime [ i ] % 5 == 1 ) {
      ans [ cnt ++ ] = prime [ i ] ;
    }
    if ( cnt == N ) break ;
  }
  return ans ;
}
