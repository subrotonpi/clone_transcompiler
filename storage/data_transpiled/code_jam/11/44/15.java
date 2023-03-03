@ VisibleForTesting static int [ ] [ ] run ( ) {
  final int [ ] [ ] heap = new int [ 2 ] [ 2 ] ;
  final int maxTestcases = Integer . parseInt ( readLine ( ) ) ;
  for ( int T = 1 ;
  T <= maxTestcases ;
  T ++ ) {
    System . out . println ( "Case #" + T + ": " + runTestCase ( ) ) ;
  }
  final int [ ] [ ] conquehen = new int [ maxTestcases ] ;
  final int [ ] [ ] threathhen = new int [ maxTestcases ] [ maxTestcases ] ;
  for ( int i = 0 ;
  i < maxTestcases ;
  i ++ ) {
    for ( int j = 0 ;
    j < threathhen . length ;
    j ++ ) {
      if ( conquehen [ i ] [ j ] == 0 ) {
        tmpConquehen [ j ] = 1 ;
      }
    }
  }
  final int [ ] [ ] m = new int [ P ] [ ] ;
  final boolean [ ] visited = new boolean [ P ] ;
  for ( int i = 0 ;
  i < P ;
  i ++ ) {
    for ( String pair : readLine ( ) . trim ( ) . split ( " " ) ) {
      int i = Integer . parseInt ( pair . trim ( ) ) ;
      int j = Integer . parseInt ( pair . trim ( ) ) ;
      m [ i ] [ j ] = m [ j ] [ i ] = 1 ;
    }
  }
  final int HOME = 0 ;
  final int ENEMY = 1 ;
  final int [ ] [ ] tmpConqueer = new int [ P ] [ ] ;
  for ( int i = 0 ;
  i < P ;
  i ++ ) {
    for ( int j = 0 ;
    j < P ;
    j ++ ) {
      for ( int j = 0 ;
      j < P ;
      j ++ ) {
        if ( m [ i ] [ j ] == 0 ) {
          tmpConqueer [ i ] = 1 ;
          tmpConquehen [ i ] = 1 ;
          tmpThreathen [ j ] = m [ j ] [ i ] ? 1 : 0 ;
        }
      }
    }
  }
  return new int [ ] [ ] {
    {
      HOME , ENEMY }
    }
    ;
  }
  