public static int N = Integer . parseInt ( input ) {
  X -- ;
  LinkedList < Integer > H = new LinkedList < Integer > ( ) ;
  int [ ] [ ] T = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    T [ a ] [ b ] = b ;
    T [ b ] [ a ] = a ;
  }
  boolean [ ] visited = new boolean [ N ] ;
  int ans = 0 ;
  /* dfs(N); */
  visited [ N ] = true ;
  for ( int c : T [ N ] ) {
    if ( visited [ c ] ) continue ;
    if ( dfs ( c ) ) {
      ans += 2 ;
      H . add ( c ) ;
    }
  }
  return H . get ( n ) ;
}
