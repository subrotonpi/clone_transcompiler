public static void main ( String s ) {
  String a ;
  if ( s . length ( ) == 2 && s . charAt ( 0 ) == s . charAt ( 1 ) ) System . out . println ( 1 + " " + 2 ) ;
  else {
    for ( int i = 3 ;
    i <= s . length ( ) ;
    i ++ ) {
      a = s . substring ( i - 3 , i ) ;
      if ( new HashSet < > ( Arrays . asList ( a ) ) . size ( ) != 3 ) {
        System . out . println ( i - 2 + " " + i ) ;
        break ;
      }
    }
  }
  else System . out . println ( - 1 + " " + - 1 ) ;
}
