public static void f ( int n ) {
  int s = input . nextInt ( ) ;
  int t = input . nextInt ( ) ;
  HashMap < Character , HashSet < Integer >> a = new HashMap < Character , HashSet < Integer >> ( ) ;
  for ( int i = 0 ;
  i < s ;
  i ++ ) {
    char c = s [ i ] ;
    char d = t [ i ] ;
    if ( ! a . containsKey ( c ) ) {
      a . put ( c , new HashSet < Integer > ( ) ) ;
    }
    a . get ( c ) . add ( d ) ;
    if ( ! a . containsKey ( d ) ) {
      a . put ( d , new HashSet < Integer > ( ) ) ;
    }
    a . get ( d ) . add ( c ) ;
  }
  {
    int i ;
    if ( a . containsKey ( i ) ) {
      HashSet < Integer > l = a . remove ( i ) ;
      for ( int t : l ) {
        t = t ;
      }
    }
  }
  for ( int i = 0 ;
  i <= 10 ;
  i ++ ) {
    f ( i ) ;
  }
  int c = 1 ;
  while ( a . size ( ) > 0 ) {
    int h = Collections . frequency ( a . keySet ( ) ) . get ( 0 ) ;
    c *= ( 10 - ( h == s || h == t ) ) ;
    f ( h ) ;
  }
  System . out . println ( c ) ;
}
