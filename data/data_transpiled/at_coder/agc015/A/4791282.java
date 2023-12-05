public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) {
    System . out . println ( 0 ) ;
  }
  else if ( N == 1 && A != B ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( B - A ) * ( N - 2 ) + 1 ) ;
  }
  return N ;
}
