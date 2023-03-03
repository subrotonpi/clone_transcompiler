public static int N = Integer . parseInt ( input ) {
  X -- ;
  LinkedList < Integer > H = new LinkedList < Integer > ( ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
  }
  HashSet < Integer > visited = new HashSet < Integer > ( ) ;
  int ans = 0 ;
  /* dfs(n);*/
  visited . add ( n ) ;
  for ( int e : G [ n ] ) {
    if ( visited . contains ( e ) ) continue ;
    if ( dfs ( e ) ) {
      ans += 2 ;
      H . add ( n ) ;
    }
  }
  return H . get ( n ) ;
}
