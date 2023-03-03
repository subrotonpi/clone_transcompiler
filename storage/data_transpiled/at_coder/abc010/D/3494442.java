public static void Ford_Fulkerson ( ) {
  {
    boolean [ ] used = new boolean [ N + 1 ] ;
    int [ ] [ ] G = new int [ N + 1 ] [ N + 1 ] ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      G [ i ] [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      G [ i ] [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( i == v ) {
        return ;
      }
      used [ i ] = true ;
      for ( int i = 0 ;
      i < N + 1 ;
      i ++ ) {
        if ( i == v ) {
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
  int N = Integer . parseInt ( input ( ) ) ;
  int G = Integer . parseInt ( input ( ) ) ;
  int E = Integer . parseInt ( input ( ) ) ;
  int [ ] p = Lists . newArrayList ( ) ;
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
  }
  int num = 0 ;
  while ( true ) {
    F . used = new boolean [ N + 1 ] ;
    int f = F . dfs ( 0 , N , 10 * 9 ) ;
    if ( f == 0 ) {
      break ;
    }
    num += f ;
  }
  System . out . println ( num ) ;
}
