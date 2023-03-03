public static int numTrials = Integer . parseInt ( input ) {
  int numTrials = Integer . parseInt ( input . nextLine ( ) ) ;
  /* in range */
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ N + 1 ] ;
  S [ 0 ] = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    S [ i + 1 ] = ( p * i + q ) % r + s + S [ i ] ;
  }
  int aLo = 0 ;
  int aHi = N - 1 ;
  int minSolveigScore = S [ N ] + 1 ;
  while ( aLo <= aHi ) {
    int aTry = ( aLo + aHi ) / 2 ;
    int loRange = S [ aTry ] ;
    int bLo = aTry ;
    int bHi = N - 1 ;
    int minMaxMidHi = S [ N ] + 1 ;
    while ( bLo <= bHi ) {
      int bTry = ( bLo + bHi ) / 2 ;
      int midRange = S [ bTry + 1 ] - S [ aTry ] ;
      int hiRange = S [ N ] - S [ bTry + 1 ] ;
      minMaxMidHi = Math . min ( minMaxMidHi , Math . max ( midRange , hiRange ) ) ;
      if ( midRange > hiRange ) {
        bHi = bTry - 1 ;
      }
      else if ( midRange < hiRange ) {
        bLo = bTry + 1 ;
      }
      else {
        break ;
      }
    }
    minSolveigScore = Math . min ( minSolveigScore , Math . max ( loRange , minMaxMidHi ) ) ;
    if ( loRange > minMaxMidHi ) {
      aHi = aTry - 1 ;
    }
    else if ( loRange < minMaxMidHi ) {
      aLo = aTry + 1 ;
    }
    else {
      break ;
    }
  }
  /* compute the result */
  for ( int i = 0 ;
  i <= numTrials ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + compute ( i )