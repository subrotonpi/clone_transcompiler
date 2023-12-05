@ VisibleForTesting static int [ ] [ ] dinicMaxFlow ( int N , int G , int E ) {
  int [ ] [ ] gs = new int [ N + 1 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) gs [ i ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  final int [ ] [ ] es = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < E ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    int b = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    addEdge ( a , b , 1 ) ;
  }
  for ( int g : gs ) addEdge ( g , N , 1 ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  final int [ ] level = new int [ N + 1 ] ;
  final int [ ] iters = new int [ N + 1 ] ;
  {
    int v ;
    int t ;
    {
      int f ;
      level [ v ] = - 1 ;
      Queue < Integer > q = new LinkedList < Integer > ( ) ;
      q . add ( v ) ;
      while ( q . size ( ) > 0 ) {
        v = q . poll ( ) ;
        for ( int i = 0 ;
        i < es [ v ] . length ;
        i ++ ) {
          to = es [ v ] [ i ] [ 0 ] ;
          cap = es [ v ] [ i ] [ 1 ] ;
          rev = es [ v ] [ i ] [ 1 ] ;
          if ( cap > 0 && level [ to ] < 0 ) {
            level [ to ] = level [ v ] + 1 ;
            q . add ( to ) ;
          }
        }
      }
    }
  }
  {
    int v ;
    int t = 0 ;
    int f ;
    while ( true ) {
      v = iters [ v ] ;
      t = iters [ v ] ;
      for ( int i = 0 ;
      i < iters [ v ] && f < N ;
      i ++ ) {
        f = Math . min ( f , INF ) ;
        if ( f <= 0 ) break ;
        f += Math . min ( f , es [ v ] [ i ] [ 1 ] ) ;
      }
    }
  }
  System . out . println ( dinicMaxFlow ( 0 , N ) ) ;
  return iters ;
}
