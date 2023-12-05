public static String input ( ) {
  boolean flag = false ;
  for ( int i = 97 ;
  i <= 97 ;
  i ++ ) {
    char c = ( char ) i ;
    if ( ! S . contains ( c ) ) {
      System . out . println ( c ) ;
      flag = true ;
      break ;
    }
  }
  if ( ! flag ) System . out . println ( "None" ) ;
  return null ;
}
