public static int Q = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Math . min ( 4 * Q , 2 * H , S ) ;
  if ( 2 * C <= D ) {
    System . out . println ( N * C ) ;
  }
  else if ( N % 2 == 0 ) {
    System . out . println ( N * D / 2 ) ;
  }
  else {
    System . out . println ( ( N / 2 ) * D + C ) ;
  }
  return N ;
}
