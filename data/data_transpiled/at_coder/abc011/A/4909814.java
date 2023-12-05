public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 1 <= N && N <= 11 ) {
    System . out . println ( N + 1 ) ;
  }
  else if ( N == 12 ) {
    System . out . println ( 1 ) ;
  }
  return N ;
}
