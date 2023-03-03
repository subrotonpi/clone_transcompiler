public static int N ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int move = 0 ;
  if ( S . lastIndexOf ( "." ) != - 1 ) {
    move = Math . max ( 0 , S . lastIndexOf ( "." ) - R + 1 ) ;
  }
  int c = 0 ;
  int ban = 0 ;
  while ( S . length ( ) > c ) {
    if ( S . indexOf ( '.' ) == - 1 ) {
      break ;
    }
    else {
      c += S . length ( ) + R ;
      ban ++ ;
    }
  }
  System . out . println ( ban + move ) ;
  return move ;
}
