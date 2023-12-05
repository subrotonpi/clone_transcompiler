static final int [ ] solve ( ) {
  int t = Integer . parseInt ( input ( ) ) ;
  final int ansBase = 10 * 9 + 7 ;
  {
    Set < Character > diffs = new HashSet < > ( ) ;
    for ( char c : input ) {
      diffs . add ( c ) ;
      if ( diffs . size ( ) > 1 ) {
        return null ;
      }
    }
    return word . charAt ( 0 ) ;
  }
  {
    int res = 1 ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      res *= i + 1 ;
      res %= ansBase ;
    }
    return res ;
  }
  {
    Set < String > symbs = new HashSet < > ( ) ;
    for ( String w : input ( ) . split ( " " ) ) {
      Set < String > was = new HashSet < > ( ) ;
      String curW = w . substring ( 0 , w . length ( ) - 1 ) ;
      do {
        if ( was . contains ( curW ) ) {
          return 0 ;
        }
        if ( g . get ( curW ) != null ) {
          curW = g . get ( curW ) . charAt ( 0 ) ;
          noStarts . add ( curW ) ;
        }
      }
      while ( true ) ;
    }
    int numStarts = words . size ( ) - 1 ;
    int res = fact ( numStarts ) ;
    res *= ansBase ;
    return res ;
  }
  {
    Set < String > was = new HashSet < > ( ) ;
    for ( String w : words ) {
      Set < String > was = new HashSet < > ( ) ;
      String curW = w . substring ( 0 , w . length ( ) - 1 ) ;
      assert was . size ( ) == n ;
      int [ ] weight = new int [ was . size ( ) ] ;
      Set < String > wasFull = new HashSet < > ( ) ;
      Set < String > words2 = new ArrayList < > ( ) ;
      for ( String key : was ) {
        if ( isFull ( key ) ) {
          char c = key . charAt ( 0 ) ;
          if ( wasFull . contains ( c ) ) {
            weight [ c ] ++ ;
          }
          else {
            weight [ c ] = 1 ;
            wasFull . add ( c ) ;
            words2 . add ( w ) ;
          }
        }
        else {
          words2 . add ( w ) ;
        }
      }
      words = words2 ;
      int xAns = 1 ;
      for ( String w : weight ) {
        int c = w . charAt ( 0 ) ;
        xAns *= fact ( w ) ;
        x @ @