public static int N = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int K = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int X = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int Y = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int a ;
  if ( N <= K ) {
    a = N * X ;
    System . out . println ( a ) ;
  }
  else {
    a = K * X + ( N - K ) * Y ;
    System . out . println ( a ) ;
  }
  return a ;
}
