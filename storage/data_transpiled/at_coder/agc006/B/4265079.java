public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( "Yes" ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  if ( X == 1 || X == 2 * N - 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( "Yes" ) ;
  List ans ;
  if ( N == X ) {
    ans = Collections . singletonList ( 1 ) ;
  }
  else {
    return N ;
  }
}
