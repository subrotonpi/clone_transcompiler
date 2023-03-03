static final int solve ( String testCase ) {
  final int N = testCase . length ( ) ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  {
    int longestCycleLength = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int start = i ;
      Set < Integer > visited = new THashSet < Integer > ( ) ;
      int current = start ;
      do {
        current = i ;
      }
      while ( current != start ) ;
      if ( visited . contains ( current ) ) {
        if ( current == start ) {
          int cycleLength = visited . size ( ) ;
          if ( cycleLength > longestCycleLength ) {
            longestCycleLength = cycleLength ;
          }
        }
        break ;
      }
      visited . add ( current ) ;
    }
    return longestCycleLength ;
  }
  {
    final Set < Integer > pairs = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int p = i ;
      final int q = i ;
      if ( b . get ( q ) == p ) {
        pairs . add ( p ) ;
        pairs . add ( q ) ;
      }
    }
    return pairs . size ( ) ;
  }
  {
    final Set < Integer > paired = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int p = i ;
      final int q = i ;
      if ( b . get ( q ) == p ) {
        paired . add ( p ) ;
        paired . add ( q ) ;
      }
    }
    return paired . size ( ) ;
  }
  {
    final Set < Integer > currentGen = pairs . get ( ) ;
    final Set < Integer > anyGen = new HashSet < Integer > ( ) ;
    while ( currentGen . size ( ) > 0 ) {
      final Set < Integer > lastGen = currentGen ;
      currentGen = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int p = i ;
        if ( ! anyGen . contains ( p ) && lastGen . contains ( b . get ( p ) ) ) {
          lastGen . remove ( b . get ( p ) ) ;
          currentGen . add ( p ) ;
          anyGen . add ( p ) ;
        }
      }
    }
    return anyGen . size ( ) ;
  }
  {
    int longestChainLength = 0 ;
    final Set < Integer > l = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i