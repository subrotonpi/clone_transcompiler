public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  if ( N <= K ) {
    System . out . println ( N * X ) ;
  }
  else {
    System . out . println ( K * X + ( N - K ) * Y ) ;
  }
}
