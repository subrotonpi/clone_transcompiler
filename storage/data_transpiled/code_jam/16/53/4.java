@ SafeVarargs public static void heapq ( ) {
  for ( int testCase = 1 ;
  testCase <= input . length ( ) ;
  testCase ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int S = Integer . parseInt ( readLine ( ) ) ;
    int [ ] pos = new int [ N ] ;
    int [ ] vel = new int [ N ] ;
    for ( ;
    ;
    ) {
      int a = Integer . parseInt ( readLine ( ) ) ;
      int b = Integer . parseInt ( readLine ( ) ) ;
      int c = Integer . parseInt ( readLine ( ) ) ;
      int d = Integer . parseInt ( readLine ( ) ) ;
      int e = Integer . parseInt ( readLine ( ) ) ;
      int f = Integer . parseInt ( readLine ( ) ) ;
      pos [ i ] = new int [ ] {
        a , b , c }
        ;
        vel [ i ] = new int [ ] {
          d , e , f }
          ;
        }
      }
      int [ ] [ ] G = new int [ N ] [ N ] ;
      int [ ] V = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        for ( int j = i + 1 ;
        j < N ;
        j ++ ) {
          G [ i ] [ j ] = new int [ N ] ;
          G [ i ] [ j ] = 0 ;
          V [ i ] = 1 ;
        }
      }
      PriorityQueue < int [ ] > queue = new PriorityQueue < > ( ) ;
      for ( int [ ] x : G [ 0 ] ) {
        heapq ( queue , x ) ;
      }
      V [ 0 ] = 1 ;
      while ( true ) {
        int a = heapq ( queue , V ) ;
        int b = heapq ( queue , V ) ;
        if ( V [ b ] > 0 ) continue ;
        V [ b ] = 1 ;
        if ( b == 1 ) {
          ans = a ;
          break ;
        }
        for ( int [ ] x : G [ b ] ) {
          heapq ( queue , Math . max ( a , x [ 0 ] ) , x [ 1 ] ) ;
        }
      }
      System . out . println ( "Case #" + testCase + ":" ) ;
      System . out . println ( String . format ( "%.10f" , ans * 0.5 ) ) ;
    }
    