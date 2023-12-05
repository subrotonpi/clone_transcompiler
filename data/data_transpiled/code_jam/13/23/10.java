public static final Class < ? > memoize = new Class < ? > ( ) {
  private final Function < String , String > function = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return input ;
    }
  }
  ;
  public int apply ( String input ) {
    try {
      return memoized . getInt ( input ) ;
    }
    catch ( IllegalAccessException e ) {
      e . printStackTrace ( ) ;
      return 0 ;
    }
  }
  private int dist ( String w , int minI ) {
    if ( D . contains ( w ) ) return 0 ;
    for ( int i : xrange ( minI , w . length ( ) ) ) {
      for ( char c1 : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
        char [ ] ca = new char [ w . length ( ) ] ;
        Arrays . fill ( ca , c1 ) ;
        String _w = new String ( ca ) ;
        if ( D . contains ( _w ) ) return 1 ;
      }
    }
    for ( int j : xrange ( w . length ( ) ) ) {
      for ( char c2 : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
        if ( j - 5 < minI ) continue ;
        for ( int i : xrange ( j - 5 , - 1 , - 1 ) ) {
          for ( char c1 : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
            char [ ] ca = new char [ w . length ( ) ] ;
            Arrays . fill ( ca , c1 ) ;
            Arrays . fill ( ca , c2 ) ;
            String _w = new String ( ca ) ;
            if ( D . contains ( _w ) ) return 2 ;
          }
        }
      }
    }
    return 3 ;
  }
  private int minChange ( int sIdx , int pModIdx ) {
    if ( sIdx == N ) return 0 ;
    int r = N ;
    for ( int eIdx : xrange ( sIdx , Math . min ( sIdx + 10 , N ) ) ) {
      String w = S . substring ( sIdx , ( eIdx + 1 ) ) ;
      int d = dist ( w , Math . max ( 0 , 5 - ( sIdx - pModIdx ) ) ) ;
      if ( d == 0 ) r = Math . min ( r , minChange ( eIdx + 1 , pModIdx ) ) ;
      if ( d == 1 && ( sIdx + d - pModIdx ) >= 5 ) r = Math . min ( r , minChange ( eIdx + 1 , sIdx + d ) + 1 ) ;
      if ( d == 2 && (