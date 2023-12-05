public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (A+B-1<=N&&N<=A*B) {
  if A = 1
  return Arrays.copyOfRange(N, 0, N);
  }*/
  int [ ] s = new int [ B ] ;
  int q = ( N - B ) / ( A - 1 ) ;
  int r = ( N - B ) % ( A - 1 ) ;
  if ( r == 0 ) {
    q -- ;
    r = A - 1 ;
  }
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = N - i ;
  }
  return s ;
}
