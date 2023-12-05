public static final Reader < String > reader = new Reader < String > ( ) {
  @ Override public int read ( final Reader inFile ) {
    final int dummy = inFile . getInt ( ) ;
    return inFile . getWords ( ) ;
  }
  @ Override public boolean valid ( final String [ ] input ) {
    final Set < String > c = new HashSet < String > ( ) ;
    String p = "|" ;
    for ( final String k : input ) {
      if ( c . contains ( k ) && p . length ( ) != 0 ) return false ;
      c . add ( k ) ;
      p = k ;
    }
    return true ;
  }
  @ Override public int solver ( final String [ ] words ) {
    if ( Arrays . stream ( words ) . filter ( z -> ! valid ( z ) ) . count ( ) == 0 ) return 0 ;
    int ans = 1 ;
    for ( final char c : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
      final int n = words . length ;
      final List < String > e = new ArrayList < String > ( ) ;
      for ( final String w : xrange ( n ) ) {
        if ( w . charAt ( w . length ( ) - 1 ) == c && w . charAt ( 0 ) != c ) {
          e . add ( w ) ;
        }
      }
      final List < String > b = new ArrayList < String > ( ) ;
      for ( final String w : xrange ( n ) ) {
        if ( w . charAt ( 0 ) == c && w . charAt ( w . length ( ) - 1 ) != c ) {
          b . add ( w ) ;
        }
      }
      final List < String > m = new ArrayList < String > ( ) ;
      for ( final String w : xrange ( n ) ) {
        if ( w . charAt ( 0 ) == c && w . charAt ( w . length ( ) - 1 ) != c ) {
          m . add ( w ) ;
        }
      }
      final List < String > a = new ArrayList < String > ( ) ;
      for ( final String w : xrange ( n ) ) {
        if ( Arrays . stream ( w ) . filter ( k -> k . length ( ) != 0 ) . count ( ) == 0 ) {
          if ( e . size ( ) + b . size ( ) + m . size ( ) + a . size ( ) >= 2 ) return 0 ;
        }
      }
      if ( e . size ( ) + b . size ( ) + a . size ( ) >= 1 ) {
        final List < String > woth = new ArrayList <