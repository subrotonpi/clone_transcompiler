@ Sys public static int from ( InputStream in ) throws IOException {
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    int N = Integer . parseInt ( in . readLine ( ) ) ;
    int M = Integer . parseInt ( in . readLine ( ) ) ;
    int origCost = 0 ;
    int [ ] O = new int [ M ] ;
    int [ ] E = new int [ M ] ;
    int [ ] P = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int o = Integer . parseInt ( in . readLine ( ) ) ;
      int e = Integer . parseInt ( in . readLine ( ) ) ;
      int p = Integer . parseInt ( in . readLine ( ) ) ;
      O [ i ] = o ;
      E [ i ] = e ;
      P [ i ] = p ;
      int k = e - o ;
      origCost += ( 2 * N - k + 1 ) * k * p / 2 ;
    }
    int [ ] pts = new int [ ] {
      O [ 0 ] , E [ 0 ] , P [ 1 ] }
      ;
      Arrays . sort ( pts ) ;
      int K = pts . length ;
      int [ ] count = new int [ K ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        for ( int j = 0 ;
        j < K - 1 ;
        j ++ ) {
          if ( pts [ j ] >= O [ i ] && pts [ j + 1 ] <= E [ i ] ) {
            count [ j ] += P [ i ] ;
          }
        }
      }
      int newCost = 0 ;
      while ( Arrays . binarySearch ( count , P ) > 0 ) {
        int a = 0 ;
        while ( count [ a ] == 0 ) a ++ ;
        int b = a ;
        while ( count [ b ] != 0 ) b ++ ;
        int m = Math . min ( count , a , b ) ;
        for ( int j : xrange ( a , b ) ) {
          count [ j ] -= m ;
        }
        int k = pts [ b ] - pts [ a ] ;
        newCost += ( 2 * N - k + 1 ) * k * m / 2 ;
      }
      System . out . printf ( "Case #%d: %d%n" , T , ( origCost - newCost ) % 1000002013 ) ;
    }
  }
  