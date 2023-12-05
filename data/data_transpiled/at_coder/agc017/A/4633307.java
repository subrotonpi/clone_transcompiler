public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int P = Integer . parseInt ( input ) ;
  int odds = Integer . parseInt ( input ) % 2 ;
  if ( odds > 0 ) {
    System . out . println ( Integer . toString ( 2 * ( N - 1 ) ) ) ;
  }
  else if ( P == 1 ) {
    System . out . println ( "0" ) ;
  }
  else if ( P == 0 ) {
    System . out . println ( Integer . toString ( 2 * ( N ) ) ) ;
  }
  return P ;
}
