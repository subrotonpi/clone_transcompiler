public static void input ( ) {
  Scanner s = new Scanner ( System . in ) ;
  StringBuilder t = new StringBuilder ( ) ;
  int cnt = 0 ;
  while ( s . hasNext ( ) ) {
    char a = s . next ( ) ;
    t . append ( a ) ;
    cnt ++ ;
    if ( cnt >= 2 ) {
      if ( t . charAt ( t . length ( ) - 2 ) == 'S' && t . charAt ( t . length ( ) - 1 ) == 'T' ) {
        cnt -= 2 ;
        for ( int i = 0 ;
        i < 2 ;
        i ++ ) {
          t . deleteCharAt ( t . length ( ) - 1 ) ;
        }
      }
    }
  }
  System . out . println ( cnt ) ;
}
