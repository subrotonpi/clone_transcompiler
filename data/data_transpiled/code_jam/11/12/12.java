public static int score ( String w , String [ ] l , String [ ] words ) {
  Set < String > used = new HashSet < String > ( ) ;
  int res = 0 ;
  for ( String c : l ) {
    for ( String u : words ) {
      if ( u . equals ( w ) ) continue ;
      if ( u . length ( ) != w . length ( ) ) continue ;
      if ( ! u . contains ( c ) ) continue ;
      for ( int j : xrange ( w . length ( ) ) ) {
        if ( u . charAt ( j ) == w . charAt ( j ) ) continue ;
        if ( used . contains ( u . charAt ( j ) ) || used . contains ( w . charAt ( j ) ) ) break ;
        else {
          if ( ! w . contains ( c ) ) res ++ ;
          break ;
        }
      }
      used . add ( c ) ;
    }
  }
  {
    final int n = Integer . parseInt ( readLine ( ) ) ;
    final int m = Integer . parseInt ( readLine ( ) ) ;
    String [ ] words = new String [ xrange ( n ) ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) words [ i ] = readLine ( ) ;
    List < String > lists = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) lists . add ( readLine ( ) ) ;
    StringBuilder res = new StringBuilder ( ) ;
    for ( String l : lists ) {
      int best = ( - 1 ) , bestw = null ;
      for ( String w : words ) {
        int r = score ( w , l , words ) ;
        if ( r > best ) best = r ;
        bestw = w ;
      }
      res . append ( bestw ) ;
    }
    return res . toString ( ) . length ( ) ;
  }
  public static void run ( ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + readLine ( ) ) ;
  }
}
