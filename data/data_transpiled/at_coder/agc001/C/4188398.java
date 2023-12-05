static final int [ ] [ ] G ( int u , int uu , int n , int [ ] [ ] G ) {
  int N = ( int ) input ( ) . nextInt ( ) ;
  int K = ( int ) input . nextInt ( ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  int [ ] [ ] E = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int A = ( int ) input . nextInt ( ) ;
    int B = ( int ) input . nextInt ( ) ;
    E [ i ] = new int [ B ] ;
    G [ A - 1 ] [ B - 1 ] = B - 1 ;
    G [ B - 1 ] [ A - 1 ] = B - 1 ;
  }
  {
    int [ ] q = new int [ N ] ;
    q [ 0 ] = u ;
    int [ ] v = new int [ N ] ;
    int [ ] d = new int [ N ] ;
    while ( q . length > 0 ) {
      int u1 = q [ 0 ] ;
      v [ u1 ] = 1 ;
      if ( d [ u1 ] < n ) {
        for ( int u2 : G [ u1 ] ) {
          if ( ! v [ u2 ] ) {
            d [ u2 ] = d [ u1 ] + 1 ;
            q [ 0 ] = u2 ;
          }
        }
      }
    }
  }
  {
    int [ ] q = new int [ N ] ;
    q [ 0 ] = u ;
    q [ 1 ] = uu ;
    int [ ] v = new int [ N ] ;
    int [ ] d = new int [ N ] ;
    while ( q . length > 0 ) {
      int u1 = q [ 0 ] ;
      v [ u1 ] = 1 ;
      if ( d [ u1 ] < n ) {
        for ( int u2 : G [ u1 ] ) {
          if ( ! v [ u2 ] && u2 != u ) {
            d [ u2 ] = d [ u1 ] + 1 ;
            q [ 0 ] = u2 ;
          }
        }
      }
    }
  }
  if ( K % 2 == 0 ) {
    int ans = 0 ;
    for ( int v = 0 ;
    v < N ;
    v ++ ) ans = Math . max ( ans , DFS ( v , K / 2 , G ) ) ;
    System . out . println ( N - ans ) ;
  }
  else {
    int ans = 0 ;
    for ( int u = 0 ;
    u < N ;
    u ++ ) ans = Math . max ( ans , DFS_E (