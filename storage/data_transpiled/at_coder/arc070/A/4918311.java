static final int input ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = 0 ;
  int t = 0 ;
  if ( ( Math . sqrt ( 8 * x + 1 ) == Math . floor ( Math . sqrt ( 8 * x + 1 ) ) ) ) {
    double a = ( - 1 + Math . sqrt ( 1 + 8 * x ) ) / 2 ;
    System . out . println ( ( int ) a ) ;
  }
  else {
    x = ( - 1 + Math . sqrt ( 1 + 8 * x ) ) / 2 ;
    System . out . println ( ( int ) x + 1 ) ;
  }
  return k ;
}
