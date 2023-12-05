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
  HashSet < Integer > V = new HashSet < Integer > ( ) ;
  int ans = 0 ;
  {
    V . add ( n ) ;
    for ( int e : G [ n ] ) {
      if ( V . contains ( e ) ) continue ;
      if ( dfs ( e ) ) {
        ans += 2 ;
        H . addLast ( e ) ;
      }
    }
    int jewelry = H . addLast ( n ) ;
    return jewelry ;
  }
}
