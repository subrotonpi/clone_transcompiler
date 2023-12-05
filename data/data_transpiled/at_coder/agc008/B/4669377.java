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
    final int [ ] LI_ = new int [ N ] ;
    for ( int i = 0 ;
    i < LI_ . length ;
    i ++ ) {
      LI_ [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 ;
    }
    final int [ ] LF = new int [ N ] ;
    for ( int i = 0 ;
    i < LF ;
    i ++ ) {
      LF [ i ] = Float . parseFloat ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] LS = new int [ N ] ;
    for ( int i = 0 ;
    i < LS . length ;
    i ++ ) {
      LS [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] II = new int [ N ] ;
    for ( int i = 0 ;
    i < II . length ;
    i ++ ) {
      II [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] SI = new int [ N ] ;
    @ SuppressWarnings ( "unused" ) int [ ] [ ] A = LI ;
    {
      int [ ] negs = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        negs [ i ] = Math . min ( 0 , A [ i ] ) ;
      }
      int [ ] poss = new int [ N ] ;
      for ( int i = 0 ;
      i < P ;
      i ++ ) {
        poss [ i ] = Math . max ( 0 , A [ i ] ) ;
      }
      int [ ] nacc = new int [ N ] ;
      for ( int i = 0 ;
      i < negs . length ;
      i ++ ) {
        nacc [ i ] = 0 ;
      }
      for ( int i = 0 ;
      i < poss . length ;
      i ++ ) {
        pacc [ i ] = Math . max ( 0 , A [ i ] ) ;
      }
      int [ ] pacc = new int [ N ] ;
      for ( int i = 0 ;
      i < poss . length ;
      i ++ ) {
        pacc [