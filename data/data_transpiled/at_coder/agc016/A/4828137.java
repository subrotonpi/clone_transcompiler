public static void input ( ) {
  Scanner s = new Scanner ( System . in ) ;
  Set < String > se = new HashSet < String > ( Arrays . asList ( s . nextLine ( ) . split ( "\\s+" ) ) ) ;
  int ans = 10 * 10 ;
  for ( String m : se ) {
    String t = s ;
    int tans = 0 ;
    for ( int i = 0 ;
    i < s . nextLine ( ) . length ( ) ;
    i ++ ) {
      if ( new HashSet < String > ( Arrays . asList ( t . split ( "\\s+" ) ) ) . size ( ) == 1 && t . contains ( m ) ) break ;
      String tt = "" ;
      for ( int j = 0 ;
      j < t . length ( ) - 1 ;
      j ++ ) {
        if ( t . charAt ( j ) == m || t . charAt ( j + 1 ) == m ) tt += m ;
        else tt += t . charAt ( j ) ;
      }
      tans ++ ;
      t = tt ;
    }
    ans = Math . min ( ans , tans ) ;
  }
  System . out . println ( ans ) ;
}
