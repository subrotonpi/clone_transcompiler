@ GwtIncompatible ( "java.util.regex.Pattern" ) private static int [ ] [ ] parse ( String input ) {
  int t = Integer . parseInt ( input ) ;
  int N = 0 ;
  final int OR = 1 ;
  final int STAR = 2 ;
  {
    Set < String > l = new LinkedHashSet < > ( ) ;
    int i0 = i ;
    while ( i0 < r . length ( ) ) {
      if ( r . charAt ( i0 ) == '|' || r . charAt ( i0 ) == ')' ) {
        return new LinkedHashSet < > ( l ) ;
      }
    }
    if ( r . charAt ( i0 ) == '(' ) {
      for ( String st : sts ) {
        for ( String key : r . substring ( st , st + 1 ) . split ( " " ) ) {
          if ( key . equals ( "|" ) ) {
            w . add ( key . substring ( 1 ) ) ;
          }
        }
      }
    }
    return new LinkedHashSet < > ( l ) ;
  }
  {
    Set < String > l = new LinkedHashSet < > ( ) ;
    Set < String > l = new HashSet < > ( ) ;
    Set < String > l = new HashSet < > ( ) ;
    for ( String st : sts ) {
      l . add ( st ) ;
    }
    String a = l . add ( a ) ;
    String b = l . remove ( b ) ;
    if ( a . length ( ) > 0 ) {
      if ( l . contains ( b ) ) {
        return new LinkedHashSet < > ( l ) ;
      }
    }
    int c = 0 ;
    for ( int i = Integer . parseInt ( a . substring ( 0 , 1 ) ) ;
    i < b . length ( ) ;
    i ++ ) {
      String lo = "0" * ( b . length ( ) - 1 ) ;
      if ( i == Integer . parseInt ( a . substring ( 0 , 1 ) ) ) {
        lo = a . substring ( 1 ) ;
      }
      String hi = "9" * ( b . length ( ) - 1 ) ;
      if ( i == Integer . parseInt ( b . substring ( 0 , 1 ) ) ) {
        hi = b . substring ( 1 ) ;
      }
      l . add ( new Pair < > ( OR , l . toArray ( new String [ l . size ( ) ] ) ) ) ;
    }
    return new LinkedHashSet < > ( l ) ;
  }
  {
    Set < String > l = new LinkedHashSet < > ( ) ;
    Set < String > l = new LinkedHashSet < > ( ) ;
    for ( String st : l ) {
      