private static String solve ( int n , char r , char p , char s ) {
  List < String > poss = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < "RPS" . length ( ) ;
  i ++ ) {
    String m = lex ( i , n ) ;
    char cr = 0 ;
    char cp = 0 ;
    char cs = 0 ;
    for ( int j = 0 ;
    j < m . length ( ) ;
    j ++ ) {
      if ( m . charAt ( j ) == 'R' ) cr ++ ;
      if ( m . charAt ( j ) == 'S' ) cs ++ ;
      if ( m . charAt ( j ) == 'P' ) cp ++ ;
    }
    if ( ( cr == r ) && ( cs == s ) && ( cp == p ) ) {
      poss . add ( m ) ;
    }
  }
  if ( ( poss . size ( ) == 0 ) && ( poss . size ( ) == 0 ) ) {
    return "IMPOSSIBLE" ;
  }
  Map < Character , String > beats = new HashMap < Character , String > ( ) ;
  beats . put ( 'R' , 'S' ) ;
  beats . put ( 'S' , 'P' ) ;
  beats . put ( 'P' , 'P' ) ;
  /* if (n == 0) return c; */
  String p1 = lex ( c , n - 1 ) ;
  String p2 = lex ( beats . get ( c ) , n - 1 ) ;
  if ( p1 . compareTo ( p2 ) < 0 ) {
    return p1 + p2 ;
  }
  return p2 + p1 ;
}
