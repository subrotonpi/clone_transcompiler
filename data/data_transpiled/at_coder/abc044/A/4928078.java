public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N < K ) {
    System . out . println ( ( int ) ( N * X ) ) ;
  }
  else {
    System . out . println ( ( int ) ( K * X + ( N - K ) * Y ) ) ;
  }
  return N ;
}
