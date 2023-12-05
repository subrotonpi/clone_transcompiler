public static String input ( ) {
  int p = X . length ( ) - 1 ;
  while ( p >= 0 ) {
    switch ( X . charAt ( p ) ) {
      case 'o' : case 'k' : case 'u' : p -- ;
      break ;
      case 'h' : if ( p - 1 >= 0 && X . charAt ( p - 1 ) == 'c' ) {
        p -= 2 ;
      }
      else {
        System . out . println ( "NO" ) ;
        exit ( 0 ) ;
      }
      break ;
    }
  }
  System . out . println ( "YES" ) ;
  return "" ;
}
