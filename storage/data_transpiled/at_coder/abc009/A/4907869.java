public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N % 2 ) == 0 ) {
    System . out . println ( ( int ) ( N / 2 ) ) ;
  }
  else {
    System . out . println ( ( int ) ( ( N / 2 ) + 1 ) ) ;
  }
  return N ;
}
