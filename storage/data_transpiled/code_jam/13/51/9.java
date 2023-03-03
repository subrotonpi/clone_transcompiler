static final void debug ( String ... args ) {
  System . err . println ( args ) ;
  /* We need to print the message */
  int baseCost = 0 ;
  int baseGain = 0 ;
  int width = 0 ;
  for ( int n : numbers ) {
    if ( n <= level ) {
      baseCost += level - n ;
      width ++ ;
    }
  }
  if ( baseCost > money ) {
    return ;
  }
  if ( width == 0 ) {
    return ;
  }
  baseGain = baseCost ;
  int baseScore = baseGain * ( 36 / width ) - baseCost ;
  List < Integer > scores = new ArrayList < > ( ) ;
  scores . add ( baseScore ) ;
  for ( int n : new ArrayList < > ( Arrays . asList ( numbers ) ) ) {
    if ( n <= level ) {
      baseCost ++ ;
      if ( baseCost > money ) {
        break ;
      }
      width -- ;
      if ( width == 0 ) {
        break ;
      }
      baseGain -= ( level - n ) ;
      int score = baseGain * ( 36 / width ) - baseCost ;
      scores . add ( score ) ;
    }
  }
  /* We need to print the number */
  Scanner fin = new Scanner ( System . in ) ;
  int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int B = Integer . parseInt ( fin . nextLine ( ) ) ;
    int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    List < Integer > numbers = new LinkedList < > ( Arrays . asList ( numbers ) ) ;
    for ( int n : numbers ) {
      numbers . add ( n ) ;
    }
    numbers . add ( 0 ) ;
    numbers . add ( N ) ;
    Arrays . sort ( numbers ) ;
    scores . clear ( ) ;
    for ( int n : numbers ) {
      scores . add ( bestLevelScore ( n , numbers , B ) ) ;
      if ( n > 0 ) {
        scores . add ( bestLevelScore ( n - 1 , numbers , B ) ) ;
      }
    }
    width = 0 ;
    int underwater = 0 ;
    for ( int n : numbers ) {
      if ( width > 0 ) {
        int fill = ( B + underwater ) / width ;
        scores . add ( bestLevelScore ( fill , numbers , B ) ) ;
        scores . add ( bestLevelScore ( fill + 1 , numbers , B ) ) ;
        if ( fill > 0 ) {
          scores . add ( bestLevelScore