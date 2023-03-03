@ VisibleForTesting static String print ( ) {
  final int MAXN = 14 ;
  final int tests = Integer . parseInt ( input ( ) ) ;
  final Map < Character , String > src = new HashMap < Character , String > ( ) ;
  final char [ ] chars = new char [ ] {
    'R' , 'P' , 'S' }
    ;
    final HashMap < Character , String > nxt = new HashMap < Character , String > ( ) ;
    for ( char ch : chars ) {
      src . put ( new Character ( ch ) , ch ) ;
    }
    for ( int i = 2 ;
    i <= MAXN ;
    i ++ ) {
      for ( char ch : chars ) {
        String s1 = src . get ( new Character ( ch ) , i - 1 ) ;
        String s2 = src . get ( new Character ( nxt . get ( ch ) ) , i - 1 ) ;
        String s = "" ;
        if ( s1 . compareTo ( s2 ) < 0 ) s = s1 + s2 ;
        else s = s2 + s1 ;
        src . put ( new Character ( ch ) , s ) ;
      }
    }
    final Map < Character , Integer > count = new HashMap < Character , Integer > ( ) ;
    for ( int i = 1 ;
    i <= MAXN ;
    i ++ ) {
      for ( char ch : chars ) {
        String s = src . get ( new Character ( ch ) , i ) ;
        count . put ( new Character ( ch ) , new Integer ( s . indexOf ( chars [ i ] ) ) ) ;
      }
    }
    for ( int test = 0 ;
    test < tests ;
    test ++ ) {
      int n = Integer . parseInt ( input ( ) ) ;
      int r = Integer . parseInt ( input ( ) ) ;
      int p = Integer . parseInt ( input ) ;
      int s = Integer . parseInt ( input ) ;
      n ++ ;
      String ans = "Z" ;
      for ( char ch : chars ) {
        if ( count . get ( new Character ( ch ) ) == new Integer ( r ) ) {
          if ( src . get ( new Character ( ch ) ) . compareTo ( ans ) < 0 ) ans = src . get ( new Character ( ch ) ) ;
        }
      }
      if ( ans . equals ( "Z" ) ) ans = "IMPOSSIBLE" ;
      System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
    }
    return ans ;
  }
  