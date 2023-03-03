static final int factorial ( ) {
  int N = Math . factorial ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 1 ;
  int M = 10 * 9 + 7 ;
  int cnt = 1 ;
  for ( int i = 2 ;
  i < 1001 ;
  i ++ ) {
    while ( N % i == 0 ) {
      cnt ++ ;
      N = N / i ;
    }
    ans = ans * cnt ;
    i ++ ;
    cnt = 1 ;
  }
  System . out . println ( ans % M ) ;
  return M ;
}
