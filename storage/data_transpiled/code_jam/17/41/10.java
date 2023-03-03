static int maximizeFreshChocolate ( int N , int P , int [ ] groups ) {
  int [ ] remainingGroups = groups ;
  int result = 0 ;
  while ( remainingGroups . length > 0 ) {
    Map < Integer , List < Integer >> optimalSets = new HashMap < > ( ) ;
    Map < Integer , Integer > optimalCounts = new HashMap < > ( ) ;
    for ( int index : xrange ( remainingGroups . length ) ) {
      Map < Integer , List < Integer >> tempOptimalSets = new HashMap < > ( ) ;
      Map < Integer , Integer > tempOptimalCounts = new HashMap < > ( ) ;
      for ( int remainder : optimalCounts . keySet ( ) ) {
        int possibleRemainder = ( remainder + remainingGroups [ index ] ) % P ;
        if ( optimalCounts . get ( possibleRemainder ) + 1 < tempOptimalCounts . getOrDefault ( possibleRemainder , 10 * 18 ) ) {
          tempOptimalSets . put ( possibleRemainder , optimalSets . get ( remainder ) . add ( index ) ) ;
          tempOptimalCounts . put ( possibleRemainder , optimalCounts . getOrDefault ( possibleRemainder ) + 1 ) ;
        }
      }
      tempOptimalSets . put ( remainingGroups [ index ] % P , new ArrayList < > ( index ) ) ;
      tempOptimalCounts . put ( remainingGroups [ index ] % P , 1 ) ;
      for ( int remainder : tempOptimalCounts . keySet ( ) ) {
        if ( tempOptimalCounts . get ( remainder ) < optimalCounts . getOrDefault ( remainder , 10 * 18 ) ) {
          optimalSets . put ( remainder , tempOptimalSets . get ( remainder ) ) ;
          optimalCounts . put ( remainder , tempOptimalCounts . getOrDefault ( remainder ) ) ;
        }
      }
    }
    if ( optimalCounts . containsKey ( 0 ) ) {
      result ++ ;
      remainingGroups = Arrays . copyOf ( remainingGroups , remainingGroups . length ) ;
      for ( int i = 0 ;
      i < remainingGroups . length ;
      i ++ ) {
        Arrays . fill ( remainingGroups , i ) ;
      }
    }
    else {
      return result + 1 ;
    }
  }
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( "../inputs/A-large.in" ) ) ;
    BufferedWriter out = new BufferedWriter ( new FileWriter ( "../outputs/A-large.out" ) ) ;
    int cases = Integer . parseInt ( in . readLine (