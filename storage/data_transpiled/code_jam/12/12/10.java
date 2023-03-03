@ VisibleForTesting static int solve ( int levelCount , int [ ] a , int [ ] b ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int testCases = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  final int minTimes = solve ( levelCount , a , b ) ;
  if ( minTimes == 0 ) {
    System . out . println ( "Case #" + ( testClass + 1 ) + ": Too Bad" ) ;
  }
  else {
    System . out . println ( "Case #" + ( testClass + 1 ) + ": " + minTimes ) ;
  }
  final Map < Integer , Integer > avalToIndices = new HashMap < > ( ) ;
  final Map < Integer , Integer > bvalToIndices = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < levelCount ;
  i ++ ) {
    avalToIndices . put ( a [ i ] , i ) ;
    bvalToIndices . put ( b [ i ] , i ) ;
  }
  int previousStars = - 1 ;
  int stars = 0 ;
  final int [ ] starsForLevel = new int [ levelCount ] ;
  for ( int i = 0 ;
  i < levelCount ;
  i ++ ) {
    starsForLevel [ i ] = 0 ;
  }
  final Set < Integer > availableTwoStars = new HashSet < > ( ) ;
  final Set < Integer > finishablePartComplete = new HashSet < > ( ) ;
  final List < Integer > availableOneStars = new ArrayList < > ( ) ;
  int playCount = 0 ;
  while ( stars != 2 * levelCount ) {
    while ( previousStars != stars ) {
      previousStars ++ ;
      for ( int i : bvalToIndices . get ( previousStars ) ) {
        if ( starsForLevel [ i ] == 0 ) {
          availableTwoStars . add ( i ) ;
        }
        else {
          finishablePartComplete . add ( i ) ;
        }
      }
      for ( int i : avalToIndices . get ( previousStars ) ) {
        heapSort ( availableOneStars , - b . get ( i ) ) ;
      }
    }
    if ( availableTwoStars . size ( ) > 0 ) {
      final int twoStarIndex = availableTwoStars . remove ( 0 ) ;
      stars += 2 ;
      assert starsForLevel [ twoStarIndex ] == 0 ;
      starsForLevel [ twoStarIndex ] = 2 ;
    }
    