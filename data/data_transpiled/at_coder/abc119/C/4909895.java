static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* if (idx == N) {
  if (a == 0 || b == 0 || c == 0) {
  return 1e9;
  }
  }*/
  int x = dfs ( idx + 1 , a , b , c ) ;
  int y = dfs ( idx + 1 , a + L [ idx ] , b , c ) + 10 * ( a != 0 ? 1 : 0 ) ;
  int z = dfs ( idx + 1 , a , b + L [ idx ] , c ) + 10 * ( b != 0 ? 1 : 0 ) ;
  int w = dfs ( idx + 1 , a , b , c + L [ idx ] ) + 10 * ( c != 0 ? 1 : 0 ) ;
  return Math . min ( x , y , z , w ) ;
}
