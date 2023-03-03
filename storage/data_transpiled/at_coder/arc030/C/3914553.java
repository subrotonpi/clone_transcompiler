public static void scc ( int N , int [ ] [ ] G , int [ ] [ ] RG ) {
  int [ ] order = new int [ N ] ;
  int [ ] used = new int [ N ] ;
  int [ ] group = new int [ N ] ;
  {
    int [ ] [ ] r0 = new int [ N ] ;
    int [ ] [ ] r0 = new int [ N ] [ N ] ;
    int [ ] [ ] r0 = new int [ N ] [ N ] ;
    int [ ] [ ] r0 = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      r0 [ i ] = G [ i ] [ i ] ;
      if ( ! used [ i ] [ 0 ] ) {
        dfs ( r0 [ i ] ) ;
      }
    }
    order [ i ] = r0 [ i ] ;
  }
  {
    int [ ] [ ] res = new int [ K ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      group [ i ] = R [ i ] ;
      used [ i ] = 1 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( r0 [ j ] >= r [ j ] ) {
          r0 [ j ] = r [ j ] ;
        }
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ! used [ i ] [ 0 ] ) {
        dfs ( i ) ;
      }
    }
    used = new int [ N ] [ N ] ;
    int label = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] s = new int [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        s [ j ] = 0 ;
      }
      int [ ] GP = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int [ ] lbs = group [ i ] ;
        for ( int j = 0 ;
        j < G [ i ] . length ;
        j ++ ) {
          int [ ] w = G [ i ] [ j ] ;
          int lbt = group [ w ] ;
          if ( lbs == lbt ) continue ;
          G0 [ lbs ] . add ( lbt ) ;
        }
        GP [ lbs ] . add ( i ) ;
      }
    }
  }
}
