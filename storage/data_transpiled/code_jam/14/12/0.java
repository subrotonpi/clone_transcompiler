@ Sys public static int [ ] [ ] line ( ) {
  /* Enter the number of lines to print to stdout */
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( T = 1 ;
  T <= T ;
  T ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] V = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) V [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) V [ i ] [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a = Integer . parseInt ( readLine ( ) ) ;
      int b = Integer . parseInt ( readLine ( ) ) ;
      V [ a - 1 ] [ b - 1 ] = new int [ b ] ;
      V [ b - 1 ] [ i ] = new int [ b ] ;
      for ( int i = 0 ;
      i < b ;
      i ++ ) V [ i ] [ a ] = new int [ b ] ;
      for ( int i = 0 ;
      i < b ;
      i ++ ) V [ i ] [ b ] = new int [ b ] ;
      for ( int i = 0 ;
      i < b ;
      i ++ ) V [ i ] [ b ] = new int [ b ] ;
      for ( int i = 0 ;
      i < b ;
      i ++ ) Q [ i ] [ b ] = i ;
      int [ ] P = new int [ N ] ;
      P [ b ] = null ;
      for ( int i = 0 ;
      i < Q . length ;
      i ++ ) {
        for ( int j = 0 ;
        j < V [ i ] . length ;
        j ++ ) {
          int v = Q [ i ] [ j ] ;
          for ( int j = 0 ;
          j < u ;
          j ++ ) if ( V [ i ] [ j ] != P [ i ] [ j ] ) {
            Q [ i ] [ j ] = u ;
            P [ i ] [ j ] = v ;
          }
        }
      }
      Collections . reverse ( Q ) ;
      int [ ] [ ] A = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < A . length ;
      i ++ ) A [ i ] = new int [ N ] ;
      for ( int j = 0 ;
      j < Q . length ;
      j