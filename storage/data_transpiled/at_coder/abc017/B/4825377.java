public static String input ( ) {
  String res = "YES" ;
  int i = 0 ;
  while ( i != X . length ( ) ) {
    boolean test = X . charAt ( i ) == 'o' || X . charAt ( i ) == 'k' || X . charAt ( i ) == 'u' ;
    if ( X . charAt ( i ) == 'c' && i != X . length ( ) ) {
      test = X . charAt ( i ) + X . charAt ( i + 1 ) == 'ch' ;
      i ++ ;
    }
    if ( ! test ) {
      res = "NO" ;
      break ;
    }
    i ++ ;
  }
  System . out . println ( res ) ;
  return res ;
}
