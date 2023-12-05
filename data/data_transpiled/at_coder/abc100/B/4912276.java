public static int D = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( D == 0 ) {
    if ( N == 100 ) {
      System . out . println ( 101 ) ;
    }
    else {
      System . out . println ( N ) ;
    }
  }
  else {
    if ( N == 100 ) {
      System . out . println ( ( 100 * D ) * ( N + 1 ) ) ;
    }
    else {
      System . out . println ( ( 100 * D ) * N ) ;
    }
  }
  return N ;
}
