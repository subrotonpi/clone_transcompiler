static final String compact ( String s ) throws Exception {
  int i = 0 ;
  while ( i < s . length ( ) - 1 ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      s = s . substring ( 0 , i ) + s . substring ( i + 1 ) ;
    }
    else {
      ++ i ;
    }
  }
  class NotPossible extends Exception {
  }
  final long P = 1000000007 ;
  {
    int mult = 1 ;
    for ( int i : xrange ( 1 , n + 1 ) ) {
      t = ( mult * i ) % P ;
    }
    assert left >= 0 ;
    while ( left > 0 ) {
      mult = ( mult * left ) % P ;
      left = left - 1 ;
    }
    System . out . println ( "Case #" + ( _T + 1 ) + ": " + mult ) ;
  }
  if ( className == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br . readLine ( ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    ++ i ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      String [ ] trains = br . readLine ( ) . split ( " " ) ;
      trains = ArrayUtil . toStringArray ( trains ) ;
      try {
        for ( String s : trains ) {
          if ( s . contains ( s . substring ( 0 , 1 ) ) ) throw new NotPossible ( ) ;
          if ( s . contains ( s . substring ( 1 , s . length ( ) - 1 ) ) ) throw new NotPossible ( ) ;
          for ( int j = 1 ;
          j < s . length ( ) - 1 ;
          ++ j ) {
            int cnt = Ints . checkedCast ( s2 . indexOf ( s , j ) ) ;
            assert cnt >= 1 ;
            if ( cnt != 1 ) throw new NotPossible ( ) ;
          }
        }
      }
    }
    final Map < String , Integer > singles = new HashMap < > ( ) ;
    final List < String > chunks = new ArrayList < > ( ) ;
    for ( int i : xrange ( N ) ) {
      if ( chunks . get ( i ) . length ( ) == 1 ) {
        singles . put ( chunks . get ( i ) , singles . get ( i ) + 1 )