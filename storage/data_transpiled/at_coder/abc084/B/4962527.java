public static int A = Integer . parseInt ( input ) {
  int i , S ;
  boolean flag = false ;
  for ( i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i != A && ( ( ( int ) S . charAt ( i ) - '0' ) < 0 || 9 < ( ( int ) S . charAt ( i ) - '0' ) ) ) break ;
    if ( i == A && S . charAt ( i ) != '-' ) break ;
    if ( i == S . length ( ) - 1 ) flag = true ;
  }
  if ( flag ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return i ;
}
