public static int Q ( int H , int S , int D ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  return N / 2 * min ( 8 * Q , 4 * H , 2 * S , D ) + N % 2 * min ( 4 * Q , 2 * H , S ) ;
}
