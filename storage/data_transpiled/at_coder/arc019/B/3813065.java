public static void input ( Scanner in ) {
  int difCount = 0 ;
  for ( int i = 0 ;
  i < A . length ( ) / 2 ;
  i ++ ) {
    int a = in . nextInt ( ) ;
    int b = in . nextInt ( ) ;
    if ( a != b ) {
      difCount ++ ;
    }
  }
  switch ( difCount ) {
    case 0 : System . out . println ( 25 * ( in . nextInt ( ) / 2 * 2 ) ) ;
    break ;
    case 1 : System . out . println ( 25 * in . nextInt ( ) - 2 ) ;
    break ;
    default : System . out . println ( 25 * in . nextInt ( ) ) ;
    break ;
  }
}
