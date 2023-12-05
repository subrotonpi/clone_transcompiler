public static void input ( Scanner in ) {
  String s = in . next ( ) + "2" ;
  String p = in . next ( ) ;
  int [ ] a = new int [ p . length ( ) ] ;
  a [ 0 ] = 0 ;
  int i = 0 ;
  int d = 1 ;
  while ( i < p . length ( ) ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      if ( a [ a . length - 1 ] == 0 ) d *= 6 ;
      if ( a [ a . length - 1 ] == 1 ) d *= 2 ;
      if ( a [ a . length - 1 ] == 2 ) d *= 3 ;
      a [ a . length - 1 ] ++ ;
    }
  }
}
