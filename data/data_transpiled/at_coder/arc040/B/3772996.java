public static int N ( int R ) {
  String S = input . nextLine ( ) ;
  int move = 0 ;
  if ( S . lastIndexOf ( "." ) != - 1 ) {
    move = S . lastIndexOf ( "." ) - R + 1 ;
  }
  else {
  }
  if ( move <= 0 ) {
    move = 0 ;
  }
  int c = 0 ;
  int ban = 0 ;
  while ( S . length ( ) != 0 ) {
    if ( S . charAt ( c ) == '.' ) {
      break ;
    }
    else {
      c += S . charAt ( c ) + R ;
      ban ++ ;
    }
  }
  System . out . println ( ban + move ) ;
  return move ;
}
