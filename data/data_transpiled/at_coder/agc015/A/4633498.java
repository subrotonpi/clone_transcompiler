public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N == 1 && A != B ) || A > B ) {
    System . out . println ( "0" ) ;
  }
  else {
    System . out . println ( Integer . toString ( ( N - 2 ) * ( B - A ) + 1 ) ) ;
  }
  return N ;
}
