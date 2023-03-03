public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    if ( A == B ) System . out . println ( 1 ) ;
    else System . out . println ( 0 ) ;
  }
  else {
    if ( A > B ) System . out . println ( 0 ) ;
    else if ( A == B || N == 2 ) System . out . println ( 1 ) ;
    else System . out . println ( ( B - A ) * ( N - 2 ) + 1 ) ;
  }
  return N ;
}
