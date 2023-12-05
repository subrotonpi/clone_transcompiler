static final String getMain ( ) {
  final String [ ] args = new String [ ] {
    "-m" , "--multi" , "turn on multiprocessing" , "store" }
    ;
    final String [ ] result = new String [ args . length ] ;
    final int [ ] ints = new int [ args . length ] ;
    for ( int i = 0 ;
    i < args . length ;
    i ++ ) {
      final int result = solve ( args [ i ] ) ;
      ints [ i ] = Integer . parseInt ( args [ i ] ) ;
    }
    final int [ ] ints = new int [ args . length ] ;
    for ( int i = 0 ;
    i < ints . length ;
    i ++ ) {
      ints [ i ] = Integer . parseInt ( args [ i ] ) ;
      ints [ i ] = Integer . parseInt ( args [ i ] ) ;
    }
    final String [ ] readWords = new String [ args . length ] ;
    for ( int i = 0 ;
    i < args . length ;
    i ++ ) {
      final int numTribes = Integer . parseInt ( args [ i ] ) ;
      final int [ ] [ ] tribes = new int [ numTribes ] [ ] ;
      for ( int j = 0 ;
      j < numTribes ;
      j ++ ) {
        tribes [ j ] = ints [ j ] ;
      }
    }
    final String [ ] [ ] parse = new String [ args . length ] [ args . length ] ;
    final Scanner scanner = new Scanner ( System . in ) ;
    final int [ ] [ ] wall = new int [ args . length ] [ args . length ] ;
    int result = 0 ;
    int today = 0 ;
    scanner . useNextLine ( ) ;
    boolean keepGoing = true ;
    while ( keepGoing ) {
      keepGoing = false ;
      final Set < Integer > needsRepair = new HashSet < Integer > ( ) ;
      for ( int e = 0 ;
      e < tribes . length ;
      e ++ ) {
        final int [ ] tribe = tribes [ e ] ;
        final int day = scanner . nextInt ( ) ;
        final int numAttacks = scanner . nextInt ( ) ;
        final int west = scanner . nextInt ( ) ;
        final int east = scanner . nextInt ( ) ;
        final int strength = scanner . nextInt ( ) ;
        final int dayDelta = scanner . nextInt ( ) ;
        final int travelDelta = scanner . nextInt ( ) ;
        final int strengthDelta = scanner . nextInt ( ) ;
        if ( day == today ) {
          succeeds