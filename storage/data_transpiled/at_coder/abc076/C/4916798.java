public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  int matchedIndex = - 1 ;
  for ( int i = 0 ;
  i < S . length ( ) - T . length ( ) + 1 ;
  i ++ ) {
    String s = S . substring ( i , i + T . length ( ) ) ;
    for ( int j = 0 ;
    j < T . length ( ) ;
    j ++ ) {
      if ( ( s . charAt ( j ) != '?' ) && ( s . charAt ( j ) != T . charAt ( j ) ) ) {
        break ;
      }
    }
    else {
      matchedIndex = i ;
    }
  }
  if ( ( matchedIndex > - 1 ) && ( matchedIndex < S . length ( ) ) ) {
    String outStr = S . substring ( 0 , matchedIndex ) + T + S . substring ( matchedIndex + T . length ( ) ) ;
    outStr = outStr . replace ( "?" , "a" ) ;
    System . out . println ( outStr ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
