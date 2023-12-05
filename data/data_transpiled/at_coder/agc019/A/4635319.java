public static int Q = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Math . min ( 4 * Q , 2 * H , S , D / 2 ) ;
  if ( x == ( D / 2 ) ) {
    System . out . println ( ( N / 2 ) * D + ( N % 2 ) * Math . min ( 4 * Q , 2 * H , S ) ) ;
  }
  else {
    System . out . println ( N * x ) ;
  }
  return x ;
}
