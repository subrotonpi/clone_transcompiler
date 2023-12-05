static final Scanner in = new Scanner ( System . in ) {
  private int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int x = 1 , y = 0 ;
  while ( true ) {
    if ( ( ( Integer . toString ( Integer . parseInt ( String . valueOf ( N ) ) ) - y ) % 2 ) == 1 ) x = 2 * x + 1 ;
    else x = 2 * x ;
    if ( ( x > N ) && ( y == 1 ) ) {
      System . out . println ( "Takahashi" ) ;
    }
    else {
      System . out . println ( "Aoki" ) ;
    }
    break ;
  }
  y ^= 1 ;
}
