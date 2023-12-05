static final int getScore ( ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> pCList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    pCList . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int minNSolved = 1000000000 ;
  for ( int pCombi = 0 ;
  pCombi < 1 << D ;
  pCombi ++ ) {
    int tmpScore = 0 ;
    int nSolved = 0 ;
    List < Integer > selectedPIdx = new ArrayList < > ( ) ;
    for ( int digit = 0 ;
    digit < D ;
    digit ++ ) {
      if ( ( pCombi >> digit ) & 1 ) {
        tmpScore += 100 * ( digit + 1 ) * pCList . get ( digit ) . get ( 0 ) + pCList . get ( digit ) . get ( 1 ) ;
        nSolved += pCList . get ( digit ) . get ( 0 ) ;
        selectedPIdx . add ( digit ) ;
      }
    }
    int scoreDiff = tmpScore - G ;
    if ( scoreDiff >= 0 ) {
      int pIdxLowestFirst = selectedPIdx . get ( 0 ) ;
      int scorePerP = 100 * ( pIdxLowestFirst + 1 ) ;
      Integer nOversolved = null ;
      int scoreDiffWoOnlineus = scoreDiff - pCList . get ( pIdxLowestFirst ) . get ( 1 ) ;
      if ( scoreDiffWoOnlineus > 0 ) {
        nOversolved = Math . round ( scoreDiffWoOnlineus / scorePerP ) ;
        if ( nOversolved < pCList . get ( pIdxLowestFirst ) . get ( 0 ) ) {
          nSolved -= nOversolved ;
        }
      }
    }
    else {
      List < Integer > notSelectedPIdx = new ArrayList < > ( ) ;
      for ( int pIdx = 0 ;
      pIdx < D ;
      pIdx ++ ) {
        if ( ! selectedPIdx . contains ( pIdx ) ) {
          notSelectedPIdx . add ( pIdx ) ;
        }
      }
      Collections . sort ( notSelectedPIdx ) ;
      int notSelectedPIdxHighest = notSelectedPIdx . get ( 0 ) ;
      int addableScore = 100 * pCList . get ( notSelectedPIdxHighest ) . get (