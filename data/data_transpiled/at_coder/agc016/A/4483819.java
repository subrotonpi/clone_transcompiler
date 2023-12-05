public static void main ( String [ ] args ) {
  String s = input . nextLine ( ) ;
  if ( new HashSet < > ( s ) . size ( ) == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  char [ ] alphabets = new char [ 26 ] ;
  for ( int i = 0 ;
  i < alphabets . length ;
  i ++ ) {
    alphabets [ i ] = ( char ) ( 'a' + i ) ;
  }
  double ans = Double . MAX_VALUE ;
  for ( char alphabet : alphabets ) {
    String t = s ;
    int count = 0 ;
    while ( t . length ( ) >= 2 ) {
      StringBuffer tDash = new StringBuffer ( ) ;
      for ( int i = 0 ;
      i < t . length ( ) - 1 ;
      i ++ ) {
        if ( t . charAt ( i ) == alphabet || t . charAt ( i + 1 ) == alphabet ) {
          tDash . append ( alphabet ) ;
        }
        else {
          tDash . append ( t . charAt ( i ) ) ;
        }
      }
      count ++ ;
      t = tDash . toString ( ) ;
      if ( new HashSet < > ( tDash . toString ( ) ) . size ( ) == 1 ) {
        break ;
      }
    }
    ans = Math . min ( ans , count ) ;
  }
  System . out . println ( ans ) ;
}
