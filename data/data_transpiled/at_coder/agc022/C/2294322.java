public static int inpl ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = inpl ( ) ;
  int [ ] B = inpl ( ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    int b = A [ a ] ;
    if ( a < b ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  int M = Math . max ( Math . max ( A , B ) , N ) ;
  int [ ] S = new int [ M + 1 ] ;
  for ( int i = 1 ;
  i <= M ;
  i ++ ) {
    S [ i ] = i ;
  }
  int T = S . length ;
  {
    boolean [ ] visited = new boolean [ M + 1 ] ;
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( a ) ;
    while ( Q . size ( ) > 0 ) {
      int p = Q . poll ( ) ;
      if ( visited [ p ] ) continue ;
      else {
        visited [ p ] = true ;
        for ( int q : G [ p ] ) {
          if ( q == b ) return true ;
          if ( ! visited [ q ] ) Q . add ( q ) ;
        }
      }
    }
    {
      return false ;
    }
  }
  boolean found = false ;
  for ( int i = M ;
  i > 0 ;
  i -- ) {
    -- S [ S . indexOf ( i ) ] ;
    Set < Integer > G = new HashSet < Integer > ( ) ;
    for ( int j = 1 ;
    j <= M ;
    j ++ ) {
      for ( int s : S ) {
        G . add ( j % s ) ;
      }
    }
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      int b = B [ i ] ;
      if ( a == b ) continue ;
      if ( ! dfs ( a , b , G ) ) {
        S [ S . indexOf ( i ) ] = i ;
        break ;
      }
    }
  }
  int ans = 0 ;
  for ( int s : S ) ans += 2 * s ;
  if ( found ) System . out . println ( ans ) ;
  else System . out . println ( - 1 ) ;
  return ans ;
}
