public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  Map < Character , Integer > dc = new HashMap < > ( ) ;
  dc . put ( 'A' , 0 ) ;
  dc . put ( 'B' , 1 ) ;
  dc . put ( 'C' , 2 ) ;
  dc . put ( '?' , 3 ) ;
  int [ ] [ ] dp = new int [ 4 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] [ 0 ] = 1 ;
  }
  int mo = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int t = 0 ;
    t < 4 ;
    t ++ ) {
      char ch = s . charAt ( i ) ;
      int m = dc . get ( ch ) == t - 1 || dc . get ( ch ) == 3 ? 1 : 0 ;
      if ( t != 0 ) {
        dp [ i + 1 ] [ t ] += ( dp [ i ] [ t - 1 ] * m ) % mo ;
      }
      dp [ i + 1 ] [ t ] += ( dp [ i ] [ t ] * ( dc . get ( ch ) == 3 ? 3 : 1 ) ) % mo ;
    }
  }
  int ans = dp [ n ] [ 3 ] ;
  System . out . println ( ans % mo ) ;
}
