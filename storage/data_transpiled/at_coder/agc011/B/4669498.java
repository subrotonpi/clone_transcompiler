static final int [ ] getLevels ( ) {
  final int INF = 10 * * 18 ;
  final int MOD = 10 * * 9 + 7 ;
  {
    final int [ ] LI = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      LI [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
  }
  {
    final int [ ] LI_ = new int [ N ] ;
    for ( int i = 0 ;
    i < LI_ . length ;
    i ++ ) {
      LI_ [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 ;
    }
  }
  {
    final int [ ] LF = new int [ N ] ;
    for ( int i = 0 ;
    i < LF . length ;
    i ++ ) {
      LF [ i ] = Float . parseFloat ( System . console ( ) . readLine ( ) ) ;
    }
  }
  {
    final int [ ] LS = new int [ N ] ;
    for ( int i = LF . length ;
    i < LS . length ;
    i ++ ) {
      LS [ i ] = LF [ i ] ;
    }
  }
  {
    final int N = II [ N ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      N = S [ i ] ;
    }
  }
}
