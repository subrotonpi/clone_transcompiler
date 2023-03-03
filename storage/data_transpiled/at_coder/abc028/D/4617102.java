public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = M - 1 ;
  int r = N - M ;
  return ( ( 6 * l * r + 3 * l + 3 * r + 1 ) / N * * 3 ) ;
}
