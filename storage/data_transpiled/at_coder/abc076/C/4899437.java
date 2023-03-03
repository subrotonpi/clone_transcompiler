public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  int last = - 1 ;
  for ( int i = 0 ;
  i < S . length ( ) - T . length ( ) + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < T . length ( ) ;
    j ++ ) {
      if ( S . charAt ( i + j ) == T . charAt ( j ) || S . charAt ( i + j ) == '?' ) {
        if ( j == T . length ( ) - 1 ) {
          last = i ;
        }
      }
      else {
        break ;
      }
    }
  }
  if ( last != - 1 ) {
    S = S . substring ( 0 , last ) + T + S . substring ( last + T . length ( ) ) ;
    S = S . replace ( '?' , 'a' ) ;
    System . out . println ( S ) ;
    exit ( ) ;
  }
  System . out . println ( "UNRESTORABLE" ) ;
  return S ;
}
