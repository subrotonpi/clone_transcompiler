public static int D = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N <= 99 ) {
    System . out . println ( ( 100 * D ) * N ) ;
  }
  else {
    System . out . println ( 101 * ( 100 * D ) ) ;
  }
  return N ;
}
