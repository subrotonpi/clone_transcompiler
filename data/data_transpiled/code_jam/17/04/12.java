static final String solve ( String [ ] startwith , String [ ] constraints , int N ) throws IOException {
  Set < Integer > available = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < xrange ( N ) ;
  i ++ ) available . add ( new Integer ( i ) ) ;
  Map < String , Integer > cLeft = new HashMap < String , Integer > ( ) ;
  Map < String , Integer > constraintsBy = new HashMap < String , Integer > ( ) ;
  for ( String c : constraints ) {
    cLeft . put ( c , c . length ( ) ) ;
    for ( String el : c ) constraintsBy . computeIfAbsent ( el , k -> new ArrayList < String > ( ) ) . add ( c ) ;
  }
  {
    Set < String > useOs = useOs . stream ( ) . map ( p -> p . substring ( 0 , p . length ( ) - 1 ) ) . collect ( Collectors . toSet ( ) ) ;
    Set < String > useXs = useOs . stream ( ) . map ( p -> p . substring ( 0 , p . length ( ) - 1 ) ) . collect ( Collectors . toSet ( ) ) ;
    Set < String > useOs = useXs . stream ( ) . map ( p -> p . substring ( 0 , p . length ( ) - 1 ) ) . collect ( Collectors . toSet ( ) ) ;
    Set < String > pluses = useOs . stream ( ) . map ( p -> p . substring ( 0 , p . length ( ) - 1 ) ) . collect ( Collectors . toSet ( ) ) ;
    for ( String el : cells ) {
      if ( available . contains ( el ) ) {
        available . remove ( el ) ;
        for ( String c2 : constraintsBy . get ( el ) ) cLeft . put ( c2 , 1 ) ;
      }
    }
  }
  for ( String p : startwith ) use ( p ) ;
  List < String > rtn = new ArrayList < String > ( ) ;
  while ( available . size ( ) > 0 ) {
    String best = null ;
    int bestScore = 100000 ;
    for ( Map . Entry < String , Integer > c : cLeft . entrySet ( ) ) {
      if ( c . getValue ( ) . compareTo ( bestScore ) > 0 && c . getValue ( ) . compareTo ( "-" ) < 0 ) {
        bestScore = c . getValue ( ) . compareTo ( "-" ) ;
      }
    }
    assert best != null ;
    rtn