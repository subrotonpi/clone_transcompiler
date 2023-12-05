public static int [ ] [ ] [ ] G ( int N , int [ ] [ ] G , int E ) {
  int [ ] P = new int [ N + 1 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] R = new int [ N + 1 ] [ N + 1 ] ;
  for ( int j = 0 ;
  j < E ;
  j ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ a ] [ b ] = 1 ;
    R [ b ] [ a ] = 1 ;
  }
  for ( int p : P ) R [ p ] [ N ] = 1 ;
  /* Find path of the graph */
  int [ ] [ ] pre = new int [ G . length ] [ ] ;
  pre [ 0 ] = new int [ G . length ] ;
  pre [ 0 ] [ 0 ] = s ;
  int [ ] Q = new int [ G . length ] ;
  Q [ 0 ] = s ;
  while ( Q . length > 0 ) {
    int q = Q [ 0 ] ;
    Q = Q [ 1 ] ;
    if ( q == t ) break ;
    for ( int adv = 0 ;
    adv < G . length ;
    adv ++ ) {
      if ( G [ q ] [ adv ] > 0 && pre [ adv ] == 0 ) {
        Q [ 0 ] = adv ;
        pre [ adv ] = q ;
      }
    }
  }
  /* For fulkerson */
  while ( true ) {
    int [ ] path = pathFind ( G , s , t ) ;
    if ( path [ t ] != 0 ) {
      int dst = t ;
      int src = path [ t ] ;
      int c = G [ src ] [ dst ] ;
      while ( path [ src ] != src ) {
        dst = src ;
        src = path [ src ] ;
        c = Math . min ( G [ src ] [ dst ] , c ) ;
      }
      dst = t ;
      src = path [ t ] ;
      while ( src != dst ) {
        G [ src ] [ dst ] -= c ;
        G [ dst ] [ src ] += c ;
        dst = src ;
        src = path [ src ] ;
      }
    }
  }
}
