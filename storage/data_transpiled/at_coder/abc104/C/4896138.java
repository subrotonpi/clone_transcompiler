public static final int maxRank ( ) {
  int maxRank = Integer . parseInt ( input ( ) ) ;
  int targetScore = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> problems = new ArrayList < > ( ) ;
  int minProblemsCount = 0 ;
  for ( int i = 0 ;
  i < maxRank ;
  i ++ ) {
    problems . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
    minProblemsCount += problems . get ( i ) . intValue ( ) ;
  }
  /* Calculate score */
  int score = 0 ;
  for ( int i = 0 ;
  i < maxRank ;
  i ++ ) {
    if ( answerStatus . get ( i ) . equals ( "1" ) ) {
      score += ( problems . get ( i ) . intValue ( ) * 100 * ( i + 1 ) + problems . get ( i ) . intValue ( ) ) ;
    }
  }
  /* Calculate count */
  int count = 0 ;
  for ( int i = 0 ;
  i < maxRank ;
  i ++ ) {
    if ( answerStatus . get ( i ) . equals ( "1" ) ) {
      count += problems . get ( i ) . intValue ( ) ;
    }
  }
  if ( className . equals ( "org.eclipse.jdt.core.dom.TextAnnotation" ) ) {
    for ( int i = 0 ;
    i < 2 * maxRank ;
    i ++ ) {
      boolean isClear = true ;
      String answerStatus = String . valueOf ( format ( i , "b" ) ) . replaceAll ( "\\s+" , " " ) ;
      int score = answer ( answerStatus ) ;
      int count = answer ( answerStatus ) ;
      if ( score < targetScore ) {
        isClear = false ;
        int shortageScore = targetScore - score ;
        List < Integer > minCounts = new ArrayList < > ( ) ;
        for ( int j = 0 ;
        j < maxRank ;
        j ++ ) {
          if ( answerStatus . get ( j ) . equals ( "0" ) ) {
            int neededCount = Math . ceil ( shortageScore / ( ( j + 1 ) * 100 ) ) ;
            if ( neededCount <= problems . get ( j ) . intValue ( ) ) {
              minCounts . add ( neededCount ) ;
              isClear = true ;
            }
          }
        }
        if ( isClear ) {
          count += Collections . min ( minCounts ) ;
        }
      }
      if ( isClear && count < minProblemsCount ) {
        minProblemsCount = count ;
      }
    }
  }
  