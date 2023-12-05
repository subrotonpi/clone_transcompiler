public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N % 1000 ) % 111 == 0 || ( N / 10 ) % 111 == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return N ;
}
