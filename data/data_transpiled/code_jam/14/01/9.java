public static void main ( String input ) {
  T = Integer . parseInt ( input ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    Set < String > s1 = new HashSet < > ( ) , s2 = new HashSet < > ( ) ;
    int a = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      String u = input ;
      if ( i == a - 1 ) s1 . addAll ( Arrays . asList ( u . split ( " " ) ) ) ;
    }
    a = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      String u = input ;
      if ( i == a - 1 ) s2 . addAll ( Arrays . asList ( u . split ( " " ) ) ) ;
    }
    Set < String > r = s1 . stream ( ) . filter ( s -> s . equals ( s2 ) ) . collect ( Collectors . toSet ( ) ) ;
    String z = "" ;
    switch ( r . size ( ) ) {
      case 0 : z = "Volunteer cheated!" ;
      break ;
      case 1 : z = Collections . singleton ( r ) . toString ( ) ;
      break ;
      default : z = "Bad magician!" ;
      break ;
    }
    System . out . println ( "Case #" + t + ": " + z ) ;
  }
}
