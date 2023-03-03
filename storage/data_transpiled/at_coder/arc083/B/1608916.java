static final int [ ] [ ] G ( ) {
  int N = 0 ;
  if ( StdIn . available ( ) ) {
    N = Integer . parseInt ( StdIn . readLine ( ) ) ;
  }
  else {
    N = Integer . parseInt ( StdIn . readLine ( ) ) ;
  }
  A = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Collections . singletonList ( Integer . parseInt ( StdIn . readLine ( ) ) ) ;
  }
  int [ ] [ ] G = new int [ N ] [ ] ;
  int [ ] G2 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G2 [ i ] = StdIn . read ( ) ;
  }
  int [ ] [ ] G2 = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G2 [ i ] = StdIn . read ( ) ;
  }
  if ( Arrays . equals ( G2 , G2 ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int ans = 0 ;
  G [ G == 0 ? 0 : 1 ] = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int n = StdIn . read ( ) ;
      if ( n > G [ i ] [ j ] ) {
        ans += G [ i ] [ j ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return G ;
}
