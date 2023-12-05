public static void Ford_Fulkerson ( ) {
  {
    int N = 0 ;
    boolean [ ] [ ] used = new boolean [ N + 1 ] ;
    int [ ] [ ] G = new int [ N + 1 ] [ N + 1 ] ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      G [ i ] [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      G [ i ] [ i ] = i ;
    }
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( v == i ) {
        continue ;
      }
      used [ i ] = true ;
      for ( int i = 0 ;
      i < N + 1 ;
      i ++ ) {
        if ( v == i ) {
          continue ;
        }
        if ( ( ! used [ i ] ) && G [ v ] [ i ] > 0 ) {
          int d = dfs ( i , t , Math . min ( f , G [ v ] [ i ] ) ) ;
          if ( d > 0 ) {
            G [ v ] [ i ] -= d ;
            G [ v ] [ i ] += d ;
            return ;
          }
        }
      }
    }
  }
  int flow = 0 ;
  while ( true ) {
    F . used = new boolean [ N + 1 ] ;
    int f = F . dfs ( 0 , N , 10 * 9 ) ;
    if ( f == 0 ) {
      break ;
    }
    flow += f ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int G = Integer . parseInt ( input ( ) ) ;
  int E = Integer . parseInt ( input ( ) ) ;
  int [ ] p = new int [ G ] ;
  for ( int i = 0 ;
  i < G ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Ford_Fulkerson F = new Ford_Fulkerson ( N ) ;
  for ( int i = 0 ;
  i < G ;
  i ++ ) {
    F . addEdge ( p [ i ] , N , 1 ) ;
  }
  for ( int i = 0 ;
  i < E ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    F . addEdge ( a , b , 1 ) ;
    F . addEdge ( b , a , 1 ) ;
  }
  System . out . println ( F . maxFlow ( ) ) ;
}
