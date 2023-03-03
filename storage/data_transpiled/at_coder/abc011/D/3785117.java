static final int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] Combi = new int [ N + 1 ] [ N + 1 ] ;
  Combi [ 0 ] = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    Combi [ i ] [ i ] = 1 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      Combi [ i ] [ i ] = Combi [ i - 1 ] [ j ] + Combi [ i - 1 ] [ j + 1 ] ;
    }
    Combi [ i ] [ i ] = 0 ;
  }
  if ( X % D != 0 || Y % D != 0 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  int x = Math . abs ( X / D ) ;
  int y = Math . abs ( Y / D ) ;
  int ANS = 0 ;
  for ( int r = 0 ;
  r < N + 1 ;
  r ++ ) {
    int l = r - x ;
    if ( l < 0 ) continue ;
    for ( int u = 0 ;
    u < N - r - l ;
    u ++ ) {
      int d = u - y ;
      if ( d < 0 ) continue ;
      if ( r + l + u + d == N ) ANS += Combi [ N ] [ r ] [ r ] * Combi [ N - r ] [ l ] [ u ] * Combi [ u ] [ u ] ;
    }
  }
  return ANS ;
}
