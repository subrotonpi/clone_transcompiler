public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N % 2 ) == 0 ) {
    System . out . println ( N / 2 ) ;
  }
  else {
    System . out . println ( N / 2 + 1 ) ;
  }
  return N ;
}
