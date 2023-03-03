static final double [ ] prod ( double [ ] probs ) {
  /* Compute the number of backspaces */
  double x = 1.0 ;
  for ( double p : probs ) {
    x *= p ;
  }
  /* Calculate the number of backspaces */
  double probRight = prod ( probs ) ;
  /* Calculate the number of backspaces */
  double afterBackspace = calcFinish ( A , B , probs , 0 , A - n , probs ) ;
  /* Calculate the number of backspaces */
  double afterBackspace = calcBackspaces ( A - n , B , probs , 0 , A - n , probs ) ;
  /* Run the main program */
  String [ ] fileLines = new String [ ] {
    "" , "" , "" , "" , "" , "" }
    ;
    int index = 0 ;
    int numCases = Integer . parseInt ( fileLines [ index ] . substring ( 0 , fileLines [ index ] . length ( ) - 1 ) ) ;
    index ++ ;
    for ( int caseNum = 0 ;
    caseNum < numCases ;
    caseNum ++ ) {
      String caseStr = fileLines [ index ] . substring ( 0 , caseNum ) ;
      index ++ ;
      int [ ] nums = new int [ A ] ;
      for ( int i = 0 ;
      i < nums . length ;
      i ++ ) nums [ i ] = Integer . parseInt ( caseStr . substring ( i + 1 ) ) ;
      A = nums [ 0 ] ;
      B = nums [ 1 ] ;
      caseStr = fileLines [ index ] . substring ( 0 , caseNum ) ;
      index ++ ;
      double [ ] probs = new double [ A ] ;
      for ( int i = 1 ;
      i < probs . length ;
      i ++ ) probs [ i ] = Double . parseDouble ( probStr . substring ( i + 1 ) ) ;
      if ( probs . length != A ) {
        System . out . println ( "WRONG LENGTH" ) ;
        System . exit ( 1 ) ;
      }
      int finishStrokes = calcFinish ( A , B , probs ) ;
      int enterStrokes = calcEnter ( A , B , probs ) ;
      int [ ] numBackspaces = new int [ A ] ;
      for ( int n = 1 ;
      n < A ;
      n ++ ) numBackspaces [ n ] = calcBackspaces ( A , B , n , probs ) ;
      System . out . println ( " Case