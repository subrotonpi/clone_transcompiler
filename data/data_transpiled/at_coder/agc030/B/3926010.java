static final int [ ] getLengths ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = null ;
  int [ ] DistAntiClock = new int [ N + 1 ] , DistClock = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    DistAntiClock [ i + 1 ] = DistAntiClock [ i ] + 2 * X [ i ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    DistClock [ i + 1 ] = DistClock [ i ] + ( L - X [ N - 1 - i ] ) * 2 ;
  }
  int maxLength = Math . max ( X [ N - 1 ] , L - X [ 0 ] ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int finIndex = Math . ceil ( ( i + N ) / 2 ) ;
    int AntiClockLength ;
    int ClockLength ;
    if ( ( i + N ) % 2 == 0 ) {
      AntiClockLength = DistAntiClock [ finIndex ] - DistAntiClock [ i - 1 ] - X [ finIndex - 1 ] + DistClock [ N - finIndex ] ;
      ClockLength = DistClock [ finIndex ] - DistClock [ i - 1 ] - ( L - X [ N - finIndex ] ) + DistAntiClock [ N - finIndex ] ;
    }
    else {
      AntiClockLength = DistAntiClock [ finIndex - 1 ] - DistAntiClock [ i - 1 ] + DistClock [ N - finIndex + 1 ] - ( L - X [ finIndex - 1 ] ) ;
      ClockLength = DistClock [ finIndex - 1 ] - DistClock [ i - 1 ] + DistAntiClock [ N - finIndex + 1 ] - X [ N - finIndex ] ;
    }
    maxLength = Math . max ( Math . max ( AntiClockLength , ClockLength ) , maxLength ) ;
  }
  System . out . println ( maxLength ) ;
  return new int [ ] {
  }
  ;
}
